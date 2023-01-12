import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        try (Scanner leer = new Scanner(System.in)) {
            Rectangulo rec = new Rectangulo();
            
            System.out.println("ingresa base del rectangulo");

            rec.setBase(leer.nextDouble());
            


            System.out.println("ingresa altura del rectangulo");
            rec.setAltura(leer.nextDouble());
            

            rec.crearRec();
            rec.perimetro();
            rec.superficie(rec.getBase(), rec.getAltura());
        }
    }
}
