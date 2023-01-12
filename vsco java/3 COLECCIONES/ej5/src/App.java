import metodos.Metodos;
/*
lea y guarde países, evitando repetidos
usaremos un conjunto. 
    Pedir país con bucle, se guardaran en el conjunto 
después preguntará si quiere guardar otro país o si
quiere salir, salir: se mostrará todos los países guardados 
(hacer servicios en la clase correspondiente) 
Se debe mostrar conjunto ordenado alfabéticamente: para esto recordar cómo se 
ordena un conjunto.
    Se pedirá un país y se recorrerá el conjunto con 
un Iterator, si está se eliminará el país que ingresó 
y se mostrará el conjunto. Si no se encuentra se informará
 */
public class App {
    public static void main(String[] args) throws Exception {
        Metodos m = new Metodos();

        m.ingresarPeliculas();
}
}
