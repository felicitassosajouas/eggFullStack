package herencia2;

import herencia2.Entidades.Electrodomestico;
import herencia2.Entidades.Lavadora;
import herencia2.Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

public class HERENCIA3 {

    public static void main(String[] args) {
        double preciolavadora = 0, preciotelevisor = 0, total = 0;
        List<Electrodomestico> Productos = new ArrayList();
        Productos.add(new Lavadora(45, 4000, 56, 'N', "azul"));
        Productos.add(new Lavadora(15, 2500, 100, 'B', "negro"));
        Productos.add(new Televisor(50, false, 5000, 6, 'A', "verde"));
        Productos.add(new Televisor(30, true, 600, 25, 'L', "gris"));

        for (Electrodomestico resultados : Productos) {
            total += resultados.precioFinal();
            if(resultados instanceof Lavadora){
                preciolavadora += resultados.precioFinal();
            } else if(resultados instanceof Televisor){
                preciotelevisor += resultados.precioFinal();
            }
            
        }
        System.out.println("El precio por todos los productos que va a comprar"
                    + " es de: " +total);
            System.out.println("El valor total por las Lavadoras es "
                    + "de: " +preciolavadora);
            System.out.println("El valor total por los televisores es"
                    + "de: " +preciotelevisor);
    }

}