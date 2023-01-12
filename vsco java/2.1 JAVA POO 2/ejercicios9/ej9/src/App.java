import java.util.Scanner;

import servicios.Servicio;

public class App {
/*
En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. 
*/
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            Servicio matematica = new Servicio();

            matematica.random();
            
            System.out.println("");
            System.out.println("MENÚ");
            System.out.println("1- Devolver mayor");
            System.out.println("2- Devolver potencia");
            System.out.println("3- Calcular raíz cuadrada");
            System.out.println("4- SALIR");
            int rta = leer.nextInt();
            
            
            switch (rta) {
                case 1:
                    matematica.devolverMayor();
                    break;

                case 2:
                    matematica.devolverPotencia();
                    break;

                case 3:
                    matematica.calculaRaiz();
                    break;
                
                case 4:
                    break;

                default:
                    break;
            }
        }
    }
}