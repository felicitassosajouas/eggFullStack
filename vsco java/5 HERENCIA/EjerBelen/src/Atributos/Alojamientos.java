/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atributos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Alojamientos {
    protected String nombre, direccion, localidad, gerente;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alojamientos() {
    }

    public Alojamientos(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    public void cargarAlojamiento(){
        System.out.println("Ingrese el nombre del hotel");
        this.nombre = leer.next();

        System.out.println("Ingrese su direccion");
        this.direccion = leer.next();

        System.out.println("Ingrese su localidad");
        this.localidad = leer.next();

        System.out.println("Ingrese su gerente");
        this.gerente = leer.next();
        System.out.println();
    }


}
