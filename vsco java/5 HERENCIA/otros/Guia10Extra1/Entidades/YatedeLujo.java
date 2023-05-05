/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia10Extra1.Entidades;

/**
 *
 * @author Julian_Velasco
 */
public final class YatedeLujo extends Barco{
    protected double potencia;
    protected int camarotes;

    public YatedeLujo(double potencia, int camarotes) {
        this.potencia = potencia;
        this.camarotes = camarotes;
    }
    
    public YatedeLujo(double potencia, int camarotes, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    @Override
    public double moduloAlquiler() {
        return super.moduloAlquiler()+potencia+camarotes; 
    } 
}