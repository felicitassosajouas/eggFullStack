/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia10Extra1.Entidades;

/**
 *
 * @author Julian_Velasco
 */
public final class BarcoaMotor extends Barco {
    protected double potencia;

    public BarcoaMotor(double potencia) {
        this.potencia = potencia;
    }
    
    public BarcoaMotor(String matricula, double eslora, int anioFabricacion, double potencia) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    @Override
    public double moduloAlquiler(){
        double moduloMot = super.moduloAlquiler()+potencia;
        return moduloMot;
    }
}
