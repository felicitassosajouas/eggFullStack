package entidades;
public class Productos {
    private String producto;
    private Integer precio;

    public Productos() {
    }

    public Productos(String producto, Integer precio) {
        this.producto = producto;
        this.precio = precio;
    }


    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
}
