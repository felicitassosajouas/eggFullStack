package DAO;
import entidades.Producto;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.ArrayList;


public final class ProductoDAO extends DAO{


    /*
    public void producto(Producto producto){
        try{
            if (producto == null){
                throw new Exception("Ingresar datos del producto");
            }
            String sql = "INSERT INTO Producto(codigo, nombre)" + "VALUES" ('" + Producto.getCodigo() + "', '" + Producto.getNombre() + "');
            instarModificarEliminar(sql);
        }catch(Exception e){
            throw e;
        }
    }

    public void modificarProducto(Producto producto) throws Exception{
        try{
            if (producto == null){
                throw new Exception("Indique producto a modificar");
            }
            String sql = "UPDATE producto SET " + "clave = " + producto.getCodigo() + "' WHERE codigo =  + '" + Producto.getCodigo();
            instarModificarEliminar(sql);
        }catch(Exception e){
            throw e;
        }
    }

    public void eliminarProducto(Producto producto) throws Exception{
        try{
            if (producto == null){
                throw new Exception("Indique producto a modificar");
            }
            String sql = "DELETE FROM producto WHERE codigo '" + codigo + "'";
            
            instarModificarEliminar(sql);
        }catch(Exception e){
            throw e;
        }
    }
*/

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Producto> listarProd() throws Exception {
        ArrayList<Producto> productos = new ArrayList();
        try {
            String sql = "SELECT * FROM producto";
            consultarBase(sql);
            while (resultado.next()) {
                int codigo = resultado.getInt("codigo"), codigo_fabricante = resultado.getInt("codigo_fabricante");
                String nombre = resultado.getString("nombre");
                double precio = resultado.getDouble("precio");
                productos.add(new Producto(codigo, nombre, codigo_fabricante, precio));
                System.out.println(" | " + codigo +" | " + nombre +" | " + codigo_fabricante +" | " + precio);

            }
        } catch (SQLException e) {
        } finally {
            desconectarBase();
        }
        return productos;
    }

    public void listarNombreyPrecio() throws Exception {
        try {

            String sql = "SELECT nombre,precio FROM producto";
            consultarBase(sql);
            System.out.println("Nombres y precios");
            while (resultado.next()) {
                System.out.println(" | " + resultado.getString("nombre") + " | " + resultado.getDouble("precio"));
            }
        } catch (SQLException e) {
        } finally {
            desconectarBase();
        }
    }

    public void listarNombreRango() throws Exception {
        try {
            String sql = "SELECT nombre,precio FROM producto WHERE precio BETWEEN 120 AND 202";
            consultarBase(sql);
            System.out.println("Productos entre 120 y 202");
            while (resultado.next()) {
                System.out.println(" | " + resultado.getString("nombre") + " | " + resultado.getDouble("precio"));
            }
        } catch (SQLException e) {
        } finally {
            desconectarBase();
        }
    }

    public void listarPortatiles() throws Exception {
        try {

            String sql = "SELECT nombre FROM producto WHERE nombre LIKE '%portatil%'";
            consultarBase(sql);
            System.out.println("PORTATILES");

            while (resultado.next()) {
                System.out.println("" + resultado.getString("nombre"));
            }
        } catch (SQLException ex) {
        } finally {
            desconectarBase();
        }
    }

    public void listarProdMasBarato() throws Exception {
        try {

            String sql = "SELECT nombre, precio FROM PRODUCTO ORDER BY PRECIO LIMIT 1";
            consultarBase(sql);
            System.out.println("PRODUCTO MAS BARATO");

            while (resultado.next()) {
                System.out.println("| " + resultado.getString(" nombre ") + " | " + resultado.getDouble(" precio "));
            }
        } catch (SQLException ex) {
        } finally {
            desconectarBase();
        }
    }

    public void crearProducto() throws Exception {
        try {
            Producto prod = new Producto();
            System.out.println("Ingrese el código del producto");
            prod.setCodigo(sc.nextInt());
            System.out.println("Ingrese el nombre del producto");
            prod.setNombre(sc.next());
            System.out.println("Ingrese el precio del producto");
            prod.setPrecio(sc.nextDouble());
            System.out.println("Ingrese el código del fabricante");
            prod.setCodigo_fabricante(sc.nextInt());

            String sql = "INSERT INTO producto (codigo,nombre,precio,codigo_fabricante) VALUES (" + prod.getCodigo() + ",'" + prod.getNombre() + "'," + prod.getPrecio() + "," + prod.getCodigo_fabricante() + ")";
            instarModificarEliminar(sql);
        } catch (SQLException e) {
        } finally {
            desconectarBase();
        }
    }

    public void editarProd() throws Exception {
        try {

            System.out.println("Edición de producto: Selecciona un codigo a editar de la siguiente lista");
            listarProd();
            int opcion = sc.nextInt();
            System.out.println("Ingrese los nuevos datos de producto");
            Producto prod = new Producto();
            prod.setCodigo(opcion);
            System.out.println("Ingrese el nombre del producto");
            System.out.println(prod.getCodigo());
            prod.setNombre(sc.next());
            System.out.println(prod.getNombre());
            System.out.println("Ingrese el precio del producto");
            prod.setPrecio(sc.nextDouble());
            System.out.println(prod.getPrecio());
            System.out.println("Ingrese el código del fabricante");
            prod.setCodigo_fabricante(sc.nextInt());
            System.out.println(prod.getCodigo_fabricante());

            String sql = "UPDATE producto SET nombre='" + prod.getNombre() + "',precio=" + prod.getPrecio() + ",codigo_fabricante="
                    + prod.getCodigo_fabricante() + " WHERE codigo =" + prod.getCodigo();
            instarModificarEliminar(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            desconectarBase();
        }
    }
}
