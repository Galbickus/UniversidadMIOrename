package accesoadatos;

import entidades.Alumno;
import entidades.Analitico;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Veronica
 */
public class InscripcionData {

    private Connection con = null;
    private AlumnoData ad = new AlumnoData();
    private MateriaData md = new MateriaData();

    /* se declara una variable privada y 
  se inicializa creando una nueva instancia de la clase AlumnoData por esto
  la clase InscripcionData tiene una dependencia de la clase AlumnoData 
  y puede utilizar sus métodos y propiedades a través de esta variable ad.*/
    public InscripcionData() {
        this.con = Conexion.getConnection();
    }

//    public InscripcionData(Connection con, AlumnoData alumnoData, MateriaData materiaData) {
//        this.con = Conexion.getConnection();
//        this.alumnoData = alumnoData;
//        this.materiaData = materiaData;
//    }
    public void guardarInscripcion(Inscripcion inscripcion) {

        String sql = "INSERT INTO inscripcion(idAlumno, idMateria, nota)VALUES(?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            ps.setDouble(3, inscripcion.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                inscripcion.setIdInscripcion(rs.getInt(1)); //el 1 es porque quiero el idInscripcion que está en la columna 1 
                JOptionPane.showMessageDialog(null, "Inscripción realizada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla inscribir");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo inscribir " + ex.getMessage());
        }
    }

    public void actualizarNota(double nota, int idAlumno, int idMateria) {

        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int fila = ps.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Nota actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar nota " + ex.getMessage());
        }
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripcion borrada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla inscripcion");
        }
    }

    /*en SELECT usamos executeQuery que no devuelve un entero, 
    devuelve un resultSet que es como una matriz
    con tantas  columnas como columna tenga la tabla 
    y tantas filas como elementos tenga 
    ( en este caso elementos = inscripciones)*/
    public List<Inscripcion> obtenerInscripciones() {
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alumno = ad.buscarAlumnoPorID(rs.getInt("idAlumno"));
                inscripcion.setAlumno(alumno);
                Materia materia = md.buscarMateriaPorID(rs.getInt("idMateria"));
                inscripcion.setMateria(materia);
                inscripcion.setNota(rs.getDouble("nota"));
                inscripciones.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla inscripcion");
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        ArrayList<Inscripcion> inscripcionPorAlumno = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alumno = ad.buscarAlumnoPorID(rs.getInt("idAlumno"));
                Materia materia = md.buscarMateriaPorID(rs.getInt("idMateria"));
                inscripcion.setAlumno(alumno);
                inscripcion.setMateria(materia);
                inscripcion.setNota(rs.getDouble("nota"));
                inscripcionPorAlumno.add(inscripcion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla inscripcion");

        }
        return inscripcionPorAlumno;
    }

    //como no usamos el JOIN en el WHERE ponemos la condicion de union
    /*"
    SELECT inscripcion.idMateria, materia.nombre, materia.anio 
    FROM inscripcion, materia 
    WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno=?
    "*//////////////////////////////////////////////////////////////////////////////////
    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        ArrayList<Materia> materias = new ArrayList<>();

        String sql = "SELECT inscripcion.idMateria, materia.nombre, materia.anio "
                + "FROM inscripcion, materia "
                + "WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones" + ex);
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNOCursadas(int idAlumno) {
        ArrayList<Materia> materiasDondeNOestaInscripto = new ArrayList<>();
        //Esta que da el profe en el video a mi no me funciona String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        
        String sql = "SELECT * "
                + "FROM materia "
                + "WHERE idMateria "
                + "NOT IN ( SELECT idMateria FROM inscripcion WHERE idAlumno = ? ) " //subconsulta entre parentesis tiene las materias que SI cursa, por eso la negamos
                + "AND estado = 1;";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materiasDondeNOestaInscripto.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones" + ex);
        }
        return materiasDondeNOestaInscripto;
    }

    //hacer un método que reciba el ID de una materia y devuelva la lista de alumnos que al cursan
    public List<Alumno> listarAlumnosPorMateria(int idMateria) {
        ArrayList<Alumno> alumnosInscriptos = new ArrayList<>();
        String sql = "SELECT alumno.* "
                + "FROM alumno JOIN inscripcion "
                + "ON alumno.idAlumno = inscripcion.idAlumno "
                + "WHERE inscripcion.idMateria = ? AND alumno.estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumnoInscripto = new Alumno();
                alumnoInscripto.setIdAlumno(rs.getInt("idAlumno"));
                alumnoInscripto.setDni(rs.getInt("dni"));
                alumnoInscripto.setApellido(rs.getString("apellido"));
                alumnoInscripto.setNombre(rs.getString("nombre"));
                alumnoInscripto.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumnoInscripto.setActivo(rs.getBoolean("estado"));
                alumnosInscriptos.add(alumnoInscripto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: No fue posible acceder a la tabla" + ex.getMessage());
        }
        return alumnosInscriptos;
    }

    public List<Analitico> listarParaGestionDeNotas(int idAlumno) {

        ArrayList<Analitico> analiticos = new ArrayList<>();
        String sql = "SELECT m.idMateria,m.nombre, i.nota "
                + "FROM inscripcion i JOIN materia m "
                + "ON i.idMateria = m.idMateria "
                + "WHERE i.idAlumno = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Analitico analitico = new Analitico();
                analitico.setIdMateria(rs.getInt("idMateria"));
                analitico.setNombre(rs.getString("nombre"));
                analitico.setNota(rs.getDouble("nota"));
                analiticos.add(analitico);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de Datos. " + ex);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El idAlumno debe ser un número. " + ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un alumno de la lista. " + ex);
        }
        return analiticos;
    }

    public boolean modificarNota(Alumno alumno, Materia materia, double nota) {
        boolean modificada = false;
        try {
            String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, alumno.getIdAlumno());
            ps.setInt(3, materia.getIdMateria());
            int rs = ps.executeUpdate();
            if (rs != 0) {
                modificada = true;
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar Nota" + ex.getMessage());
        }
        return modificada;
    }

    public boolean modificarNota2(int idAl, int idMat, double nota) {
        boolean modificada = false;
        try {
            String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAl);
            ps.setInt(3, idMat);
            int rs = ps.executeUpdate();
            if (rs != 0) {
                modificada = true;
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar Nota" + ex.getMessage());
        }
        return modificada;
    }
}
