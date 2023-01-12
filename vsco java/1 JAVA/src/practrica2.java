import java.util.Scanner;

public class practrica2 {
	public static void main(String[] args){
		try (Scanner leer = new Scanner(System.in)) {
			System.out.println("Ingrese cant de personas");
			int n = leer.nextInt();
			int[] arrayEdades = new int[n];
			

			System.out.println("Ingrese edades para calcular edad promedio");
			
			for (int i = 0; i < n; i++) {
				arrayEdades[n]=leer.nextInt();	
				//System.out.println(arrayEdades[n]);	
			}
			
			int promedio = 0;
			for (int i = 0; i < n; i++) {
				promedio = arrayEdades[n]/n;
			}

			System.out.println(promedio);
		}
		
	}
}
