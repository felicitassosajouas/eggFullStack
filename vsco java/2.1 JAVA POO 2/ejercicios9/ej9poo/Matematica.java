/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7Ej9.Atributos;

/**
 *
 * @author Julian_Velasco
 */
public class Matematica {
    private double numero;
    private double numero1;

    public Matematica() {
    }

    public Matematica(double numero, double numero1) {
        this.numero = numero;
        this.numero1 = numero1;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    @Override
    public String toString() {
        return "Matematica{" + "numero=" + numero + ", numero1=" + numero1 + '}';
    }
    
}
