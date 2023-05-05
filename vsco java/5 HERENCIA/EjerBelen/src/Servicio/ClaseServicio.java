/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Atributos.Alojamientos;
import Atributos.ExtraHotelero.Camping;
import Atributos.Hoteles.Hotel4;
import Atributos.Hoteles.Hotel5;
import Atributos.ExtraHotelero.Residencias;
import Atributos.Hoteles.Hoteles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {
    public static final String ANSI_RED = "\u001B[31m";
    ArrayList<Alojamientos> nuevoAlojamiento = new ArrayList();
    Scanner leer = new Scanner(System.in);
    int opcion1, opcion2, opcion3, opcion4;
    ArrayList<Hoteles> hoteles = new ArrayList<>();
    int cont1 = 0, cont2 = 0;
    public void menuPrincipal() {
        System.out.println(ANSI_RED + "-------Interfaz empleado-------");
        System.out.println("Cuantos hoteles de 4 estrellas desea crear? ");
        opcion1 = leer.nextInt();
        System.out.println("Cuantos hoteles de 5 estrellas desea crear? ");
        opcion2 = leer.nextInt();
        System.out.println("Cuantos camping desea crear? ");
        opcion3 = leer.nextInt();
        System.out.println("Cuantas residencias desea crear? ");
        opcion4 = leer.nextInt();
        for (int i = 0; i < opcion1; i++) {
            System.out.println("---- Usted esta creando un Hotel de 4 estrellas ----");
            Hotel4 objeto = new Hotel4();
            objeto.crearHotel4();
            nuevoAlojamiento.add(objeto);

        }
        for (int i = 0; i < opcion2; i++) {
            System.out.println("---- Usted esta creando un Hotel de 5 estrellas ----");
            Hotel5 objeto = new Hotel5();
            objeto.crearHotel5();
            nuevoAlojamiento.add(objeto);

        }
        for (int i = 0; i < opcion3; i++) {
            Camping objeto = new Camping();
            objeto.crearCamping();
            nuevoAlojamiento.add(objeto);
        }
        for (int i = 0; i < opcion4; i++) {
            Residencias objeto = new Residencias();
            objeto.crearResidencia();
            nuevoAlojamiento.add(objeto);
        }


        for (Alojamientos e : nuevoAlojamiento) {
            if (e instanceof Hotel4) {
                Hotel4 nuevoHotel4 = (Hotel4) e;
                hoteles.add(nuevoHotel4);

            } else if (e instanceof Hotel5) {
                Hotel5 nuevoHotel5 = (Hotel5) e;
                hoteles.add(nuevoHotel5);
            } else if (e instanceof Camping) {
                Camping nuevoCamping = (Camping) e;
                if (nuevoCamping.isPoseeResto()) {
                    cont1++;
                }
            } else {
                Residencias nuevaResidencia = (Residencias) e;
                if (nuevaResidencia.isDescuentos()) {
                    cont2++;
                }
            }
        }

        Comparator<Hoteles> comparador = new Comparator<Hoteles>() {
            @Override
            public int compare(Hoteles o1, Hoteles o2) {
                return Double.compare(o2.precioHabitacion(), o1.precioHabitacion());
            }
        };



        Collections.sort(hoteles, comparador);

    }

    public void mostrarArray(){
        for (Hoteles aux:hoteles) {
            System.out.println(aux.toString());
            System.out.println(aux.precioHabitacion());
            System.out.println("-------------");
        }
    }

    public void menu2(){
        menuPrincipal();
        int opcion;
        do {
            System.out.println(ANSI_RED + "-------Interfaz cliente-------");
            System.out.println("Elija una opcion:");
            System.out.println("1. Imprimir todos los alojamientos");
            System.out.println("2. Imprimir hoteles de mayor a menor precio");
            System.out.println("3. Camping con restaurantes");
            System.out.println("4. Residencias con descuento");
            System.out.println("5. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    for (Alojamientos aux : nuevoAlojamiento) {
                        System.out.println("Nombre: "+ aux.getNombre());
                        System.out.println("Dirección:  " +aux.getDireccion());
                        System.out.println("Localidad: " + aux.getLocalidad());
                        System.out.println("Gerente: " + aux.getGerente());
                        System.out.println("-----------");
                    }
                    break;
                case 2:
                    mostrarArray();
                    break;
                case 3:
                    System.out.println("Hay " + cont1 + " Campings con restaurante");
                    break;
                case 4:
                    System.out.println("Hay " + cont2 + " Residencias con descuento");
                    break;
                case 5:
                    System.out.println(ANSI_RED+ "Ha salido con éxito");
                    break;

            }
        }while(opcion != 5);
    }
}
