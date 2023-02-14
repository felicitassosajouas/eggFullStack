package entidades;
import java.util.Scanner;

public class Lavadora extends Electrodomesticos{
    Scanner leer = new Scanner(System.in);
    private double carga;

    public Lavadora(int i, String string, String string2, int j, char c) {
        //this.carga = carga;
    }

    public Lavadora(Double precio, String color, String consumoEnerg, Double peso, char letra, double carga) {
        super(precio, color, consumoEnerg, peso, letra);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    /*
    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    el atributo propio de la lavadora.
     */
    
    public void crearLavadora(){
        System.out.println("");
        System.out.println("__________Comprando una lavadora__________");
        crearElectrodomestico();
        System.out.println("Carga de la lavadora");
        this.carga = leer.nextDouble();
    }
    
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la    
    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    visto en la clase Electrodoméstico también deben afectar al precio.
     */

    public void precio(){
        precioFinal();
        if (carga>=30) {
            precio = precio + 500;
        }
        System.out.println("PRECIO DE SU LAVADORA $"+precio);
    }
}
