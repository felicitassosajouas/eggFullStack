import java.util.Scanner;

import met.Metodos;
public class App {
    public static void main(String[] args) throws Exception {
        
        try (Scanner leer = new Scanner(System.in)) {
            Metodos met = new Metodos();
            int nueva;
            do {
                System.out.println("Crear persona nueva? --> Si: 1 // No:2");
                nueva = leer.nextInt();
                if (nueva == 1) {
                    met.crearPersona();
                    met.calcularIMC();
                    met.esMayorDeEdad();
                }
            } while (nueva  != 2);
        }
            

        
    }
}
