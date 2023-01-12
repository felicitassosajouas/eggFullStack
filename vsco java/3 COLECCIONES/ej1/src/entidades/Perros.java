package entidades;

public class Perros {
    private String raza;
    private String nombre;
    
    public Perros() {
    }
    
    public Perros(String raza, String nombre) {
        this.raza = raza;
        this.nombre = nombre;
    }
    
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
