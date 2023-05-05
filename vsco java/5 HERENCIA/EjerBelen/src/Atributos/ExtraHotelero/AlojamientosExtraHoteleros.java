/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atributos.ExtraHotelero;

import Atributos.Alojamientos;

import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author Usuario
 */
public class AlojamientosExtraHoteleros extends Alojamientos {
    protected String privado;
    protected double metrosCuadrados;
protected Scanner leer = new Scanner(System.in);

    public AlojamientosExtraHoteleros() {
    }

    public AlojamientosExtraHoteleros(String privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String isPrivado() {
        return privado;
    }

    public void setPrivado(String privado) {
        this.privado = privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    public void crearAlojamientoExtraHotelero() {
        System.out.println("El alojamiento es privado? S/N");
        do {
            this.privado = leer.next();
            if (!privado.equalsIgnoreCase("S") && (!privado.equalsIgnoreCase("N"))) {
                System.out.println("Su opcion no es valida, ingrese una opcion correcta: S O N");
            }
        } while (!privado.equalsIgnoreCase("S") && (!privado.equalsIgnoreCase("N")));

        System.out.println();
        System.out.println("Ingrese los metros cuadrados del alojamiento");
        this.metrosCuadrados = leer.nextDouble();
        System.out.println();
        super.cargarAlojamiento();
    }

    @Override
    public String toString() {
        return super.toString() +
                "privado='" + privado + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                ", leer=" + leer +
                '}';
    }
}
