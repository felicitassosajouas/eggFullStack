/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atributos.Hoteles;

import Atributos.Alojamientos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Hoteles extends Alojamientos  {
    protected int cantHabitaciones, numCamas, cantPisos;
            protected double precioHabitaciones;
    Scanner leer = new Scanner(System.in);

   public Hoteles() {
}




    public Hoteles(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
       public void crearHotel() {
        System.out.println("Ingrese la cantidad de habitaciones");
        this.cantHabitaciones = leer.nextInt();

        System.out.println("Ingrese numero de camas");
        this.numCamas = leer.nextInt();

        System.out.println("Ingrese la cantidad de pisos");
        this.cantPisos = leer.nextInt();

        System.out.println("Ingrese el precio de las habitaciones");
        this.precioHabitaciones = leer.nextDouble();
        super.cargarAlojamiento();
    }
       
       public double precioHabitacion(){
           return 50+numCamas;
       }


}
