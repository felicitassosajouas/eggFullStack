package entidades;
/* 
clase Matemática: atributos dos números reales
La clase deber tener un constructor vacío, parametrizado y get y set. 
En el main se creará el objeto y se usará el Math
random para generar los dos números y se guardaran en el objeto con su
respectivos set. 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
public class Matematica {
    private double n1;
    private double n2;
    
    public Matematica() {
    }

    public Matematica(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    
}
