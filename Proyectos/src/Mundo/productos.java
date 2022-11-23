package Mundo;


public class productos{
    
    
    final String nombre;
    private final String descripcion;
    private final String referencia;
    final int precio;

    
    public productos(String nombre, String descripcion, String referencia, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.referencia = referencia;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "producto Agregado{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", referencia=" + referencia + ", precio=" + precio + '}' + "\n";
    }
}
