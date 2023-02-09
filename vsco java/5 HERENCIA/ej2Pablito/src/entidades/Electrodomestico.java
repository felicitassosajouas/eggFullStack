package entidades;

import enums.Colores;
import enums.ConsumoEnergetico;
import enums.Peso;

//import java.awt.*;
import java.util.Scanner;

public class Electrodomestico {
    protected String color;
    protected Double precio, peso;
    protected char consumo;

    public Electrodomestico() {
        comprobarConsumoEnergetico(consumo);
    }

    public Electrodomestico(String color, Double precio, Double peso, char consumo) {
        this.color = color;
        this.precio = precio;
        this.peso = peso;
        this.consumo = consumo;
        comprobarConsumoEnergetico(consumo);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible.*/
    protected void comprobarConsumoEnergetico(char letra) {
        /*for(consumoEnergetico aux: consumoEnergetico.values()) {
            if (letra == aux.letra){
                System.out.println("Correcto");
            }else{
                System.out.println("Incorrecto");
                consumo = consumoEnergetico.F.letra;
            }
        }*/
        if (letra <= 'F' && letra >= 'A') {
            System.out.println("Consumo correcto");
        } else {
            System.out.println("Consumo por defecto será F");
            consumo = 'F';
        }
    }

    private void comprobarColor(String color) {
        boolean correcto = false;
        for (Colores c : Colores.values()) {
            if (color.equalsIgnoreCase(c.l)) {
                System.out.println("Color correcto");
                correcto = true;
                break;
            }
        }
        if (!correcto){
            System.out.println("Color será Blanco");
            this.color = "Blanco";
        }
    }

    /* Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.*/
    public void crearElectrodomestico() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("___________Creación de electrodoméstico___________");

            System.out.print("Color: ");
            this.color = sc.next();

            precio = 1000d;

            System.out.print("Peso: ");
            this.peso = sc.nextDouble();

            System.out.print("Consumo: ");
            this.consumo = sc.next().toUpperCase().charAt(0);
        }
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo);
    }
    public String precioFinal() {
        for (ConsumoEnergetico aux : ConsumoEnergetico.values()){
            if(aux.letra == consumo){
                precio += aux.precioConsumo;
                break;
            }
        }
        for (Peso aux : Peso.values()) {
            if((this.peso < aux.peso)){
                this.precio += aux.precio;
            }
        }
        return String.valueOf(precio);
    }
}
