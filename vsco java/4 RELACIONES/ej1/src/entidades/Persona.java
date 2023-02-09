package entidades;
/*
Programa para que una Persona pueda adoptar un Perro. 
Clase Perro -> atributos: nombre, raza, edad y tamaño. 
Clase Persona -> atributos: nombre, apellido, edad, documento y Perro.
El main crear dos Personas y dos Perros. 
Asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private String dni;
    private Perro perro;

    
    public Persona() {
    }
    public Persona(String nombre, String apellido, Integer edad, String dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Perro getPerro() {
        return perro;
    }
    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    
    @Override
    public String toString() {
        return "Persona [perro=" + perro + "]";
    }
    
}
