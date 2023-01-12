package entidades;
/*
clase Alumno, atributos: nombre y una lista de tipo Integer
con sus 3 notas.
*/

import java.util.ArrayList;

public class Alumnos {
    private String nombre;
    ArrayList <Integer> notas = new ArrayList<>();

    public Alumnos() {
    }

    public Alumnos(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Integer> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
}
