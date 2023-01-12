/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5guiapoo;

import Entidades.Cuenta;
import Servicios.CuentaServicios;
import java.util.Scanner;

/**
 * 5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo
 * los atributos: numeroCuenta (entero), el DNI del cliente (entero largo) y el
 * saldo actual (entero). Las operaciones asociadas a dicha clase son: a)
 * Constructor por defecto y constructor con DNI, saldo, número de cuenta e
 * interés. b) Agregar los métodos getters y setters correspondientes c) Metodo
 * para crear un objeto Cuenta, pidiéndole los datos al usuario. d) Método
 * ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
 * y se la sumara a saldo actual. e) Método retirar(double retiro): el método
 * recibe una cantidad de dinero a retirar y se la restará al saldo actual. Si
 * la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual
 * en 0. f) Método extraccionRapida(): le permitirá sacar solo un 20% de su
 * saldo. Validar que el usuario no saque más del 20%. g) Método
 * consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. h)
 * Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 *
 * @author Santiago
 */
public class Ejercicio5GuiaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CuentaServicios cs = new CuentaServicios();
        Cuenta c1 = cs.crearCuenta();
        int opcion;
        do {
            System.out.println("Ingrese la opcion que desea:");
            System.out.println("1 - Ingresar Dinero");
            System.out.println("2 - Retirar Dinero");
            System.out.println("3 - Extraccion Rapida");
            System.out.println("4 - Consultar Saldo");
            System.out.println("5 - Consultar Datos");
            System.out.println("6 - Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cs.ingreso(c1);
                    break;
                case 2:
                    cs.retirar(c1);
                    break;
                case 3:
                    cs.extraccionRapida(c1);
                    break;
                case 4:
                    cs.consultarSaldo(c1);
                    break;
                case 5:
                    cs.consultarDatos(c1);
                    break;
            }

        } while (opcion != 6);
    }

}
