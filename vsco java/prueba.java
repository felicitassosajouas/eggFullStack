import java.util.Scanner;
public class prueba {

    public static void main(String[] args) {
        

        /*
        // 6: es par o impar?

        try (Scanner leernumparimp = new Scanner (System.in)){

        System.out.println("Ingrese número para saber si es par o impar");
        int nParOImpar = leernumparimp.nextInt();

        if (nParOImpar % 2 == 0) {
            System.out.println(nParOImpar + " es PAR");
        } else {
            System.out.println(nParOImpar + " es IMPAR");
        }
        }
    */

        /*
        //7: EUREKA
        try (Scanner leerContrasena = new Scanner(System.in)) {
            System.out.println("Ingrese contraseña");
            String contrasena = leerContrasena.nextLine();

            for (int i = 0; i < 3; i++) {
                if (contrasena.equals("eureka") ) {
                    System.out.println("Contraseña acertada");
                } else {
                    System.out.println("Contraseña incorrecta, inténtelo nuevamente");
                }
                System.out.println("Intento nro " + i );
            }
        }
        */
        

        /*
        try (// 8: OCHO CARACTERES 
        Scanner ocho = new Scanner(System.in)) {
            System.out.println("Ingrese frase/palabra de 8 caracteres de largo");
            String ochocaracteres = ocho.nextLine();

            if (ochocaracteres.length()==8) {
                System.out.println("Correcto");
            }else {
                System.out.println("Excede o le faltan caracteres");    
            }
        }
        */


        /*
        // 10: ingresar nro + y pedir + nros hasta q superen el 1er nro
        
        Scanner leerpositivos = new Scanner (System.in);
        
        System.out.println("Ingrese un número inicial positivo y entero");
        int inicial = leerpositivos.nextInt();

        int suma = 0;
            
        int positivos;

        do {
            Scanner leerpositivo = new Scanner (System.in);
            System.out.println("Ingrese otro número para sumarse al anterior");
            positivos = leerpositivo.nextInt();
            suma = suma + positivos;
            System.out.println(inicial + " + " + positivos + " = " + suma);
        } while (suma<inicial);
        */




        /*
        // 11: 
        Scanner readN = new Scanner (System.in);
        
        System.out.println("Ingrese un número entero positivo");
        int a = readN.nextInt();

        System.out.println("Ingrese otro número entero positivo");
        int b = readN.nextInt();

        System.out.println("MENU");
        System.out.println("1.sumar");
        System.out.println("2.restar");
        System.out.println("3.multiplicar");
        System.out.println("4.dividir");
        System.out.println("5.salir");
        int rta = readN.nextInt();

        switch (rta) {
            case 1:
                int suma = a+b;
                System.out.println("Resultado = " + suma);
                break;
            case 2:
                int resta = a-b;
                System.out.println("Resultado = " + resta);
                break;
            case 3:
                int multiplicar = a*b;
                System.out.println("Resultado = " + multiplicar);
                break;
            case 4:
                int dividir = a/b;
                System.out.println("Resultado = " + dividir);
                break;
            default:
                System.out.println("Programa finalizado");
                break;
        }
        */
        
    }
}