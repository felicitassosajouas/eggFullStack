package Entidades.Empleados;

import Enums.EstadoCivil;
import Enums.Seccion;

public final class PersonalDeServicio extends Empleado {
    private String seccion;

    public PersonalDeServicio(String nombre, String documento, String apellido, String estadoCivil, String anioIncorporacipn, String nDespacho, String seccion) {
        super(nombre, documento, apellido, estadoCivil, anioIncorporacipn, nDespacho);
        this.seccion = seccion;
    }

    public PersonalDeServicio() {
        rellenarDatos();
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public void rellenarDatos() {
        super.rellenarDatos();
        System.out.println("Elija una opcion");
        mostrarSeccion();
        seccion = leer.next();
        validarSeccion();
        aux = seccion;
        personas.add(this);
    }

    public void mostrarSeccion() {
        for (Seccion aux : Seccion.values()) {
            System.out.println("-" + aux.seccion);
        }
    }

    public void validarSeccion() {
        boolean encontrado = false;
        ;
        do {
            for (Seccion aux : Seccion.values()) {
                if (seccion.equalsIgnoreCase(aux.seccion)) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Ingrese un valor válido");
                seccion = leer.next();
            }
        } while (!encontrado);
    }

    String aux;

    public void cambiarSeccion() {

        System.out.println("Usted va a cambiar de sección S/N");
        if (super.validarS()) {
            System.out.println("Elija la sección a la que quiere trasladarse");
            mostrarSeccion();
            seccion = leer.next();
            validarSeccion();
            while (aux.equalsIgnoreCase(seccion)) {
                System.out.println("Usted ya pertenece a esta sección, ingrese otra");
                seccion = leer.next();
            }
        }
    }
}

