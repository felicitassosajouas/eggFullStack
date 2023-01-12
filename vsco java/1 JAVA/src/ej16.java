/* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido */
import java.util.Scanner;
import java.util.Random;

public class ej16 {
	public static void main(String[] args) throws Exception {
		
			try (Scanner leer = new Scanner(System.in)) {
				//creo un obj random
				Random rellenoEnteros = new Random();

				System.out.println("Ingrese la cantidad de números incógnitos");
				int n = leer.nextInt(); 

				int[] random = new int[n];

				for (int i = 0; i < random.length; i++) {
					random[n] = rellenoEnteros.nextInt();
					System.out.println(random[n]);
				}
			}
		
	}
}
