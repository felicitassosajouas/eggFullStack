package servicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

import entidades.Gente;

public class Servicios {
    Scanner leer= new Scanner(System.in);
    ArrayList<String> personas = new ArrayList<>();
    TreeSet <Integer> mapaDni = new TreeSet<>();
    


    public void addPersona(){
        Gente g = new Gente();
        boolean salir = false;
        String opcion;
        
        System.out.println("Ingrese Datos");
        System.out.println("");

        System.out.println("Nombre");
        g.setNombre(leer.next());

        System.out.println("DNI");
        g.setDni(leer.nextInt());
        mapaDni.add(g.getDni());

        System.out.println("Edad");
        g.setEdad(leer.nextInt());
        
        personas.add(g.getNombre());


        do {
            System.out.println("Ingresar datos de otra persona? S/N");
            opcion = leer.next();
            
            if (opcion.equalsIgnoreCase("s")) {
                //salir = false;
                System.out.println("Nombre");
                g.setNombre(leer.next());

                System.out.println("DNI");
                g.setDni(leer.nextInt());
                mapaDni.add(g.getDni());

                System.out.println("Edad");
                g.setEdad(leer.nextInt());
                
                personas.add(g.getNombre());
            }else if (opcion.equalsIgnoreCase("n")){
                salir = true;
            }
        } while (!salir);
    }


    public void mostrarGente(){
        System.out.println("Nombres de personas ingresadas:");
        System.out.println(personas.toString());
    }

    public void eliminarGente(){
        System.out.println("Ingrese el nombre de quien desee eliminar");
        String name = leer.next();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(name);
        if (personas.contains(name)) {
            personas.remove(name);
        }
        System.out.println("Lista de personas luego de eliminar " + name + " " + personas.toString());
    }

    public void ordenAlfabetico(){
        Collections.sort(personas);
        System.out.println("Lista en orden alfabético: "+personas.toString());
    }
    
    /*public void personaCompleta(){
        String pCompleta;
        for (Integer x : mapaDni) {
            for (String i : personas) {
                pCompleta = (i + " " + x);
                System.out.println(pCompleta);
            }
        }
    }
    */
}
