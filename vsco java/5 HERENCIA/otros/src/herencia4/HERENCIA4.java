package herencia4;

import java.util.ArrayList;
import java.util.List;

public class HERENCIA4 {
    public static void main(String[] args) {
    
        List<calculosFormas> lista = new ArrayList<>();
        lista.add(new Rectangulo(12, 6));
        lista.add(new Circulo(6));
        for (calculosFormas result : lista) {
            System.out.println("El area es: " + result.calcularArea());
            System.out.println("El perimetro es: " +result.calcularPerimetro());
        }
    }
}
