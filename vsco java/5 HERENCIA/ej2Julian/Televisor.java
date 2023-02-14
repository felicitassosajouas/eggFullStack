
package herencia2.Entidades;

import java.util.Scanner;

public final class Televisor extends Electrodomestico {
 
    protected double resolucion;
    protected boolean TDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean TDT, double precio, double peso, char consumo, String color) {
        super(precio, peso, consumo, color);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }


    public String mostrarTelevisor() {
        System.out.println(toString());
        return "Televisor{" + "resolucion=" + resolucion + ", TDT=" + TDT + '}';
    }
    
    public void crearTelevisor(){
    
        String validacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted va a adquirir un televisor");
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion del Televisor");
        resolucion = sc.nextDouble();
        System.out.println("¿Tiene TDT? S/N");
        validacion = sc.next();
        while (!validacion.equalsIgnoreCase("s") && !validacion.equalsIgnoreCase("n")){
            System.out.println("Ingrese una opcion valida");
            validacion = sc.next();
        }
        if(validacion.equalsIgnoreCase("s")){
            TDT = true;
        }else{
        TDT = false;
        }
        
        System.out.println("El precio final es de: "+precioFinal());
    }
    
    @Override
        public double precioFinal(){
    
        double preciofinal = super.precioFinal();
        if (resolucion > 40){
         preciofinal *= 0.3;
        if (TDT = true){
        preciofinal += 500;      
        }
    }    
    return preciofinal + precio;
    }
        
        
}
