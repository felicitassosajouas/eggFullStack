package entidades;

import java.util.LinkedHashSet;

public class Peliculas {
    private LinkedHashSet <String> pelis = new LinkedHashSet<>();

    public Peliculas() {
    }

    public Peliculas(LinkedHashSet<String> peliculas) {
        this.pelis = peliculas;
    }

    public LinkedHashSet<String> getPeliculas() {
        return pelis;
    }

    public void setPeliculas(LinkedHashSet<String> peliculas) {
        this.pelis = peliculas;
    }
}
