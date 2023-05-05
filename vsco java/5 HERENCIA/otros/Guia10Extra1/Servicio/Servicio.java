/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia10Extra1.Servicio;

import Guia10Extra1.Entidades.Alquiler;
import Guia10Extra1.Entidades.Barco;
import Guia10Extra1.Entidades.BarcoaMotor;
import Guia10Extra1.Entidades.Velero;
import Guia10Extra1.Entidades.YatedeLujo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Julian_Velasco
 */
public class Servicio {

    Scanner sc = new Scanner(System.in);
    Alquiler alquiler = new Alquiler();
    SimpleDateFormat fecha1 = new SimpleDateFormat("dd/MM/yyyy");

    public void cargarDatos(){
        int opcion = 0;
        System.out.println("Ingrese su nombre");
        alquiler.setNombre(sc.nextLine());
        System.out.println("Ingrese su DNI");
        alquiler.setDocumento(sc.nextLine());
        try {
            System.out.println("Ingrese la fecha de Ingreso del Alquiler DD/MM/AAAA");
            alquiler.setFechaAlquiler(fecha1.parse(sc.nextLine()));
            System.out.println("Ingrese la fecha de Salida DD/MM/AAAA");
            alquiler.setFechaDevolucion(fecha1.parse(sc.nextLine()));
        } catch (ParseException e) {
            System.out.println("La fecha esta en un formato incorrecto"
                    + "ingrese una fecha valida");
        }
        
        System.out.println("Cual es la posición del amarre del barco");
        alquiler.setPosicionAmarre(sc.nextInt());
        System.out.println("Ingrese que tipo de barco tiene:");
        System.out.println("1. Barco a Motor");
        System.out.println("2. Velero");
        System.out.println("3. Yate de Lujo");
        opcion = sc.nextInt();

        Barco barco = null;
        switch (opcion) {
            case 1:
                System.out.print("Ingrese la potencia en CV: ");
                double potencia = sc.nextInt();
                barco = new BarcoaMotor(potencia);
                break;
            case 2:
                System.out.print("Ingrese el número de mástiles: ");
                int mastiles = sc.nextInt();
                barco = new Velero(mastiles);
                break;
            case 3:
                System.out.print("Ingrese la potencia en CV: ");
                potencia = sc.nextInt();
                System.out.print("Ingrese el número de camarotes: ");
                int camarotes = sc.nextInt();
                barco = new YatedeLujo(potencia, camarotes);
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
        
        System.out.println("Ingrese la eslora del barco: ");
        double eslora = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese el año de fabricación del barco: ");
        int anioFabricacion = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la matrícula del barco: ");
        String matricula = sc.nextLine();
        
        barco.setEslora(eslora);
        barco.setAnioFabricacion(anioFabricacion);
        barco.setMatricula(matricula);
        
        alquiler.setBarco(barco);
        System.out.println("El precio final del alquiler es $" + alquiler.PrecioFinal());
        System.out.println(alquiler.diasAlquilados());
    }

}

