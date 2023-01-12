import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cuenta cuenta1= new Cuenta();

        cuenta1.cearCuenta(cuenta1.getNumeroCuenta(), cuenta1.getDni());

        cuenta1.setSaldoActual(18430);

        cuenta1.ingresar(cuenta1.getSaldoActual());

        cuenta1.retirar(cuenta1.getSaldoActual(), cuenta1.getRetirar());
        
        cuenta1.extraccionRapida(cuenta1.getSaldoActual(), cuenta1.getExtraccion());
    

        System.out.println("Desea consultar saldo? S/N");
        Scanner leer = new Scanner(System.in);
        String consulta = leer.nextLine();
        if(consulta.equals("S")){
            System.out.println(cuenta1.getSaldoActual());
        } else {
            System.out.println("OK");
        }

    }
}
