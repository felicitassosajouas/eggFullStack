package entidades;
import java.util.Scanner;
public class Televisor extends Electrodomesticos{
    Scanner leer = new Scanner(System.in);
    private boolean sintonizadorTdt;
    private double resolucion;
    
    public Televisor() {
    }
    public Televisor(Scanner leer, boolean sintonizadorTdt, double resolucion, String rta) {
        this.leer = leer;
        this.sintonizadorTdt = sintonizadorTdt;
        this.resolucion = resolucion;
        this.rta = rta;
    }
    public Televisor(int i, String string, String string2, int j, char c, boolean b, int k) {
      // TODO document why this constructor is empty
    }
    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }
    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }
    public double getResolucion() {
        return resolucion;
    }
    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }
    public Televisor(Double precio, String color, String consumoEnerg, Double peso, char letra, boolean sintonizadorTdt,
            double resolucion) {
        super(precio, color, consumoEnerg, peso, letra);
        this.sintonizadorTdt = sintonizadorTdt;
        this.resolucion = resolucion;
    }

    //////////////////////////////////
    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    los atributos del televisor.
     */

    String rta;
    public void crearTelevisor(){
        System.out.println("");
        System.out.println("__________Comprando un televisor__________");
        
        crearElectrodomestico();
        
        System.out.println("Resolución en pulgadas");
        this.resolucion = leer.nextDouble();

        sintonizadorTdt();
    }

    public void sintonizadorTdt(){
    boolean salir = false;
        do {
        System.out.println("Tiene sintonizador TDT? S/N");
        rta = leer.next().toUpperCase();
        if (rta.equalsIgnoreCase("S")) {
            sintonizadorTdt = true;
            salir=true;
        } else if(rta.equalsIgnoreCase("N")){
            sintonizadorTdt = false;
            salir = true;
        }else{
            salir=false;
        }
    } while (!salir);
    }


    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    también deben afectar al precio.
     */

    public void precio(){
        precioFinal();
        if (resolucion>40) {
            precio *= 0.3;
        } 

        if (sintonizadorTdt) {
            precio +=500;
        }

        System.out.println("PRECIO DEL TELEVISOR: " + precio);
    }
}


