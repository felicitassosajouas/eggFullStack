public class ej15 {
	public static void main(String[] args) throws Exception {
		int[] enteros = new int[40];
		//impreso normal
		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = i+1;
			System.out.println(enteros[i]);
		}

		//impreso al revés
		for (int i = enteros.length -1 ; i >= 0; i--) {
			enteros[i] = i+1;
			System.out.println(enteros[i]);
		}
	}
}
