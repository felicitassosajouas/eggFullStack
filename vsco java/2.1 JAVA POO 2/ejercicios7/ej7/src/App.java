import java.util.Scanner;

import met.Metodos;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer =  new Scanner(System.in);

            Metodos met = new Metodos();
            
            /*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
            los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
            sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
            mayor de edad*/
            
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
