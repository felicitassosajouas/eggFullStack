import java.util.Scanner;

import servicios.Serv;
/*
Método llenarCafetera()
Método servirTaza(int)
Método vaciarCafetera()
Método agregarCafe(int)
 */
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try (Scanner leer = new Scanner(System.in)) {
            Serv cafetera = new Serv();
            int opcion;

            do {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Presionar número de la opción deseada: ");
                System.out.println("1- Llenar cafetera");
                System.out.println("2- Servir una taza");
                System.out.println("3- Vaciar la cafetera");
                System.out.println("4- Agregar café a la cafetera");
                System.out.println("5- Consultar cantidad de café en la cafetera");
                System.out.println("6--> SALIR ");
                System.out.println(" ");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        cafetera.llenarCafetera();
                        break;
                    case 2:
                        cafetera.servirTaza();
                        break;
                    case 3:
                        cafetera.vaciarCafetera();
                        break;
                    case 4:
                        cafetera.agregarCafe();
                        break;
                    case 5:
                        cafetera.consultarCafe();
                        break;
                    default:
                        break;
                }
            } while (opcion !=6);
            
            switch (opcion) {
                case 1:
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    cafetera.servirTaza();
                    break;
                case 3:
                    cafetera.vaciarCafetera();
                    break;
                case 4:
                    cafetera.agregarCafe();
                    break;
                default:
                    break;
            }
        }
    }

}
