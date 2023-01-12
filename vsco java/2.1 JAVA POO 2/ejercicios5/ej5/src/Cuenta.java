import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private int dni;
    private int saldoActual;
    private double retirar;
    private double extraccion;


    Scanner leer = new Scanner(System.in);
    public Cuenta(){

    }

    public Cuenta(int numeroCuenta, int dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    

    public double getRetirar() {
        return retirar;
    }

    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    public double getExtraccion() {
        return extraccion;
    }

    public void setExtraccion(double extraccion) {
        this.extraccion = extraccion;
    }





    public void cearCuenta(int numeroCuenta, int dni){
        
        System.out.println("Ingrese numero de cuenta");
        numeroCuenta = leer.nextInt();

        System.out.println("Ingrese dni");
        dni = leer.nextInt();
        
        System.out.println("Datos --> nro cuenta: " + numeroCuenta + " /// DNI: " + dni);
    }

    
    //D
    public void ingresar(double saldoActual){
        System.out.println("Saldo actual: " +saldoActual);
        System.out.println("Cantidad de dinero a ingresar: ");
        double ingresar = leer.nextDouble();

        saldoActual = saldoActual + ingresar;
        System.out.println("Nuevo saldo actual: " + saldoActual);
    }

    //E
    public void retirar(double saldoActual, double retirar){
        System.out.println("Saldo actual: " +saldoActual);
        System.out.println("Cantidad de dinero a retirar:");
        retirar = leer.nextDouble();

        if (retirar<saldoActual) {
            saldoActual = saldoActual - retirar;
            System.out.println("Dinero retirado: " +retirar);
            System.out.println("NUEVO saldo actual: " +saldoActual);
        } else {
            System.out.println("No dispone de esa cantidad de dinero para poder retirarlo");
            System.out.println("Saldo actual: " + saldoActual);
        }
    }

    //F
    public void extraccionRapida(double saldoActual, double extraccion){
        System.out.println("Dinero a extraer");
        extraccion = leer.nextDouble();


        if (extraccion < ((saldoActual*20)/100) && extraccion < saldoActual) {
            saldoActual = saldoActual - extraccion;
            System.out.println("Nuevo saldo: " + saldoActual);
            System.out.println("Dinero extraído " + extraccion );
        } else {
            System.out.println("Extracción no válida");
        }
        
        
    }

    //G 
    public void consultarSaldo(double saldoActual){
        System.out.println("Saldo actual: " + saldoActual);
    }
}
