package entidades;
/*
Programa para que una Persona pueda adoptar un Perro. 
Clase Perro -> atributos: nombre, raza, edad y tamaño. 
Clase Persona -> atributos: nombre, apellido, edad, documento y Perro.
El main crear dos Personas y dos Perros. 
Asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/
public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamaño;
    
    public Perro() {
    }
    public Perro(String nombre, String raza, Integer edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
}
