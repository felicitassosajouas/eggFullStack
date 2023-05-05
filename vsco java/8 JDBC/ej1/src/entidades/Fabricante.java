package entidades;

public class Fabricante {
        private String nombre;
        private int codigo;
    
        public Fabricante() {
        }
    
        public Fabricante(String nombre, int codigo) {
            this.nombre = nombre;
            this.codigo = codigo;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public int getCodigo() {
            return codigo;
        }
    
        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }
    
        @Override
        public String toString() {
            return "Fabricante{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
        }
        
}
