package entidades;

import java.util.Scanner;

/*
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */

public class Oficina extends Edificio {
    Scanner leer = new Scanner(System.in);
    private Integer oficinas;
    private Integer personas;
    private Integer pisos;

    
    public Oficina(Double alto, Double ancho, Double largo, Integer oficinas, Integer personas, Integer pisos) {
        super(alto, ancho, largo);
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public Oficina() {
    }
    public Oficina(int i, int j, int k, int oficinas2, int personas2, int pisos2) {
        //para poder crear el array en el main
    }
    /*
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina).
     */
    Integer cPersonas, cOficinas;
    
    public void personas(){
        System.out.println("");
        System.out.println("Cantidad de personas trabajando en el edificio");
        personas = leer.nextInt();

        System.out.println("Capacidad de personas por oficina");
        cPersonas = leer.nextInt();

        System.out.println("Cantidad de oficinas (una oficina por piso)");
        cOficinas = leer.nextInt();

        System.out.println("Cantidad de pisos del edificio (una oficiona por piso)");
        pisos = leer.nextInt();

        mostrarCantPersonas();
    }
    
    /*cantPersonas()  muestre cuantas personas entrarían en un piso y cuantas en todo el edificio. */
    public void mostrarCantPersonas(){
        Integer enEdificio;
        System.out.println("");
        System.out.println("Capacidad de personas por piso " + cPersonas);

        enEdificio = pisos*cPersonas;
        System.out.println("Personas que caben dentro del edificio: " +enEdificio);
    }
    

    public void medidas(){
        System.out.println("");
        System.out.println("Ingrese ancho del edificio");
        ancho = leer.nextDouble();

        System.out.println("Ingrese largo del edificio");
        largo = leer.nextDouble();

        System.out.println("Ingrese alto del edificio");
        alto = leer.nextDouble();

        calcularSuperficie();
        calcularVolumen();
    }

    @Override
    public void calcularSuperficie() {
        Double sup;
        sup = ancho*largo;
        System.out.println("");
        System.out.println("SUPERFICIE de la oficina: " + sup);
    }

    @Override
    public void calcularVolumen() {
        Double vol;
        vol = alto * ancho * largo;
        System.out.println("");
        System.out.println("VOLUMEN de la oficina: " + vol);
    }
    
    public void mostrar(){
        System.out.println("");
        System.out.println("Oficinas/pisos: " +oficinas);
        System.out.println("Personas: " + personas);
        System.out.println("Pisos: " + pisos);
        calcularSuperficie();
        calcularVolumen();
    }
}
