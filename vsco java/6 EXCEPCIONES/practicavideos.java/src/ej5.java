import java.util.InputMismatchException;
import java.util.Scanner;

/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
public class ej5 {
    public void adivinar(){

        try (Scanner leer = new Scanner(System.in)) {
            InputMismatchException a = new InputMismatchException();
            
            //int numero = (int)(Math.random()*10+1); --> crea nro random entre el nro q multiplica(10) y el numero q suma(1);
            int numeroRandom = (int)(Math.random()*500+1);
            int adivinar;

            try {
                do {
                    System.out.println("Adivine el número oculto");
                    adivinar = leer.nextInt();
                    if (adivinar == numeroRandom) {

                        System.out.println("Adivinaste");
                        
                    }else if(adivinar>numeroRandom){
                        
                        System.out.println("Incorrecto");
                        System.out.println("PISTA: "+adivinar+" es MAYOR al numero oculto");

                    }else{

                        System.out.println("Incorrecto");
                        System.out.println("PISTA: "+adivinar+" es MENOR al numero oculto");
                    }
                } while (adivinar!=numeroRandom);
            } catch (Exception e) {
                e.getMessage();
                //throw a;
            }

        }
    }
}
