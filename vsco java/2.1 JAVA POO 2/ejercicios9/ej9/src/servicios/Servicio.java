package servicios;
/*  
En el main se creará el objeto y se usará el Math random para generar los dos números y se guardaran en el objeto con su
respectivos set. 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
import entidades.Matematica;
public class Servicio {
    
    Matematica m = new Matematica();

    public void random(){
        m.setN1(Math.random()*100);
        m.setN2(Math.random()*100);
        System.out.println("Primer valor: " + m.getN1());
        System.out.println("Segundo valor: " + m.getN2());
    }
    public void devolverMayor(){
        if (m.getN1()>m.getN2()) {
            System.out.println(m.getN1() + " es mayor que " + m.getN2());
        } else {
            System.out.println( m.getN2() + " es mayor que " + m.getN1());
        }
    }

    public void devolverPotencia(){
        System.out.println("Primer número " + m.getN1());
        System.out.println("Segundo número " + m.getN2());
        double elevado;

        if (m.getN1()>m.getN2()) {
            elevado = Math.pow(m.getN1(), (m.getN2()));
            System.out.println(m.getN1() + " ^ " + m.getN2() + "= " + elevado);
        } else {
            elevado = Math.pow(m.getN2(), (m.getN1()));
            System.out.println(m.getN2() + " ^ " + m.getN1() + "= " + elevado);
        }
    }

    /* Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. */
    public void calculaRaiz(){

        //VALOR ABSOLUTO PRIMERO
        double valor1 = Math.abs(m.getN1());
        double valor2 = Math.abs(m.getN2());

        System.out.println("Se mostrará la raíz cuadrada del menor de los valores");
        
        double raiz;
        if (m.getN1()>m.getN2()) {
            System.out.println("Raíz de " + m.getN2());
            raiz = Math.sqrt(valor2);
            System.out.println(raiz);
        } else {
            System.out.println("Raíz de " + m.getN1());
            raiz = Math.sqrt(valor1);
            System.out.println(raiz);
        }
    }
}
