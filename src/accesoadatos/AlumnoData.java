package accesoadatos;

import entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class AlumnoData {

    private Connection con = null;    //no olvidar inicializar en nulo para el singleton

    /*el constructor de esta clase solo va a inicializar el atributo con del tipo Connection a traves del getConection*/
    public AlumnoData() {

        con = Conexion.getConnection();
    }

   
    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNac, estado) "
                + "VALUES(?,?,?,?,1)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            //ps.setBoolean(5, 1);   
            ps.executeUpdate();

            //ps.getGeneratedKeys();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno Guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno" + ex.getMessage());
        }
    }

    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni = ?, apellido=?, nombre=?, fechaNac=? "
                + "WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "2Error al acceder a la tabla alumno" + ex.getMessage());
        }
    }

    public void eliminarAlumno(int idAlumno) {

        try {
            String sql = "UPDATE alumno "
                    + "SET estado = 0 "
                    + "WHERE idAlumno = ? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el alumno.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno" + e);
        }
    }

    public Alumno buscarAlumnoPorID(int idAlumno) {
        String sql = "SELECT dni, apellido, nombre, fechaNac "
                + "FROM alumno "
                + "WHERE idAlumno = ? AND estado = 1";
        Alumno al = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                al = new Alumno();
                al.setIdAlumno(idAlumno);
                al.setDni(rs.getInt("dni"));
                al.setApellido(rs.getString("apellido"));
                al.setNombre(rs.getString("nombre"));
                al.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                al.setActivo(true);                                        //¿esto está bien? ¿No va con el rs)
            } else {
                JOptionPane.showMessageDialog(null, "No existe alumno con ese Id ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno" + ex);

        }
        return al;

    }

    public Alumno buscarAlumnoPorDNI(int dni) {                             //este metodo trae SOLO los alumnos activos
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNac "
                + "FROM alumno "
                + "WHERE dni = ? AND estado = 1";
        Alumno al = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                al = new Alumno();
                al.setDni(dni);
                al.setIdAlumno(rs.getInt("idAlumno"));
                al.setApellido(rs.getString("apellido"));
                al.setNombre(rs.getString("nombre"));
                al.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                al.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "El DNI no corresponde a un alumno activo ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno" + ex.getMessage());

        }
        return al;

    }

    public List<Alumno> ListarAlumnos() {
        String sql = "SELECT idAlumno,dni, apellido, nombre, fechaNac "
                + "FROM alumno "
                + "WHERE estado = 1";
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno al = new Alumno();

                al.setIdAlumno(rs.getInt("idAlumno"));
                al.setDni(rs.getInt("dni"));
                al.setApellido(rs.getString("apellido"));
                al.setNombre(rs.getString("nombre"));
                al.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                al.setActivo(true);

                alumnos.add(al);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return alumnos;
    }
//agregar try-catch
    public void activarAlumno(int id) {

        String sql = "UPDATE alumno "
                + "SET estado = 1 "
                + "WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            ps.close();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se activó el alumno.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la dase de datos: " + ex.getMessage());

        }

    }

    public Alumno buscarTodosAlumnoPorDNI(int dni) {     //este método trae TODOS los alumnos historicos
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNac, estado "
                + "FROM alumno "
                + "WHERE dni = ?";
        Alumno al = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                al = new Alumno();
                al.setDni(dni);
                al.setIdAlumno(rs.getInt("idAlumno"));
                al.setApellido(rs.getString("apellido"));
                al.setNombre(rs.getString("nombre"));
                al.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                al.setActivo(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe alumno con ese DNI ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno" + ex.getMessage());

        }
        return al;

    }

    public Alumno AlumnosInactivosPorDNI(int dni) {
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNac "
                + "FROM alumno "
                + "WHERE dni = ? AND estado = 0";
        Alumno al = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                al = new Alumno();
                al.setDni(dni);
                al.setIdAlumno(rs.getInt("idAlumno"));
                al.setApellido(rs.getString("apellido"));
                al.setNombre(rs.getString("nombre"));
                al.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                al.setActivo(false);
            } else {
                JOptionPane.showMessageDialog(null, "El DNI no corresponde a un alumno inactivo ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno" + ex.getMessage());
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "El campo DNI debe estar completo." + ex.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El campo DNI solo acepta números" + ex.getMessage());
        }
        return al;

    }

}
