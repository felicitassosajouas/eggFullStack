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
public class Residencias extends AlojamientosExtraHoteleros {
    private int totalHabitaciones;
    private boolean descuentos , campoDeportivo;

    public Residencias() {
        //crearResidencia();
    }
    

    public Residencias(int totalHabitaciones, boolean descuentos, boolean campoDeportivo, String privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.totalHabitaciones = totalHabitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public int getTotalHabitaciones() {
        return totalHabitaciones;
    }

    public void setTotalHabitaciones(int totalHabitaciones) {
        this.totalHabitaciones = totalHabitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    public void crearResidencia() {

        System.out.println("---- Usted esta creando una residencia ----");

        System.out.println("Ingrese la cantidad de habitaciones de la residencia");
        this.totalHabitaciones = leer.nextInt();

        System.out.println("La residencia tiene descuento a los gremios? S / N ");
        String opcion = leer.next();
        while (!opcion.equalsIgnoreCase("S") && (!opcion.equalsIgnoreCase("N"))) {
            System.out.println("Su opcion no es valida, ingrese una opcion correcta: S O N");
            opcion = leer.next();
        }
        if (opcion.equalsIgnoreCase("S")) {
            descuentos = true;
        } else {
            descuentos = false;
        }

        System.out.println("La residencia tiene campo deportivo? S / N ");
        String validar = leer.next();
        while (!opcion.equalsIgnoreCase("S") && (!opcion.equalsIgnoreCase("N"))) {
            System.out.println("Su opcion no es valida, ingrese una opcion correcta: S O N");
            opcion = leer.next();
        }
        if (opcion.equalsIgnoreCase("S")) {
            campoDeportivo = true;
        } else {
            campoDeportivo = false;
        }
        super.crearAlojamientoExtraHotelero();
   }


}
