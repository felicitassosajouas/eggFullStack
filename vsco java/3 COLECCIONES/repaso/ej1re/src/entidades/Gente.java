package entidades;

import java.util.ArrayList;

public class Gente {
    private String nombre;
    private String dni;
    private int edad;

    ArrayList<String> Gente = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<String> getGente() {
        return Gente;
    }

    public void setGente(ArrayList<String> gente) {
        Gente = gente;
    }
}
