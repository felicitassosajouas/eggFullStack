package Entidades.Empleados;

import Entidades.Facultad;

import java.sql.SQLOutput;

public class Empleado extends Facultad {
    protected String anioIncorporacipn, nDespacho;

    public Empleado(String nombre, String documento, String apellido, String estadoCivil, String anioIncorporacipn, String nDespacho) {
        super(nombre, documento, apellido, estadoCivil);
        this.anioIncorporacipn = anioIncorporacipn;
        this.nDespacho = nDespacho;
    }

    public Empleado() {
    }

    public String getAnioIncorporacipn() {
        return anioIncorporacipn;
    }

    public void setAnioIncorporacipn(String anioIncorporacipn) {
        this.anioIncorporacipn = anioIncorporacipn;
    }

    public String getnDespacho() {
        return nDespacho;
    }

    public void setnDespacho(String nDespacho) {
        this.nDespacho = nDespacho;
    }
    String aux;
    @Override
    public void rellenarDatos(){
        super.rellenarDatos();
        System.out.println("Ingrese su año de incorporación");
        anioIncorporacipn = leer.next();
        System.out.println("Ingrese su número de despacho");
        nDespacho = leer.next();
        aux = nDespacho;
    }

    public void cambiarDespacho(){
            System.out.println("Ingrese a que numero de despacho desea cambiar");
            nDespacho = leer.next();
            while(aux.equalsIgnoreCase(nDespacho)){
                System.out.println("Usted ya esta en este despacho, ingrese otro");
                nDespacho = leer.next();
            }
        }

    }

