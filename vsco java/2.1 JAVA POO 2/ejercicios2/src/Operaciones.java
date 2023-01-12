import java.util.Scanner;

/*a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main. */

public class Operaciones {
    private double num1;
    private double num2;

    //contructor con parametro y vacío
    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operaciones(){

    }


    //metodo get y set
    public void setOperaciones(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getOperaciones(){
        return this.num1 + this.num2;
    }

    public void setNum1(double num1){
        this.num1 = num1;
    }
    public void setNum2(double num2){
        this.num2 = num2;
    } 

    public double getNum1(double num1){
        return num1;
    }
    public double getNum2(double num2){
        return num2;
    } 



    //suma de los números y devolver el resultado al main
    public double sumar(double num1, double num2){
        return (num1 + num2);
    }


    public double restar(double num1, double num2){
        return (num1 - num2);
    }


    public double multiplicar(double num1, double num2){
        return num1*num2;

        
    }


    public double dividir(double num1, double num2){
        return (num1 / num2);
    }


    //preguntar la operacion
    public void crearOperaciones(){
        try (Scanner operacion = new Scanner(System.in)) {
            System.out.println("Ingrese la operacion que desee");
            
            System.out.println("Suma:1 Resta:2 Multipliacion:3 Division:4");
            int tipo = operacion.nextInt();

            System.out.println("Operacion elegida: " + tipo);
            

            System.out.println("ingrese primer numero");
            num1 = operacion.nextDouble();

            System.out.println("ingrese segundo numero");
            num2 = operacion.nextDouble();

            if (tipo == 1) {
                sumar(num1, num2);
            } else if (tipo==2){
                restar(num1, num2);
            }else if (tipo==3){
                multiplicar(num1, num2);
            }
            else if (tipo==4){
                dividir(num1, num2);
            }else {
                System.out.println("Número inválido");
            }
        }
        
    }

}
