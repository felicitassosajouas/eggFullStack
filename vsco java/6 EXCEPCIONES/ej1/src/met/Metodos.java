/*
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package met;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    Scanner leer = new Scanner(System.in);
    ArrayList <Persona> personas = new ArrayList<>();
    Persona p = new Persona();
    
    public void crearPersona(){
        
        System.out.println("Nombre completo: ");
        p.setNombre(leer.next());

        System.out.println("");
        System.out.println("Edad: ");
        p.setEdad(leer.nextInt());

        try {
            if(p.getEdad()<1 && p.getEdad()>100) {
                do {
                    System.out.println("Rango de edad inválido");
                    System.out.println("Ingrese edad nuevamente: ");
                    p.setEdad(leer.nextInt());
                } while (p.getEdad()<1 && p.getEdad()>100);
            }else{
                throw new NullPointerException("Edad null");
            }
        }catch (Exception NullPointerException) {
            System.out.println("NullPointerException: edad NULL");
        }
        

        System.out.println("");
        System.out.println("Sexo --> Mujer (M) / Hombre (H) / Otro (O)");
        p.setSexo(leer.next().toUpperCase());
        /*
        if (!p.getSexo().equalsIgnoreCase("H") || !p.getSexo().equalsIgnoreCase("M") || !p.getSexo().equalsIgnoreCase("O")) {
            do {
                System.out.println("Sexo inválido, ingresarlo nuevamente");
                System.out.println("Sexo --> M / H / O)");
                p.setSexo(leer.next().toUpperCase());
            } while (!p.getSexo().equalsIgnoreCase("H") || !p.getSexo().equalsIgnoreCase("M") || !p.getSexo().equalsIgnoreCase("O"));
        }
         */

        System.out.println("");
        System.out.println("Peso en kg");
        p.setPeso(leer.nextDouble());

        System.out.println("");
        System.out.println("Altura en metros");
        p.setAltura(leer.nextDouble());

        System.out.println("");
        System.out.println("PERSONA CREADA: ");
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Sexo: " + p.getSexo());
        System.out.println("Peso: " + p.getPeso()+ "kg");
        System.out.println("Altura: " + p.getAltura()+ "mts");

        personas.add(p);
    }

/*(peso en kg/(altura^2 en mt2)). 
Si da menos de 20 --> debajo de su peso ideal y la función devuelve un -1. 
Si da entre 20 y 25 (incluidos) --> peso ideal y la función devuelve un 0.
Si da mas que 25 --> sobrepeso, y la función devuelve un 1. 
*/
    public void calcularIMC(){
        System.out.println("");
        System.out.println("CALCULAR ÍNDICE DE MASA CORPORAL");

        double indice = p.getPeso()/(Math.pow(p.getAltura(),2));

        if (indice < 20) {
            System.out.println("Estás por debajo de tu peso ideal");
        } else if (indice>=20 && indice<=25){
            System.out.println("Felicitaciones! Estás en tu peso ideal");
        }else{
            System.out.println("Presentas sobrepeso");
        }
    }

        public boolean esMayorDeEdad(){
            boolean mayor;
            System.out.println("");
            System.out.println("VALIDAR MAYORÍA DE EDAD");
            if (p.getEdad()>=18) {
                mayor=true;
                System.out.println("Sos mayor de edad");
            } else {
                mayor= false;
                System.out.println("NO sos mayor de edad");
            }
            return mayor;
        }
    
}
