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
public class Hotel4 extends Hoteles {

    protected char tipoGym;
    protected String nombreResto;
    protected int capacidadResto;
    Scanner leer = new Scanner(System.in);

    public Hotel4() {
        //crearHotel4();
    }



      public Hotel4(char tipoGym, String nombreResto, int capacidadResto, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.tipoGym = tipoGym;
        this.nombreResto = nombreResto;
        this.capacidadResto = capacidadResto;
    }


    public char getTipoGym() {
        return tipoGym;
    }

    public void setTipoGym(char tipoGym) {
        this.tipoGym = tipoGym;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public int getCapacidadResto() {
        return capacidadResto;
    }

    public void setCapacidadResto(int capacidadResto) {
        this.capacidadResto = capacidadResto;
    }
    public void crearHotel4() {

        do {
            System.out.println("Ingrese el tipo de gimnasio que va a asistir: A o B");
            this.tipoGym = leer.next().toUpperCase().charAt(0);
            if ((tipoGym != 'A') && (tipoGym != 'B')) {
                System.out.println("Su opcion no es valida, ingrese una opcion correcta: A O B");

            }
        } while ((tipoGym != 'A') && (tipoGym != 'B'));
              

        System.out.println("Ingrese el nombre del Restaurante");
        this.nombreResto = leer.next();

        System.out.println("Ingrese la capacidad del Restaurante");
        this.capacidadResto = leer.nextInt();
        super.crearHotel();
    }
    public double precioGym(){
        if(tipoGym == 'A'){
           return 50;
        } else{
            return 30;
        }
    }
    public double precioResto(){
        double precioResto = 0;
    if(capacidadResto < 30){
       precioResto =  10;
    }else if(capacidadResto >= 30 && capacidadResto <= 50 ){
        precioResto = 30;
    } else{
        precioResto= 50;
    }
    return precioResto;
    }

    @Override
    public double precioHabitacion() {
        return super.precioHabitacion() + precioResto() + precioGym();  // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }



}
