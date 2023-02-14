import java.util.ArrayList;
import java.util.List;

import entidades.Electrodomesticos;
import entidades.Lavadora;
import entidades.Televisor;
/*crear un ArrayList de Electrodomésticos con valores ya asignados. */
/*
Lavadora l2 = new Lavadora(2300,"blanco","F",35,'F');
Lavadora l1 = new Lavadora(2300,"rojo","D",23,'D');
Lavadora l3 = new Lavadora(2300,"negro","B",16,'B');

Televisor t1 = new Televisor(3400,"rojo","C",16,'C',true,40);
Televisor t2 = new Televisor(3400,"negro","B",16,'B',false,30);
Televisor t3 = new Televisor(3400,"azul","A",16,'A',true,120);
*/
public class main {
    List<Electrodomesticos> prod = new ArrayList<>();
    
    //agregar todos al array de electrodomesticos
    prod.add(new Lavadora(2300,"blanco","F",35,'F'));
    prod.add(new Lavadora(2300,"rojo","D",23,'D'));
    prod.add(new Lavadora(2300,"negro","B",16,'B'));
    prod.add(new Televisor(3400,"rojo","C",16,'C',true,40));
    prod.add(new Televisor(3400,"negro","B",16,'B',false,30));
    prod.add(new Televisor(3400,"azul","A",16,'A',true,120));


    /* Recorrer array y ejecutar el método precioFinal() en cada electrodoméstico. 
    Mostrar televisores y lavadoras. 
    Mostrar suma del precio de todos los Electrodomésticos. 
    Mostrar el precio de todos tipos de electrodomésticos*/
    
    System.out.println("Productos totales: " + prod);

}
