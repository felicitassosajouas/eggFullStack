package servicios;
import entidades.Animal;
import entidades.Caballo;
import entidades.Gatoo;
import entidades.Perro;

public class Servicios {
    public void datos(){
        //nombre, edad, raza, alimento 
        Animal gato = new Gatoo("Gato", 4, "siamés", "Whishcats");
        gato.alimentarse();

        Perro perro = new Perro("Perro", 5,"Bulldog","Kongo");
        perro.alimentarse();

        Caballo caballo = new Caballo("Caballo",8,"nose","papas");
        caballo.alimentarse();
    }
}
