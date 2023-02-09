package herencia2.Entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio = 1000, peso;
    protected char consumo = 'F';
    protected String color;

    public Electrodomestico() {
        
    }

    public Electrodomestico(double precio, double peso, char consumo, String color) {
        this.precio = precio;
        this.peso = peso;
        this.consumo = consumo;
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public char getConsumo() {
        return consumo;
    }

    public String getColor() {
        return color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public void setColor(String color) {
        this.color = color;
    }



    private char consumoEnergetico(char consumo) {
        if (consumo >= 'A' && consumo <= 'F') {
            
            return consumo;
        }
        consumo = 'F';
        return consumo;
    }

    private String comprobarColor(String color) {
        String[] colores = {"blanco", "gris", "rojo", "azul", "negro"};
        for (String aux : colores) {
            if (aux.equalsIgnoreCase(color)) {
                color = aux;
                return aux;
            }
        }
        this.color = "blanco";
        System.out.println(color);
        return color;
    }

    
    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        precio = sc.nextDouble();
        System.out.println("Ingrese el color");
        color = sc.next();
        comprobarColor(color);
        System.out.println(color);
        System.out.println("Ingrese el consumo");
        consumo = sc.next().charAt(0);
        consumoEnergetico(consumo);
        System.out.println("Ingrese el peso");
        peso = sc.nextDouble();
    }

    public double precioFinal() {

        double preciofinal = 0;

        switch (consumo) {

            case 'A':
                preciofinal += 1000;
                break;
            case 'B':
                preciofinal += 800;
                break;
            case 'C':
                preciofinal += 600;
                break;
            case 'D':
                preciofinal += 500;
                break;
            case 'E':
                preciofinal += 300;
                break;
            case 'F':
                preciofinal += 100;
                break;
        }
        if (peso > 0 && peso < 20) {
            preciofinal += 100;
        } else if (peso >= 20 && peso < 50) {
            preciofinal += 500;
        } else if (peso >= 50 && peso < 80) {
            preciofinal += 800;
        } else if (peso >= 80) {
            preciofinal += 1000;
        }

        return precio + preciofinal;
    }
    
     @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", consumo=" + consumo + ", color=" + color + '}';
    }
     
    
}
