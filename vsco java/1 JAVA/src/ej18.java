import java.util.Random;

public class ej18 {
	public static void main(String[] args) {
        int [][] matriz = new int [4][4]; 
        int [][] transp = new int[4][4];

        llenarMatriz(matriz);
        imprimirMatriz(matriz);
        llenarTranspuesta(matriz,transp);
        mostrarTranspuesta(transp);
    }
    
    
    private static void llenarMatriz(int[][] matriz ) {
        
        Random ran = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = ran.nextInt(10);
            }

        }

    }

    private static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");

        }

    }

    private static void llenarTranspuesta(int[][] matriz, int[][] transp) {
    
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transp[i][j] = matriz[j][i];
            }

        }

    }

    private static void mostrarTranspuesta(int[][] transp) {
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transp[i][j] + " ");
            }

        }
        System.out.println("");

    }
	
}
