/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 * c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. d)
 * Método ingresar(double ingreso): el método recibe una cantidad de dinero a
 * ingresar y se la sumara a saldo actual. e) Método retirar(double retiro): el
 * método recibe una cantidad de dinero a retirar y se la restará al saldo
 * actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
 * saldo actual en 0. f) Método extraccionRapida(): le permitirá sacar solo un
 * 20% de su saldo. Validar que el usuario no saque más del 20%. g) Método
 * consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. h)
 * Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 *
 * @author Santiago
 */
public class CuentaServicios {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta c = new Cuenta();

        System.out.println("Ingrese su Dni: ");
        c.setDni(leer.nextLong());
        System.out.println("Ingrese su numero de cuenta: ");
        c.setNumeroCuenta(leer.nextInt());
        return c;

    }

    public void ingreso(Cuenta c) {
        double ingreso;
        System.out.println("Deposite su dinero: ");
        c.setSaldoac(c.getSaldoac() + leer.nextInt());

    }

    public void retirar(Cuenta c) {
        int retiro;
        System.out.println("Ingrese la cantidad de dinero que desea retirar: ");
        retiro = leer.nextInt();
        c.setSaldoac(c.getSaldoac() - retiro);
        if (c.getSaldoac() < retiro) {
            c.setSaldoac(0);
        } else {
            System.out.println("El dinero que tiene en su cuenta es de: " + c.getSaldoac());
        }
    }

    public void extraccionRapida(Cuenta c) {

        System.out.println("Ingrese el dinero que quiere retirar de forma rapida: ");
        int extraccion;
        do {
            extraccion = leer.nextInt();
            if (extraccion > c.getSaldoac() * 0.20) {
                System.out.println("El monto ingresado es mayor al 20%");
            }

        } while (extraccion > c.getSaldoac() * 0.20);
        c.setSaldoac(c.getSaldoac() - extraccion);

    }

    public void consultarSaldo(Cuenta c) {
        System.out.println("El saldo Actual de usted es de:" + c.getSaldoac());
    }

    public void consultarDatos(Cuenta c) {
        System.out.println("Los datos de su cuenta son: " + c);

    }

}
