package entidades;
import java.util.Scanner;

public class Televisor extends Electrodomestico{
    private Double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(String color, Double precio, Double peso, char consumo, Double resolucion, boolean sintonizadorTDT) {
        super(color, precio, peso, consumo);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        super.comprobarConsumoEnergetico(this.consumo);
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        try (Scanner leer = new Scanner(System.in)) {
            super.crearElectrodomestico();
            System.out.print("Resolucion: ");
            this.resolucion = leer.nextDouble();
            System.out.println("TDT (S/N)");
            String tdt;
            do {
                tdt = leer.next().toUpperCase();
                switch (tdt) {
                    case "S" : this.sintonizadorTDT = true;
                        break;
                    case "N" : this.sintonizadorTDT = false;
                        break;
                    default : System.out.println("Opcion incorrecta");
                }
            } while (!tdt.equals("S") && !tdt.equals("N"));
        }
    }

    @Override
    public String precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40d) {
            precio += (precio * 0.3d);
        }
        if (this.sintonizadorTDT) {
            precio += 500;
        }
        String precioFinal = "Precio televisor: $" + String.valueOf(precio);
        return precioFinal;
    }
}
