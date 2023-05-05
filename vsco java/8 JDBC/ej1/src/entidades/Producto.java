package entidades;

import java.util.ArrayList;

public class Producto {
    private int codigo;
    private String nombre;
    private int codigo_fabricante;
    private double precio;

    public Producto() {
    }

    public Producto(int codigo, String nombre, int codigo_fabricante, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigo_fabricante = codigo_fabricante;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo_fabricante() {
        return codigo_fabricante;
    }

    public void setCodigo_fabricante(int condigo_fabricante) {
        this.codigo_fabricante = condigo_fabricante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", codigo_fabricante=" + codigo_fabricante + ", precio=" + precio + '}';
    }

    public void setFabricantes(ArrayList<Fabricante> fabricantes) {
    }

}
