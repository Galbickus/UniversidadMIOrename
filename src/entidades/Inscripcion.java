
package entidades;

/*
 * @author Veronica
 */
public class Inscripcion {
    private int idInscripcion;
    private Alumno alumno;      //el atributo de tipo classe propia y de ellos extraigo lo que necesito
    private Materia materia;
    private double nota;       //

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, double nota) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
    //este está en el UML del apunte analizar bien su función???
    public Inscripcion(double nota) {
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public int getIdAlumno(){
        int idAlumno;
        idAlumno = this.alumno.getIdAlumno();
        return idAlumno;
    }
    
//    public void setIdAlumno(int idAlumno){
//        this.idAlumno = 
//        
//    }
    
//    //metodos del ULM VER    
    
//    public int getIdAlumno(){
//        return idAlumno;
//    }
//    
//    public void setIdAlumno(int idAlumno){
//        
//    }

    @Override
    public String toString() {
        return "Id Inscripción: "+ idInscripcion +" " +alumno + ", materia: " + materia + ", nota: " + nota + ".";
    }
    
    
}
