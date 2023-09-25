/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Veronica
 */
public class Analitico {
    private int idMateria;
    private String nombre;
    private double nota;

    public Analitico() {
    }
    

    public Analitico(int idMateria, String nombre, double nota) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.nota = nota;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return idMateria + ", " + nombre + ", " + nota +".";
    }


    
    
}
