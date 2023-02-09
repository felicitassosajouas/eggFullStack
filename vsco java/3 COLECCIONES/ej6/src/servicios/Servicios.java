package servicios;
import entidades.Productos;
import java.util.HashMap;
import java.util.Scanner;

public class Servicios {
    Scanner leer = new Scanner(System.in);
    Productos p = new Productos();

    HashMap <String,Integer> prod = new HashMap<>();
    
    public void agregarProd(){
        String opcion;
        do {
            System.out.println("Ingresar producto");
            p.setProducto(leer.next().toLowerCase());

            System.out.println("Ingresar precio del producto");
            p.setPrecio(leer.nextInt());

            prod.put(p.getProducto(), p.getPrecio());

            System.out.println("Desea agregar otro prodcuto? S/N");
            opcion = leer.next();
            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                System.out.println("Opcion incorrecta --> S/N");
                opcion = leer.next();
            }
        } while (!opcion.equalsIgnoreCase("n"));
    }

    public void mostrarProductos(){
        for (HashMap.Entry<String,Integer> x : prod.entrySet()) {
            System.out.println("Producto: " + x.getKey() + ", precio: " + x.getValue());
        }
    }

    public void modificarPrecio(){
        String name;
        String opcion;
        do {
            System.out.println("Nombre del producto al que desea modificarle su precio");
            name = leer.next().toLowerCase();
            
            if (prod.containsKey(name)) {
            System.out.println("Precio nuevo");
            prod.put(name, leer.nextInt());
            }
            
            System.out.println("Nuevo precio de " + name + ": " + prod.get(name));

            System.out.println("Desea modificar el precio de otro producto? S/N");
            opcion = leer.next();
            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                System.out.println("Opcion incorrecta --> S/N");
                opcion = leer.next();
            }

        } while (!opcion.equalsIgnoreCase("n"));

        
        
        
    }
}
