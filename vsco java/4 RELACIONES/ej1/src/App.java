import servicios.Servicios;

/*
Programa para que una Persona pueda adoptar un Perro. 
Clase Perro -> atributos: nombre, raza, edad y tamaño. 
Clase Persona -> atributos: nombre, apellido, edad, documento y Perro.
El main crear dos Personas y dos Perros. 
Asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Servicios s = new Servicios();
        s.perros();
        s.crearPersona();
    }
}
