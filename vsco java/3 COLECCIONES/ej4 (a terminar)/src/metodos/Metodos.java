package metodos;

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Peliculas;
/*
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla. */

public class Metodos {
    Scanner leer = new Scanner(System.in);
    Peliculas p = new Peliculas();

    ArrayList <String> peliculasArray = new ArrayList<>();

    public void crearPelicula(){
        String opcion;
        do {
            System.out.println("Título de la película");
            p.setTitulo(leer.next());
    
            System.out.println("Director de " + p.getTitulo());
            p.setDirector(leer.next());
    
            System.out.println("Duración (en horas) de " + p.getTitulo());
            p.setDuracion(leer.nextDouble());
            
            String peli = p.getTitulo() + " " + p.getDirector() + " " + p.getDuracion();
            peliculasArray.add(peli);

            System.out.println("");
            System.out.println("Deseas agregar otra película?");
            System.out.println("SI: S // NO: N");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("n"));
    }

    public void mostrarPeliculas(){
        System.out.println("LISTA DE PELICULAS: ");
        System.out.println(peliculasArray);
    }

    public void peliculasMasDeUnaHora(){
        for (String aux : peliculasArray) {
            if (p.getDuracion()>=1) {
                System.out.println(aux + "dura mas de 1 hr");
            } else{
                System.out.println("ninguna pelicula dura mas de una hora");
            }
        }
    }
}
