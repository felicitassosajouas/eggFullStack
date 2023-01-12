import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        try (Scanner text = new Scanner(System.in)) {
            String secuencia;
            int cont1 = 0;
            int cont2 = 0;
            String x = "x";
            do {
                System.out.println("ingrese el texto");
                secuencia = text.next();
                if (secuencia.length() <= 5 && secuencia.substring(0, 1).equalsIgnoreCase(x) && "o".equalsIgnoreCase(secuencia.substring(secuencia.length() - 1))) {
                    cont1++;
                } else if (!"&&&&&".equals(secuencia)){
                    cont2++;
                }
            } while (!"&&&&&".equals(secuencia));
            System.out.println("secuencia es correcta " + cont1 + " veces");
            System.out.println("secuencia es incorrecta " + cont2 + " veces");
        }   
    }
}
