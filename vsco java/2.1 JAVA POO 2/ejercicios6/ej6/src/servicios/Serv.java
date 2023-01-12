package servicios;
/* 
 * Programa Nespresso. 
 * clase Cafetera:atributos capacidadMaxima (de café que puede contener la cafetera) 
y cantidadActual (la cantidad actual de café que hay en la cafetera). 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
import entidades.Cafetera;
import java.util.Scanner;

public class Serv {
    
    Scanner leer = new Scanner (System.in);

    Cafetera c = new Cafetera();


    public void llenarCafetera(){
        System.out.println("Cantidad actual de café dentro de la cafetera");
        c.setCapacidadMax(leer.nextInt());

        c.setCantActual(c.getCapacidadMax());

        System.out.println("Cantidad de café actualizado: " + c.getCantActual());

    }


    public void servirTaza(){
        System.out.println("Tamaño de la taza a llenar (en cm^3) ");
        c.setTaza(leer.nextInt());
        System.out.println(" ");

        
        if (c.getTaza()>c.getCapacidadMax() || c.getTaza()<c.getCantActual()) {
            System.out.println(" ");
            System.out.println("La cantidad requerida para llenar la taza no alcanza");
        } else {
            System.out.println("Sirviendo taza...");
            System.out.println("Retire la taza al encender la luz verde");
            c.setCantActual(c.getCantActual()-c.getTaza());
            c.setCantActual(c.getCapacidadMax()-c.getCantActual());
            System.out.println("Cant actual d café"+ c.getCantActual());
        }
    }


    public void vaciarCafetera(){
        System.out.println("Vaciando cafetera...");
        c.setCantActual(0);
    }



    public void agregarCafe(){
        System.out.println("Cantidad de café actual: "+c.getCantActual());
        System.out.println(" ");

        System.out.println("Capacidad total de la cafetera: "+ c.getCapacidadMax());
        System.out.println(" ");

        System.out.println("Cantidad que desea agregar: ");
        int agregar = leer.nextInt();

        if (agregar<= c.getCapacidadMax()) {
            c.setCantActual(c.getCantActual()+agregar);
            System.out.println("Cantidad actual de café actualizada: "+ c.getCantActual());
        } else {
            System.out.println("Demasiado café");
        }
        
    }


    public void consultarCafe(){
        c.setCantActual(c.getCapacidadMax());
        System.out.println("Café actual: " + c.getCapacidadMax());
    }

}
