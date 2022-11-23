package Mundo;


public  class Persona{

    
    private final String Nombre;
    private final int FechaNacimiento;
    private long Telefono;
    private String email;
    private String direccion;
    

    public Persona(String Nombre, int FechaNacimiento, long Telefono, String email, String direccion) {
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.email = email;
        this.direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getFechaNacimiento() {
        String fecha="";
        fecha += FechaNacimiento/10000 + "/";
        fecha += FechaNacimiento%10000/100 + "/";
        fecha += FechaNacimiento%100;
        
        return fecha;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Usuario Registrado{" + "Nombre=" + Nombre + ", FechaNacimiento=" + FechaNacimiento + ", Telefono=" + Telefono + ", email=" + email + ", direccion=" + direccion + '}';
    }
    /** toString de los atributos
     * @return  */  
}
