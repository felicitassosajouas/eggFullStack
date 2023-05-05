import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        //ciclo interrumpido porque se ingresa dato String en array Integer
        /*
        int[] edades = new int[3];
        try (Scanner leer = new Scanner(System.in)) {
            
            try {
                for (int i = 0; i < edades.length; i++) {
                    System.out.println("Ingresar edad " + i);
                    edades[i] = leer.nextInt();
                }
                for (int i = 0; i < edades.length; i++){ 
                    System.out.println("EDADES: ");
                    System.out.println(edades[i]);
                }
            } catch (Exception e) {
                System.out.println("Edad erronea");
            }finally{
                System.out.println("Finished");
            }
        }
         */




        //ej 2
        /*
        Integer[] numeros = {1,2,3,4,5}
        System.out.println(numeros[2]);
            try{
                System.out.println(numeros[6]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Indice fuera de rango");
            }
         */



        //ej3
        /*
        
        String n1, n2;
        Double nA, nB;
        try {
            System.out.println("Ingrese n1 (String)");
            n1 = leer.next();
            
            System.out.println("Ingrese n2 (String)");
            n2 = leer.next();
            
            nA = Double.parseDouble(n1);
            nB = Double.parseDouble(n2);
            
            Double division = nA/nB;
            System.out.println("nA: " + nA + " nB: " + nB);
            System.out.println("Division: "+ division);
            
            //creo una exception de tipo ArithmeticException llamada a
            ArithmeticException a = new ArithmeticException();
            
            if (nA == 0 || nB == 0) {
                //arrojo la excepcion que cree para que la atrape catch y salte el mensaje
                throw a;
            }
            
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede divir por cero");
        }
        */
        
        
        
        
        //ej4
        /*
        
        Integer num1, num2;
        String numString;
        try {
            //InputMismatchException
            System.out.println("Ingrese el primer numero entero");
            num1 = leer.nextInt();
            System.out.println("Numero ingresado: " + num1);

            //NumberFormatException
            System.out.println("Ingrese numero entero para ser convertido");
            numString = leer.next();
            num2 = Integer.parseInt(numString);
            System.out.println(num2 + " fue convertido a integer exitosamente");

            //ArithmeticException
            Double a = 20.0;
            Double b, rto;
            ArithmeticException divisionPorCero = new ArithmeticException();

            System.out.println("Ingrese un numero que divida al numero 20");
            b = leer.nextDouble();
            rto = a/b;
            System.out.println(a + "/" + b + "= " + rto);
            if(b==0){
                throw divisionPorCero;
            }

        } catch (InputMismatchException e) {
            System.out.println("no matchea con el tipo debido");
        } catch(NumberFormatException e){
            System.out.println("no se puede convertir a int");
        } catch(ArithmeticException divisionPorCero){
            System.out.println("no se puede divir por cero");
        } finally{
            System.out.println("Programa finalizado");
        }
         */
        
        ej5 e = new ej5();
        e.adivinar();
    }
}
