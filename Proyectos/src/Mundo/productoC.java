
package Mundo;

public class productoC extends productos {
    public productoC(String nombre, String descripcion, String referencia, int precio) {
        super(nombre, descripcion, referencia, precio);
    }

     @Override
    public String toString() {
        return "ProductoC\n" + super.toString();
    }
}
