package servicio;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import entidades.Persona;

public class Servicio {
    Scanner sc = new Scanner(System.in);
    
    public Persona crearPersona() {
        Persona persona = new Persona();

        System.out.println("Ingrese nombre");
        persona.setNombre(sc.nextLine());

        System.out.println("Ingrese dia, mes y año");
        int dia= sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        persona.setFechaNac(fechaNacimiento);
        return persona;
    }

/* calcularEdad() a partir de la fecha de nacimiento
Para conocerla también se debe conocer la fecha actual. */

    public void calcularEdad(Persona persona){
        long edadLong = ChronoUnit.YEARS.between(persona.getFechaNac(), LocalDate.now());
        
        int edad = (int)edadLong;
        persona.setEdad(edad);
        
        System.out.println("");
        System.out.println("La edad es " + edad);
    }


/* menorQue(int edad) que recibe como parámetro otra edad 
y retorna true en caso de que el receptor tenga menor edad 
que la persona que se recibe como parámetro, o false */

    public void menorQue(int edad){

        System.out.println("Ingrese otra edad para comparar");
        int edad2 = sc.nextInt();

        boolean edadTrueFalse = true;

        if (edad2<edad) {
            System.out.println(edad2 + " es menor que " + edad);
            
            System.out.println("");
            System.out.println(edadTrueFalse);
        } else {
            System.out.println(edad + " es menor que " + edad2);
            edadTrueFalse = false;

            System.out.println("");
            System.out.println(edadTrueFalse);
        }
    }

    public void mostrarPersona(Persona persona){
        System.out.println("***********");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println( "Fecha de nacimiento: " + persona.getFechaNac() + "((Edad: " + persona.getEdad() + "))");
    }

}
