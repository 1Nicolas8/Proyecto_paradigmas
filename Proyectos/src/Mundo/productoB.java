
package Mundo;

public class productoB extends productos {
    public productoB(String nombre, String descripcion, String referencia, int precio) {
        super(nombre, descripcion, referencia, precio);
    }
    
    @Override
    public String toString() {
        return "ProductoB\n" + super.toString();
    }
}
