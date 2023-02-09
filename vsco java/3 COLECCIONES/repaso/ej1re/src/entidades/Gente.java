package entidades;

import java.util.ArrayList;

public class Gente {
    private String nombre;
    private Integer dni;
    private Integer edad;

    ArrayList<String> Gente = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public ArrayList<String> getGente() {
        return Gente;
    }

    public void setGente(ArrayList<String> gente) {
        Gente = gente;
    }
}
