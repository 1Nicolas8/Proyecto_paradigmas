package interFaz;

import java.util.ArrayList;
import Mundo.*;
import java.util.Scanner;

public class Pricipal {

    
    private final String Propietario;
    ArrayList<productos> po;
    
    Scanner NANM = new Scanner(System.in);
    
    public Pricipal(String Propietario) {
        this.Propietario = Propietario;
        po = new ArrayList<>();
    }
    
    public void agregarProducto(productos pro){
        po.add(pro);
    }
    public String mostrarProductos(){
        return po.toString();
    }
    public String consultarProducto(String referencia){
        for(productos cPro : po)
            if(cPro.getReferencia().equalsIgnoreCase(referencia))
                return "producto encontrado";
        
        return referencia + " no está disponible ";
    }
    public static void main(String[] args) {
        Scanner ANMN = new Scanner(System.in);
        String Propietario, email, direccion;
        int fechaNa;
        long tel;
        System.out.println(" Ingrese el nombre de usuario ");
        Propietario = ANMN.nextLine();
        System.out.println(" Ingrese la fecha de nacimiento: ");
        fechaNa = ANMN.nextInt();
        System.out.println(" Ingrese el telefono: ");
        tel = ANMN.nextLong();
        ANMN.nextLine();
        System.out.println(" Ingrese el correo del propietario: ");
        email = ANMN.nextLine();
        System.out.println(" Ingrese la direccion del propietario: ");
        direccion = ANMN.nextLine();
        System.out.println(new Persona(Propietario,fechaNa,tel,email,direccion));
        Pricipal MNAN = new Pricipal(Propietario);
        String nombre, descripcion, referencia;
        int precio;

        int opcion, opcionProducto;

        while(true){
            System.out.println("Seleccione una opción");
            System.out.println("1. Ingresar un producto");
            System.out.println("2. Mostrar lista de productos");
            System.out.println("3. Consultar un producto");
            System.out.println("0. Salir");
            opcion = ANMN.nextInt();
            ANMN.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Seleccione tipo de producto");
                    System.out.println("1. ProductoA");
                    System.out.println("2. ProductoB");
                    System.out.println("3. ProductoC");
                    opcionProducto = ANMN.nextInt();
                    ANMN.nextLine();
                    
                    System.out.println("Ingrese la referencia del producto: ");
                    referencia = ANMN.nextLine();
                    System.out.println("Ingrese el nombre del producto: ");
                    nombre = ANMN.nextLine();
                    System.out.println("Ingrese la descripcion: ");
                    descripcion = ANMN.nextLine();
                    System.out.println("Ingrese el precio: ");
                    precio = ANMN.nextInt();

                    switch(opcionProducto){
                        case 1: 
                            MNAN.agregarProducto(new productoA(nombre,descripcion,referencia,precio)); 
                            break;
                        case 2:
                            MNAN.agregarProducto(new productoC(nombre,descripcion,referencia,precio));
                            break;
                        case 3:
                            MNAN.agregarProducto(new productoB(nombre,descripcion,referencia,precio));
                            break;
                        case 0:
                            break;
                        default:
                            break;
                    }

                case 2:
                    System.out.println(MNAN.mostrarProductos());
                    break;
                case 3:
                    System.out.println("Ingrese la referencia del producto: ");
                    referencia = ANMN.nextLine();
                    System.out.println(MNAN.consultarProducto(referencia));
                    break; 
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no encontrada");
                     break;
            }
        }
    }
}
