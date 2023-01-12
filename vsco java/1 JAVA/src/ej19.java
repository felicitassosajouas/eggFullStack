import java.util.Scanner;

public class ej19 {
	public static void main(String[] args) {
        int[][] matriz= new int[3][3];

        System.out.println("ingrese los numeros de la matriz ");
        
        llenado(matriz);

        rellenar(matriz);
        transpuesta(matriz);
    }

    private static void llenado(int[][] matriz) {
        try (Scanner leer = new Scanner(System.in)) {
			for (int i = 0; i < 3; i++) {
			    for (int j = 0; j < 3; j++) {
			        matriz[i][j] = leer.nextInt();
			    }
			}
		}
    }

    private static void transpuesta(int[][] matriz) {
        boolean finfor = false;
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == (matriz[j][i] * -1)) {
                    cont++;

                } else {
                    finfor = true;
                    break;
                }

            }
            if (finfor) 
                break;
            

        }
        if (cont == 9) {
            System.out.println("la matriz es antisimetrica");
        } else {
            System.out.println("la matriz no es antisimetrica");
        }

    }

    private static void rellenar(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("******************");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");

            }
            System.out.println();
        }
	}
}
