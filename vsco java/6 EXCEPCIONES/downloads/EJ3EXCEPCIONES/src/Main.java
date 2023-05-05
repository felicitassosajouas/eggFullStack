import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String num1, num2;
        Double num3, num4;
        System.out.println("Ingrese el primer numero");
        num1 = leer.next();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.next();
        num3 = Double.parseDouble(num1);
        num4 = Double.parseDouble(num2);
        
        Double resultado = null;
        ArithmeticException ae = new ArithmeticException();
        try{
            resultado = num3/num4;
            if(num4 == 0){
                throw ae;
            }
            System.out.println("El resultado es: " + resultado);
            
        }catch (ArithmeticException e){
            System.out.println("Es imposible dividir entre 0");
        }
    }

}

