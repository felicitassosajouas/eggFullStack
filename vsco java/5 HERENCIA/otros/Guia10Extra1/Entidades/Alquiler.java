/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia10Extra1.Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class Alquiler {
    
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat fechaA = new SimpleDateFormat("dd/MM/yyyy");
    
    private String nombre;
    private String documento;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }
    
    public Alquiler(String nombre, String documento, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
   public long diasAlquilados() {
        long dias = (fechaDevolucion.getTime() - fechaAlquiler.getTime())/ (1000 * 60 * 60 * 24);
        return dias;
    }
   
    public double PrecioFinal() {
        double precio = diasAlquilados() * barco.moduloAlquiler();
        return precio;
    }
}