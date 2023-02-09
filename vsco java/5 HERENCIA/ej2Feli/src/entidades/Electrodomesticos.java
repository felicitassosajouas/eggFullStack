package entidades;

import java.util.Scanner;

public class Electrodomesticos {

    Scanner leer =  new Scanner (System.in);
    protected Double precio;
    protected String color;
    protected String consumoEnerg;
    protected Double peso;
    protected char letra;
    String[] Vector = {"BLANCO","NEGRO","ROJO","AZUL","GRIS"};
    
    public Electrodomesticos() {
    }
    
    public Electrodomesticos(Double precio, String color, String consumoEnerg, Double peso, char letra) {
        this.precio = precio;
        this.color = color;
        this.consumoEnerg = consumoEnerg;
        this.peso = peso;
        this.letra = letra;
    }

    public Double getPrecio() {
        return precio;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnerg() {
        return consumoEnerg;
    }

    public void setConsumoEnerg(String consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }
    
    public Double getPeso() {
        return peso;
    }
    
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public char getLetra() {
        return letra;
    }
    
    public void setLetra(char letra) {
        this.letra = letra;
    }


    /////////////////////////////////////////////////////

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.
     */
    public void crearElectrodomestico(){
        System.out.println("");
        System.out.println("_________Creación de electrodoméstico_________");
        
        System.out.println("Color: blanco, negro, rojo, azul o gris");
        this.color = leer.next().toUpperCase();
        comprobarColor(this.color);

        System.out.println("Consumo energético: A/B/C/D/E/F");
        this.consumoEnerg  = leer.next().toUpperCase();
        letra = consumoEnerg.charAt(0);
        comprobarConsumoEnergetico(letra);

        System.out.println("Peso en kg");
        this.peso = leer.nextDouble();

        System.out.println("Precio");
        this.precio = leer.nextDouble();

    }

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible. */
    private void comprobarConsumoEnergetico(char letra){
        if (letra>='A' && letra<='F'){
            System.out.println("Consumo correcta");
        }else{
            System.out.println("Consumo = F");
            letra = 'F';
        }
    }


    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.
    */
    private void comprobarColor(String color){
        boolean correcto = false;
        for (String aux : Vector) {
            if (color.equalsIgnoreCase(aux)) {
                correcto = true;
                break;
            }else{
                correcto = false;
            }
        }
        if (!correcto) {
            System.out.println("Color por default: blanco");
        }else{
            System.out.println("Color: " + color);
        }        
    }
    

    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    precio. Esta es la lista de precios:
    */
    public void precioFinal(){
        double precioPeso = 0;
        double precioBase = 0;

        switch (this.letra) {
            case 'A':
                precioBase= 1000;
                break;
            case 'B':
                precioBase= 800;
                break;
            case 'C':
                precioBase= 600;
                break;
            case 'D':
                precioBase= 500;
                break;
            case 'E':
                precioBase= 300;
                break;
            case 'F':
                precioBase= 100;
                break;
            default:
                letra = 'F';
                precioBase= 100;
                break;
        }

        if (this.peso<=19) {
            precioPeso = 100;
        }else if(peso>=20){
            precioPeso = 500;
        }else if(peso>=50){
            precioPeso = 800;
        }else if (peso>=80){
            precioPeso = 1000;
        }
        
        this.precio = this.precio + precioPeso + precioBase;
    }
}