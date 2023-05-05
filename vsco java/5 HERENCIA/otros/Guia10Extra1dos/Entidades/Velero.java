/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia10Extra1dos.Entidades;

/**
 *
 * @author Julian_Velasco
 */
public final class Velero extends Barco {

    protected int mastiles;

    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }
    
    public Velero(int mastiles, String matricula, double eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    @Override
    public double moduloAlquiler() {
        return super.moduloAlquiler()+ mastiles; 
    }
}
