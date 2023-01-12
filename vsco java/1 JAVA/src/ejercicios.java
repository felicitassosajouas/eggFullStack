import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) throws Exception {    
    
//SUBSTRING
        //CORTAR LETRAS DE UNA PALABRA
        String palabra;
        try (Scanner leer = new Scanner (System.in)) {
            System.out.println("Ingrese palabra para extraer inicial");
            palabra = leer.nextLine();
        }

        System.out.println(palabra.substring(0,1));
    }
}