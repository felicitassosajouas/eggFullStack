/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7Ej7.Atributos;

/**
 *
 * @author Julian_Velasco
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private double altura;
    private double peso;
    private double IMC;
    private boolean esMayor;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String sexo, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public boolean getEsMayor() {
        return esMayor;
    }

    public void setEsMayor(boolean esMayor) {
        this.esMayor = esMayor;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }  
}
