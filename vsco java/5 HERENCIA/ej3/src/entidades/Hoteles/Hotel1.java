package entidades.Hoteles;

import entidades.Alojamiento;

public class Hotel1 extends Alojamiento{
    private Double cantHabitaciones, cantCamas, cantPisos;
    private Double precioHabitaciones, capacidadPersonas;
    private Integer estrellas;

    public Hotel1(Double cantHabitaciones, Double cantCamas, Double cantPisos, Double precioHabitaciones,
            Double capacidadPersonas, Integer estrellas) {
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitaciones;
        this.capacidadPersonas = capacidadPersonas;
        this.estrellas = estrellas;
    }

    public Hotel1(String nombre, String direccion, String localidad, String gerente, Double cantHabitaciones,
            Double cantCamas, Double cantPisos, Double precioHabitaciones, Double capacidadPersonas,
            Integer estrellas) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = precioHabitaciones;
        this.capacidadPersonas = capacidadPersonas;
        this.estrellas = estrellas;
    }

    public void crearHotel1(){
        cantHabitaciones = (double) 120;
        cantCamas = (double) 200;
        cantPisos = (double) 12;
        capacidadPersonas = (double) 350;
    }

    public Double precioHabitacionBase(){
        return 50 + (1 * capacidadPersonas);
    }
}