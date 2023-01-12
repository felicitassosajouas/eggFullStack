import java.util.Scanner;

public class practica2BienHecho {
	public static void main(String[] args){  
		int number;  
		try (Scanner leer = new Scanner(System.in)) {

			System.out.println("Ingrese cant de personas");
			number=leer.nextInt();    

			int[] arrayEdades = new int[50];  

			System.out.print("Ingrese edades para calcular edad promedio"); 
			
			int promedio = 0;
			for(int i=0; i<number; i++){     
				arrayEdades[number]=leer.nextInt(); //reads elements from the user 
				promedio = arrayEdades[number]/number;
			}  
			

			System.out.println("Edad promedio: " + promedio);
		}  
}
}