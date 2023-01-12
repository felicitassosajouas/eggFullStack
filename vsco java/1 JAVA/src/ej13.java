import java.util.Scanner;
public class ej13 {
	public static void main(String[] args) {
	//        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
	//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
		
		System.out.println("Ingrese la dimension cuadrado");
		Scanner leer = new Scanner(System.in);
		int i;
		int j;
		int n;
		n=leer.nextInt();
			
			
		for (i=0 ; i<n; i++) {
				
			for (j=0; j<n; j++){
				if ((i==0) || (j==0) || (i==n-1) || (j==n-1)){
				System.out.print("*");
		}
			else {
				System.out.print(" ");
		}
		}
		System.out.println("");
		}
	}
}