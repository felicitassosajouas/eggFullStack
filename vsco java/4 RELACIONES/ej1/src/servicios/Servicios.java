package servicios;

import java.util.HashSet;
import java.util.Scanner;

import entidades.Perro;
import entidades.Persona;

/*
Programa para que una Persona pueda adoptar un Perro. 
Clase Perro -> atributos: nombre, raza, edad y tamaño. 
Clase Persona -> atributos: nombre, apellido, edad, documento y Perro.
El main crear dos Personas y dos Perros. 
Asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class Servicios {
    Scanner leer = new Scanner(System.in);
    
    HashSet <String> perrosTodos = new HashSet<>();

    public void perros(){
        String opcion;
        do {
            Perro perro = new Perro();
            System.out.println("nombre");
            perro.setNombre(leer.next());

            System.out.println("edad");
            perro.setEdad(leer.nextInt());

            System.out.println("raza");
            perro.setRaza(leer.next());

            System.out.println("tamaño");
            perro.setTamaño(leer.next());

            String perrito = perro.getNombre();
            perrosTodos.add(perrito);

            System.out.println("Ingresar otro perro? S/N");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("n"));
    }
    Persona p = new Persona();
    String nombrePerro;

    public void crearPersona(){    

        System.out.println("Datos de la persona");
        
        System.out.println("Nombre:");
        p.setNombre(leer.next());
        
        System.out.println("Apellido");
        p.setApellido(leer.next());
        
        System.out.println("Edad");
        p.setEdad(leer.nextInt());

        System.out.println("Documento");
        p.setDni(leer.next());

        System.out.println("Perro adoptado por "+ p.getNombre() + " " + p.getApellido());
        nombrePerro = leer.next();

        compararNombre();
    }

    public void compararNombre(){
        for (String x : perrosTodos) {
            if (nombrePerro.equalsIgnoreCase(x)) {
                System.out.println("coincide");
            } else {
                System.out.println("no coincide");
            }
        }
    }
}
