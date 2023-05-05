package entidades;

public class Alojamiento {
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    
    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }
}
