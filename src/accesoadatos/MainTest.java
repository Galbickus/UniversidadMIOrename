package accesoadatos;

import accesoadatos.Conexion;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.Connection;
import java.time.LocalDate;

/**
 * @author Veronica C.R.U.D.
 */
public class MainTest {

    public static void main(String[] args) {

//PRUEBA CONEXION
// Connection con = Conexion.getConnection();
//**********************************      A L U M N O      ********************************** 
//************************************** METODOS  CRUD **************************************
//                 *****************************************************
//*************************************** C R E A T E ***************************************
//        Alumno a = new Alumno(49787599,"Bach","Richard",LocalDate.of(1990,04, 16),true);
//        AlumnoData ad = new AlumnoData();
//        ad.guardarAlumno(a);
//***************************************   R E A D  *************************************** 
//                                  BUSCAR ALUMNO POR ID
//        AlumnoData ad = new AlumnoData();
//        ad.buscarAlumnoPorID(3);
//        Alumno alumnoEncontrado = ad.buscarAlumnoPorID(3);
//        if(alumnoEncontrado!=null){
//        System.out.println("DNI: "+alumnoEncontrado.getDni());
//        System.out.println("Apellido: "+alumnoEncontrado.getApellido());
//        System.out.println("Nombre: "+alumnoEncontrado.getNombre());
//        }
//                                  BUSCAR ALUMNO POR D.N.I.
//        AlumnoData ad = new AlumnoData();
//        Alumno alumnoEncontrado = ad.buscarAlumnoPorDNI(45784522);
//        if (alumnoEncontrado != null) {
//        System.out.println("ID: " + alumnoEncontrado.getIdAlumno());
//        System.out.println("Apellido: " + alumnoEncontrado.getApellido());
//        System.out.println("Nombre: " + alumnoEncontrado.getNombre());
//        System.out.println("Fecha de nacimiento: " + alumnoEncontrado.getFechaNac());
//        }
//                                          LISTA
//        AlumnoData ad = new AlumnoData();
//        for(Alumno alumno:ad.ListarAlumnos()){
//        System.out.println(alumno.getIdAlumno());
//        System.out.println(alumno.getDni());
//        System.out.println(alumno.getApellido());
//        System.out.println(alumno.getNombre());
//        System.out.println(alumno.getFechaNac());
//        System.out.println(alumno.isActivo());
//        }
//                      LISTAR     LO MISMO PERO CON TOsTRING
//        AlumnoData ad = new AlumnoData();
//        for (Alumno alumno : ad.ListarAlumnos()) {
//            System.out.println(alumno);
//        }
//*************************************** U P D A T E ***************************************
//                                  MODIFICAR ALUMNO
//        Alumno alumnoModificado = new Alumno(3,41777523,"Wilde","Oscar",LocalDate.of(1890,04,16),true);
//        AlumnoData ad = new AlumnoData();
//        ad.modificarAlumno(alumnoModificado);
//                                  ACTIVAR ESTADO ALUMNO
//        AlumnoData ad = new AlumnoData();
//        ad.activarAlumno(1);
//*************************************** D E L E T E ***************************************        
//                                    ALUMNO POR ID       (borrado lógico)
//         AlumnoData ad = new AlumnoData();
//         ad.eliminarAlumno(2);


//                        *********   M A T E R I A   *********
//                 *****************************************************
//************************************** METODOS  CRUD **************************************
//*************************************** C R E A T E ***************************************
//                 *****************************************************
        //Materia m1 = new Materia("Ciencias Naturales 1", 1, true);
        //Materia m2 = new Materia("Ciencias Sociales 2", 2, true);
        //Materia m3 = new Materia("Taller 1", 3, true);
        //Materia m4 = new Materia("Dibujo Técnico 1", 1, true);
        //Materia m5 = new Materia("Biología 1", 2, true);
        //MateriaData md = new MateriaData();
        //md.guardarMateria(m1);
        //md.guardarMateria(m2);
        //md.guardarMateria(m3);
        //md.guardarMateria(m4);
        //md.guardarMateria(m5);
//***************************************   R E A D   *************************************** 
//                                   BUSCAR MATERIA POR ID
//        MateriaData md = new MateriaData();
//        Materia materiaEncontrada = md.buscarMateriaPorID(7);
//        System.out.println(materiaEncontrada);
//*************************************** U P D A T E ***************************************
//                              MODIFICAR  MATERIA
//            Materia materiaModificada = new Materia(9,"Inglés 1", 1, true);
//            MateriaData m = new MateriaData();
//            m.modificarMateria(materiaModificada);   
//
//                              ACTIVAR  MATERIA
//            MateriaData md = new MateriaData();
//            md.activarMateria(4);
//*************************************** D E L E T E ***************************************
//                  ELIMINAR  MATERIA POR ID   borrado lógico en este caso
//        MateriaData md = new MateriaData();
//        md.eliminarMateria(4);   


//********************************** I N S C R I P C I O N **********************************       
//************************************** METODOS  CRUD **************************************
//*************************************** C R E A T E ***************************************
//                 *****************************************************
//        AlumnoData ad = new AlumnoData();
//        MateriaData md = new MateriaData();
//        InscripcionData id = new InscripcionData();
//
//        Alumno alumno4 = ad.buscarAlumnoPorID(3);
//        Materia materia4 = md.buscarMateriaPorID(1);
//        Inscripcion inscripcion = new Inscripcion(alumno4, materia4, 9.5);                //Se respetó el esquema de BD del PDF tiene nota como INT
//        id.guardarInscripcion(inscripcion);
//***************************************   R E A D   ***************************************
//***************************************   LISTAR   **************************************** 
//              -------------------* LISTAR INSCRIPCIONES *--------------------
       
        
//        InscripcionData id = new InscripcionData();
//        
//        for(Inscripcion inscripcion:id.obtenerInscripciones()){
//            System.out.println(inscripcion);
//        }


//(este no me funciona)
//        for(Inscripcion inscripcion:id.obtenerInscripciones()){
//             System.out.println("ID " + inscripcion.getIdInscripcion());
//             System.out.println("Apellido "+inscripcion.getAlumno().getApellido());
//             System.out.println("Materia " + inscripcion.getMateria().getNombre());
//        }
//              -----------------* LISTAR INSCRIPCIONES POR ALUMNO *-----------
//                                      * Pasando el ID ALUMNO *
//        InscripcionData id = new InscripcionData();
//
//        for(Inscripcion inscripcion:id.obtenerInscripcionesPorAlumno(1)){
//             System.out.println("ID de Inscripcion " + inscripcion.getIdInscripcion());
//             System.out.println("Apellido "+inscripcion.getAlumno().getApellido());
//             System.out.println("Materia " + inscripcion.getMateria().getNombre());
//        }
//        
//              --------------------* LISTAR MATERIAS CURSADAS POR ALUMNO *------------------
//                                      * Pasando el ID ALUMNO *
//                                      * IMPRIME con DATOS SEPARADOS *

        /*          Este mátodo recibe ei ID de un alumno 
            y nos devuelve la lista de materias
            en las que está inscripto ese alumno*/
//        InscripcionData id = new InscripcionData();
//        id.obtenerMateriasCursadas(1);
//
//        for (Materia inscripcion : id.obtenerMateriasCursadas(1)) {
//
//            System.out.println("ID: " + inscripcion.getIdMateria());
//            System.out.println("Nombre: " + inscripcion.getNombre());
//            System.out.println("Año: " + inscripcion.getAnio());
//
//        }
//          -------------------* LISTAR MATERIAS CURSADAS POR ALUMNO *-------------------
//                                  * Pasando el ID ALUMNO *
//                                  * IMPRIME con TO STRING * *

        /*Este mátodo recibe ei ID de un alumno 
            y nos devuelve la lista de materias
            en las que está inscripto ese alumno*/
        
        
//        InscripcionData id = new InscripcionData();
//        id.obtenerMateriasCursadas(1);
//
//        for (Materia inscripcion : id.obtenerMateriasCursadas(1)) {
//
//            System.out.println(inscripcion);
//        }

//          -------------------* LISTAR MATERIAS   NO   CURSADAS POR ALUMNO *-------------------
//                                      * Pasando el ID ALUMNO *
//                                   * IMPRIME con DATOS SEPARADOS *

        /*          Este mátodo recibe ei ID de un alumno 
            y nos devuelve la lista de materias
            en las que NO está inscripto ese alumno*/
//        
//        InscripcionData id = new InscripcionData();
//        //id.obtenerMateriasNOCursadas(1);
//
//        for (Materia noInscripcion : id.obtenerMateriasNOCursadas(1)) {
//
//            System.out.println("ID Materia: " + noInscripcion.getIdMateria());
//            System.out.println("Nombre: " + noInscripcion.getNombre());
//            System.out.println("Año: " + noInscripcion.getAnio());
//
//        }
        
//          -------------------* LISTAR MATERIAS   NO   CURSADAS POR ALUMNO *-------------------
//                                      * Pasando el ID ALUMNO *
//                                      * IMPRIME con TO STRING *

        /*Este mátodo recibe ei ID de un alumno 
          y nos devuelve la lista de materias
          en las que NO está inscripto ese alumno*/
//        
//        InscripcionData id = new InscripcionData();
//
//        for (Materia noInscripcion : id.obtenerMateriasNOCursadas(3)) {
//             System.out.println(noInscripcion);
//        }

//          -------------------* LISTAR ALUMNOS POR MATERIA CURSADA *-------------------

//            InscripcionData id = new InscripcionData();
//
//        for(Alumno aluInsc:id.listarAlumnosPorMateria(1) ){
//            System.out.println(aluInsc);
//        }

//*************************************** U P D A T E ***************************************
//        InscripcionData id = new InscripcionData();
//        id.actualizarNota(0, 3, 10);
//*************************************** D E L E T E ***************************************
//        InscripcionData id = new InscripcionData();
//        id.borrarInscripcionMateriaAlumno(3, 10);
    }
}
//********************************** I N S C R I P C I O N **********************************       
//************************************** METODOS  CRUD **************************************
//*************************************** C R E A T E ***************************************
//***************************************   R E A D   *************************************** 
//*************************************** U P D A T E ***************************************
//*************************************** D E L E T E ***************************************
