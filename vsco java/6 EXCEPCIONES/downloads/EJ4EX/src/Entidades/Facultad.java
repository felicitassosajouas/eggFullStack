package Entidades;

import Enums.EstadoCivil;

import java.util.ArrayList;

import java.util.Scanner;

public class Facultad {
    protected String nombre, documento, apellido, estadoCivil;
    protected ArrayList<Facultad> personas = new ArrayList<>();

    public Facultad(String nombre, String documento, String apellido, String estadoCivil) {
        this.nombre = nombre;
        this.documento = documento;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
    }

    public Facultad() {
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void rellenarDatos() {

        System.out.println("Ingrese su nombre");
        this.nombre = leer.next();
        System.out.println("Ingrese su apellido");
        this.apellido = leer.next();
        System.out.println("Ingrese su documento de identidad");
        this.documento = leer.next();
        System.out.println("Elija su estado civil: ");
        for (EstadoCivil aux : EstadoCivil.values()) {
            System.out.println("-" + aux.estado);
        }
        this.estadoCivil = leer.next().toLowerCase();
        validarEstado();

    }


    public void cambiarEstado() {
        System.out.println("Usted va a cambiar de estado civil S/N");

        if (validarS()) {
            System.out.println("Elija el estado civil: ");
            for (EstadoCivil aux : EstadoCivil.values()) {
                System.out.println("-" + aux.estado);
            }
            this.estadoCivil = leer.next().toLowerCase();
            validarEstado();

        }
    }


    public boolean validarS() {
        String opcion;
        opcion = leer.next();
        while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
            System.out.println("Ingrese una opcion correcta");
            opcion = leer.next();
        }
        if (opcion.equalsIgnoreCase("s")) {
            return true;
        } else {
            return false;
        }

    }

    public void validarEstado() {
        boolean encontrado = false;
        ;
        do {
            for (EstadoCivil aux : EstadoCivil.values()) {
                if (estadoCivil.equalsIgnoreCase(aux.estado)) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Ingrese un valor válido");
                estadoCivil = leer.next();
            }
        } while (!encontrado);

    }


    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
