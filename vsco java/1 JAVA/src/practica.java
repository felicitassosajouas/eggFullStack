import java.util.Scanner;

public class practica {
	public static void main(String[] args) {

		try (Scanner leer = new Scanner (System.in)) {
			System.out.println("Ingrese su edad");
			int edadUno = leer.nextInt();

			System.out.println("Ingrese la otra edad");
			int edadDos = leer.nextInt();

			System.out.println(sumar(edadUno,edadDos));
			mostrarSuma(edadUno, edadDos);
		}

	}	
	public static int sumar(int a, int b){
		return a + b;
	}
	public static void mostrarSuma(int a,int b){
		System.out.println(a + " + " + b + " = " + (a+b));
	}
}
