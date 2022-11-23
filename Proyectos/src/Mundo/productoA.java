
package Mundo;

public class productoA extends productos {

    public productoA(String nombre, String descripcion, String referencia, int precio) {
        super(nombre, descripcion, referencia, precio);
    }
    
    @Override
    public String toString() {
        return "ProductoA\n" + super.toString();
    }
    
    
}

    

