
package herencia2.Entidades;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico {
    
    protected double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, double peso, char consumo, String color) {
        super(precio, peso, consumo, color);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    
    public String mostrarLavadora() {
        System.out.println(toString());
        return "Lavadora{" + "carga=" + carga + '}';
        
    }
    
    public void crearLavadora(){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted va a adquirir una lavadora");
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la Lavadora");
        carga = sc.nextDouble();
        System.out.println("El precio final es de: "+precioFinal());
    }
    
    @Override
    public double precioFinal(){
    
        double preciofinal = super.precioFinal();
        if (carga > 30){
        preciofinal += 500;
        }
        
    return preciofinal + precio;
    }
    
    
}
