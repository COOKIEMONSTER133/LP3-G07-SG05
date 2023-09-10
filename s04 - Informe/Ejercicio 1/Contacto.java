import java.util.ArrayList;
import java.util.Scanner;
public class Contacto {
    private String nombre;
    private String telefono;
    private String direccion;
    public Contacto(String nombre, String telefono, String direccion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    } 
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public static void main(String[] args){
        ArrayList<Contacto> contactos = new ArrayList<Contacto>();
        Scanner scanner = new Scanner (System.in);
        int o;
        do{
            System.out.println("1. Aniadir contacto\n2. Buscar contacto\n3. Modificar contacto\n4. Borrar contacto\n5. Eliminar contacto\n6. Mostrar contactos\n7. Salir");
            System.out.print("Ingrese una opcion: ");
            o = scanner.nextInt();
            switch (o) {
                case 1:
                System.out.print("Nombre: ");
                String nombre = scanner.next();
                System.out.print("Telefono: ");
                String telefono = scanner.next();
                System.out.print("Direccion: ");
                String direccion = scanner.next();
                contactos.add(new Contacto(nombre, telefono, direccion));
                System.out.println("Contacto aniadido correctamente.");
                break;

                case 2:
                System.out.println("Introduce el nombre del contacto a buscar: ");
                String nombreBuscado = scanner.next();
                boolean encontrado = false;
                for (Contacto contacto : contactos) {
                    if (contacto.getNombre().equals(nombreBuscado)) {
                        System.out.println("Nombre: " + contacto.getNombre());
                        System.out.println("Teléfono: " + contacto.getTelefono());
                        System.out.println("Dirección: " + contacto.getDireccion());
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Contacto no encontrado.");
                }
                break;

                case 3:
                System.out.print("Introduce el nombre del contacto a modificar: ");
                String nombreModificar = scanner.next();
                boolean modificado = false;
                for (Contacto contacto : contactos) {
                    if (contacto.getNombre().equals(nombreModificar)) {
                        System.out.print("Nuevo nombre: ");
                        String nuevoNombre = scanner.next();
                        System.out.print("Nuevo telefono: ");
                        String nuevoTelefono = scanner.next();
                        System.out.print("Nueva direccion: ");
                        String nuevaDireccion = scanner.next();
                        contacto.setNombre(nuevoNombre);
                        contacto.setTelefono(nuevoTelefono);
                        contacto.setDireccion(nuevaDireccion);
                        System.out.println("Contacto modificado correctamente.");
                        modificado = true;
                        break;
                    }
                }
                if (!modificado) {
                    System.out.println("Contacto no encontrado.");
                }
                break;

                case 4:
                System.out.print("Introduce el nombre del contacto a borrar: ");
                String nombreBorrar = scanner.next();
                boolean borrado = false;
                for (Contacto contacto : contactos) {
                    if (contacto.getNombre().equals(nombreBorrar)) {
                        contactos.remove(contacto);
                        System.out.println("Contacto borrado correctamente.");
                        borrado = true;
                        break;
                    }
                }
                if (!borrado) {
                    System.out.println("Contacto no encontrado.");
                }
                break;

                case 5:
                System.out.print("Introduce el nombre del contacto a eliminar: ");
                String nombreEliminar = scanner.next();
                boolean eliminado = false;
                for (Contacto contacto : contactos) {
                    if (contacto.getNombre().equals(nombreEliminar)) {
                        contactos.remove(contacto);
                        System.out.println("Contacto eliminado correctamente.");
                        eliminado = true;
                        break;
                    }
                }
                if (!eliminado) {
                    System.out.println("Contacto no encontrado.");
                }
                break;

                case 6:
                System.out.println("Lista de contactos:");
                for (Contacto contacto : contactos) {
                    System.out.println("Nombre: " + contacto.getNombre());
                    System.out.println("Telefono: " + contacto.getTelefono());
                    System.out.println("Direccion: " + contacto.getDireccion());
                    System.out.println("--------------------");
                }
                break;

                case 7:
                System.out.println("Saliendo de la aplicación...");
                break;

                default:
                System.out.println("Opción no valida. Ingrese una nueva.");
                break;
            }
        } while (o != 7);
        scanner.close();
    }
}