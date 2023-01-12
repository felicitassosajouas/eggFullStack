package metodos;
import java.util.Scanner;

/* 
Se debe mostrar conjunto ordenado alfabéticamente: 
para esto recordar cómo se ordena un conjunto.

Se pedirá un país y se recorrerá el conjunto con 
un Iterator, si está se eliminará el país que ingresó 
y se mostrará el conjunto. Si no se encuentra se informará
 */
import entidades.Peliculas;
public class Metodos {
    Scanner leer = new Scanner(System.in);
    Peliculas p = new Peliculas();

    public void ingresarPeliculas(){
        String opcion;
        do {
        System.out.println("Ingrese títulos de películas");
        String peli = leer.next();

        p.getPeliculas().add(peli);

        System.out.println("Desea agregar otro título? s/n");
        opcion = leer.next();
    } while (!opcion.equalsIgnoreCase("n"));
    }

}
