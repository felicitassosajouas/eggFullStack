package Servicios;

import Entidades.Persona;

import java.util.Scanner;


//        • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
//        usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//        Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
//        Si no es correcto se deberá mostrar un mensaje
//        • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//        kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//        que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//        fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//        está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//        fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//        función devuelve un 1.
//        • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
//        un booleano.
//        A continuación, en la clase main hacer lo siguiente:
//        Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//        los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
//        sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
//        mayor de edad.
//        Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//        distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//        cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//        también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
public class Metodos {
    Persona p1 = new Persona();
    Scanner sc = new Scanner(System.in);

    public Persona crearPersona(int numPersona) {
        System.out.println("Persona N° " + numPersona);
        System.out.print("Ingres el nombre: ");
        p1.setNombre(sc.nextLine());
        System.out.print("\nIngrese el sexo(H)(M)(O): ");
        p1.setSexo(genero());
        System.out.print("\nIngrese la edad : ");
        p1.setEdad(sc.nextInt());
        System.out.print("\nIngrese la altura: ");
        p1.setAltura(sc.nextDouble());
        System.out.print("\nIngrese el peso: ");
        p1.setPeso(sc.nextInt());
        sc.nextLine();
        return p1;

    }

    private String genero() {
        String sexo;
        do {
            sexo = sc.nextLine().toUpperCase();
            if (!sexo.equals("H") && !sexo.equals("O") && !sexo.equals("M"))
                System.out.print("Ingrese una opción válida: ");
        } while (!sexo.equals("H") && !sexo.equals("O") && !sexo.equals("M"));
        System.out.println();
        return sexo;
    }

    public int calcularIMC(int peso, double altura) {
        double pesoIdeal = peso / Math.pow(altura, 2);
        if (pesoIdeal < 20) {
            System.out.println("Debajo del peso ideal");
            return -1;
        } else if (pesoIdeal >= 20 || pesoIdeal <= 25) {
            System.out.println("Peso ideal");
            return 0;
        } else {
            System.out.println("Sobrepeso");
            return 1;
        }
    }
    public boolean esMayorDeEdad(){
        return p1.getEdad() > 17;
    }
}
