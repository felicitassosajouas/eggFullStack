import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int tamaño, contador = 1;

        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Cantidad de nros a ingresar");
            tamaño = leer.nextInt();

            int[] cantidad = new int[tamaño];

            for (int i : cantidad) {
                System.out.println("Ingresa los numeros " + (contador++));
                i = leer.nextInt(); 
                System.out.println(i); 
            }

            
            for (int i : cantidad) {
                System.out.println(i);
            }
        }

    }

    /*private static boolean function() {
        return true;
    }*/
}
