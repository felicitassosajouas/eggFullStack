/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atributos.Hoteles;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public final class Hotel5 extends Hotel4 {
    private int cantSalones, cantSuites, cantLimosinas;
    Scanner leer = new Scanner(System.in);

    public Hotel5() {
        //crearHotel5();
    }

    public Hotel5(int cantSalones, int cantSuites, int cantLimosinas, char tipoGym, String nombreResto, int capacidadResto, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(tipoGym, nombreResto, capacidadResto, cantHabitaciones, numCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }
    public void crearHotel5() {


        System.out.println("Ingrese la cantidad de salones de conferencia");
        this.cantSalones = leer.nextInt();

        System.out.println("Ingrese la cantidad de Suites");
        this.cantSuites = leer.nextInt();

        System.out.println("Ingrese la cantidad de Limusinas");
        this.cantLimosinas = leer.nextInt();

        super.crearHotel4();

    }
    public double precioLimosinas(){
        
        return cantLimosinas *15;
    }

    @Override
    public double precioHabitacion() {
        return super.precioHabitacion() + precioLimosinas(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


}
