package Servicios;

import Entidades.Alumno;


import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    Alumno a1;
    ArrayList<Alumno> listaAux = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DecimalFormat dc = new DecimalFormat("###.00");



    public Alumno crearAlumno() {

        String opcion;

        do {
            a1 = new Alumno();
            System.out.println("Ingrese el alumno(a)");
            a1.setNombre(leer.next().toLowerCase());

            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
                a1.getLista().add(leer.nextInt());
            }
            System.out.println("Desea agregar otro(a) alumno(a)? S/N");
            opcion = leer.next();
            while (!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("N")) {
                System.out.println("Por favor mi estimado caballero o dama, ingrese una letra correcta");
                opcion = leer.next();
            }
            listaAux.add(a1);

        } while (opcion.equalsIgnoreCase("S"));

        buscar();

        return a1;

    }

    public void buscar() {
        String nombre;
        String opcion = "";
        boolean validar = false;
        do {
            System.out.println("Ingrese el nombre del alumno a buscar");
            nombre = leer.next().toLowerCase();
            for (int i = 0; i < listaAux.size(); i++) {
                if (listaAux.get(i).getNombre().contains(nombre)) {//Esto es para reemplazar el iterator, lo dijo fernando chiquito en el 4 video minnuto 8:33
                    validar = true;
                    System.out.println("El/La alumno(a)" + nombre + " está en la lista");
                    notaFinal(i);
                }

            }
            if (validar == false) {
                System.out.println("El alumno(a) " + nombre + " no está en la lista");
            }

            System.out.println("Desea buscar otro alumno? S/N");
            opcion = leer.next();
            while(!opcion.equalsIgnoreCase("S") && !opcion.equalsIgnoreCase("n")){
                System.out.println("Mi estimado distinguido honorifico y valiente come arepas, por favor digite una opcion correcta ");
                opcion = leer.next();
            }
        }while(opcion.equalsIgnoreCase("S"));
    }

    public void notaFinal(int i) {
        double suma = 0;
        double promedio;
        int cont = 0;
        System.out.println("El promedio del alumno es: ");
        for (Integer aux : listaAux.get(i).getLista()) {
            suma += aux;
            cont++;
            if (cont == 3) {
                break;
            }

        }

        promedio = suma / 3;
        System.out.println( dc.format(promedio));

    }


}



