package entidades;
/*
Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */

import java.util.Scanner;

/*
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. 
*/
public class Poli extends Edificio{
    Scanner leer = new Scanner(System.in);
    
    private String nombre;
    private String tipo; //techado o abierto
    String tipo2;


    public Poli(Double alto, Double ancho, Double largo, String nombre, String tipo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Poli(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Poli() {
    }

    public Poli(int i, int j, int k, String nombre2, String tipo3) {
      //para poder crear el array en el main
    }

    public void crearPoli(){
        System.out.println("");
        System.out.println("Ingresar nombre del polideortivo");
        nombre = leer.next();

        System.out.println("Techado (t) / descubierto (d)");
        tipo = leer.next().toUpperCase();
        comprobarTipo();
    }

    public void medidas(){
        System.out.println("");
        System.out.println("Ingrese ancho del terreno");
        ancho = leer.nextDouble();

        System.out.println("Ingrese largo del terreno");
        largo = leer.nextDouble();

        System.out.println("Ingrese alto del terreno");
        alto = leer.nextDouble();

        calcularSuperficie();
        calcularVolumen();
    }

    @Override
    public void calcularSuperficie() {
        Double sup;
        sup = ancho*largo;
        System.out.println("");
        System.out.println("SUPERFICIE del terreno: " + sup);
    }

    @Override
    public void calcularVolumen() {
        Double vol;
        vol = alto * ancho * largo;
        System.out.println("");
        System.out.println("VOLUMEN del terreno: " + vol);
    }
    


    public void comprobarTipo(){
        if (tipo.equalsIgnoreCase("t")) {
            tipo2 = "techado";
        }else if(tipo.equalsIgnoreCase("d")){
            tipo2 = "descubierto";
        }else{
            do {
                System.out.println("Ingrese un caracter válido");
                System.out.println("Techado (t) / descubierto (d)");
                tipo = leer.next().toUpperCase();
            } while (!(tipo2.equalsIgnoreCase("t" ) && tipo.equalsIgnoreCase("d")));
        }
    }

    public void poli(){
        System.out.println("");
        System.out.println(nombre + " " + tipo2);
    }
}
