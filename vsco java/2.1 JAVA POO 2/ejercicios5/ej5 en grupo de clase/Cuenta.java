/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero)
 *
 * @author Santiago
 */
public class Cuenta {
    
    public int numeroCuenta;
    public long dni;
    public int saldoac;
    public int interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, int saldoac, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoac = saldoac;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoac() {
        return saldoac;
    }

    public void setSaldoac(int saldoac) {
        this.saldoac = saldoac;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldoac=" + saldoac + ", interes=" + interes + '}';
    }

 
    
}
