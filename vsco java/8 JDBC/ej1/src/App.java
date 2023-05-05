import DAO.FabricanteDAO;
import DAO.ProductoDAO;
import entidades.Fabricante;
import entidades.Producto;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ProductoDAO pD = new ProductoDAO();
        pD.listarProd();
        ArrayList<String> apellidos = new ArrayList();
        ArrayList<Producto> productos = new ArrayList();
        
        
        ArrayList<String> nombres = new ArrayList();
        productos.add(new Producto());
        
        ArrayList<Fabricante> fabricantes = new ArrayList();
    
        fabricantes.add(new Fabricante("Jose",25));
        fabricantes.add(new Fabricante("Pablo",13));
        productos.get(0).setFabricantes(fabricantes);
}
}
