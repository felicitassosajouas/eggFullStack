package Entidades.Empleados;

import Enums.Departamento;
import Enums.EstadoCivil;

import java.util.ArrayList;

public final class Profesores extends Empleado {
    private String departamento, daux;

    public Profesores() {
        rellenarDatos();
    }

    public Profesores(String nombre, String documento, String apellido, String estadoCivil, String anioIncorporacipn, String nDespacho, String departamento) {
        super(nombre, documento, apellido, estadoCivil, anioIncorporacipn, nDespacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void rellenarDatos() {
        super.rellenarDatos();
        System.out.println("Elija un curso al que desea ingresar");
        mostrarDepartamentos();
        departamento = leer.next();
        validarDepartamento();
        daux = departamento;
        personas.add(this);
    }

    public void cambiarDepartamento() {

        System.out.println("Usted desea cambiar el departamento S/N");
        if (super.validarS()) {
            System.out.println("Elija el departamento al que desea cambiar");
            mostrarDepartamentos();
            departamento = leer.next();
            validarDepartamento();
            while (daux.equalsIgnoreCase(departamento)) {
                System.out.println("Ya pertenece a este departamento, ingrese otro :)");
                departamento = leer.next();
            }
        }


    }

    public void mostrarDepartamentos() {
        for (Departamento aux : Departamento.values()) {
            System.out.println("-" + aux.departamento);
        }
    }

    public void validarDepartamento() {
        boolean encontrado = false;
        ;
        do {
            for (Departamento aux : Departamento.values()) {
                if (departamento.equalsIgnoreCase(aux.departamento)) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Ingrese un valor válido");
                departamento = leer.next();
            }
        } while (!encontrado);
    }
}
