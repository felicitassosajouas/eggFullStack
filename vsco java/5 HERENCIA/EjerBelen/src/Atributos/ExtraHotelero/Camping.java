/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atributos.ExtraHotelero;

import Atributos.ExtraHotelero.AlojamientosExtraHoteleros;

/**
 *
 * @author Usuario
 */
public final class Camping extends AlojamientosExtraHoteleros {
    private int capacidadCarpas, cantidadBanios;
    private boolean poseeResto;

    public Camping() {
        //crearCamping();
    }

    
    public Camping(int capacidadCarpas, int cantidadBanios, boolean poseeResto, String privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.cantidadBanios = cantidadBanios;
        this.poseeResto = poseeResto;
    }

    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isPoseeResto() {
        return poseeResto;
    }

    public void setPoseeResto(boolean poseeResto) {
        this.poseeResto = poseeResto;
    }
    public void crearCamping() {

        System.out.println("---- Usted esta creando un camping ----");

        System.out.println("Ingrese la capacidad de las carpas");
        this.capacidadCarpas = leer.nextInt();

        System.out.println("Ingrese la cantidad de los baños");
        this.cantidadBanios = leer.nextInt();

        System.out.println("El camping tiene Restaurante? S / N ");
        String opcion = leer.next();
        while (!opcion.equalsIgnoreCase("S") && (!opcion.equalsIgnoreCase("N"))) {
            System.out.println("Su opcion no es valida, ingrese una opcion correcta: S O N");
            opcion = leer.next();
        }
        if (opcion.equalsIgnoreCase("S")) {
            poseeResto = true;
        } else {
            poseeResto = false;
        }
        super.crearAlojamientoExtraHotelero();
           
   }


}
