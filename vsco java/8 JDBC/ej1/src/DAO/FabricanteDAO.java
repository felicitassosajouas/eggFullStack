package DAO;
import entidades.Fabricante;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.ArrayList;

public class FabricanteDAO extends DAO{
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Fabricante> listarFab() throws Exception{
        ArrayList<Fabricante> fabricantes = new ArrayList();
        try {
            String sql = "SELECT * FROM fabricante";
            consultarBase(sql);
            while(resultado.next()){
                int codigo = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                
                fabricantes.add(new Fabricante(nombre,codigo));
                
                System.out.println(" | " + codigo + " | " + nombre);
            }      
        } catch (SQLException e) {
            System.out.println(e);
        }
        finally{
            desconectarBase();
        }
        return fabricantes;
    }
    
    public void crearFabricante() throws Exception{
        Fabricante fabricante = new Fabricante();
        try {
        System.out.println("Ingrese el nombre del fabricante");
        fabricante.setNombre(sc.next());
        System.out.println("Ingrese el coódigo del fabricante");
        fabricante.setCodigo(sc.nextInt());
        String sql= "INSERT INTO fabricante (codigo,nombre) VALUES ("+fabricante.getCodigo() + ",'"+fabricante.getNombre() + "')";
            instarModificarEliminar(sql);
        } catch (SQLException e) {
        }
        finally{
            desconectarBase();
        }
    }
}
