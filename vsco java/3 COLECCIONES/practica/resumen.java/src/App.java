import java.util.ArrayList;
import java.util.Scanner;

import entidades.Entidades;;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        Entidades e = new Entidades();
        System.out.println("Array List");
        
        ArrayList <Integer> nros = new ArrayList<>();
        String opcion;
        do {
            System.out.println("Ingrese numeros");
            Integer n = leer.nextInt();
            e.numeros.add(n);

            System.out.println();
            System.out.println("Desea dejar de agregar números? --> s: sí / n:no");
            opcion = leer.nextLine();
        } while (!opcion.equalsIgnoreCase("n"));
    }
}
