import java.util.Scanner;

/*Crea una aplicación que a través de una función nos convierta 
una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. La función tendrá 
como parámetros, la cantidad de euros y la moneda a converir 
que será una cadena, este no devolverá ningún valor 
y mostrará un mensaje indicando el cambio: void.
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */

public class ej14 {
    public static void main(String[] args) {
        try (Scanner leer = new Scanner (System.in)) {
            double euro= 1;
            double libras= (euro * 0.86);
            double dolares= (euro * 1.28611);
            double yenes= (euro * 129.852);
            

            System.out.println("Ingrese moneda a convertir");
            String cambio = leer.nextLine();

            System.out.println("Ingrese cantidad de euros");
            int cant = leer.nextInt();

            double resultado = 0;
            switch (cambio) {
                
                case "yenes":
                    resultado = (cant * yenes);    
                    break;
                case "libras":
                    resultado = (cant * libras);
                    break;
                case "dolares":
                    resultado = (cant * dolares);
                    break;
                default:
                    break;
            }
            System.out.println( cant + " euro/s son " + resultado + cambio);
        }
    }

    public static void function(int cant, int resultado, String cambio){
        System.out.println( cant + " euro/s son " + resultado + cambio);
    }
}

    

