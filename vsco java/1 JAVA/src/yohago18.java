import java.util.Random;

public class yohago18 {
	//rellenar matriz 4x4 aleatorio 
	//mostrar transpuesta
	public static void main(String[] args){
		
		int[][] matrizA = new int [4][4];
		int[][] matrizB = new int [4][4];

		matrizPrimera(matrizA);
		matrizSegunda(matrizB, matrizA);

	}
	public static void matrizPrimera(int[][] matrizA){
		Random ran = new Random();
		for(int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++) {
				matrizA[i][j]= ran.nextInt(10);
				System.out.println(matrizA[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	public static void matrizSegunda(int[][] matrizB, int[][] matrizA){
		for(int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++) {
				matrizB[i][j] = matrizA[j][i];
				System.out.println(matrizB[j][i] + " " );
			}
			System.out.println(" ");
		}
	}

}
