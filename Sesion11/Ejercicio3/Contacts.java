import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contacts {
    private Map<String, Persona> contactos;
    private Scanner scanner;

    public Contacts() {
        contactos = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void agregarContacto() {
        System.out.print("\nIngrese el DNI: ");
        String dni = scanner.next();
        System.out.print("Ingrese el Nombre de uno de sus contactos: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el Número de Teléfono: ");
        String numeroTelefono = scanner.next();

        Persona nuevaPersona = new Persona(nombre, numeroTelefono);
        contactos.put(dni, nuevaPersona);
        System.out.println("Contacto agregado exitosamente.");
    }

    public void eliminarContacto() {
        System.out.println("\nIngrese el DNI del contacto a eliminar: ");
        String dni = scanner.next();

        if (contactos.containsKey(dni)) {
            contactos.remove(dni);
            System.out.println("Contacto eliminado exitosamente.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void mostrarContactos() {
        System.out.println("\nContactos:");
        contactos.forEach((dni, persona) -> System.out.println(dni + ": " + persona));
    }

    public void buscarContacto() {
        System.out.println("\nIngrese el DNI a buscar: ");
        String dni = scanner.next();

        if (contactos.containsKey(dni)) {
            Persona personaEncontrada = contactos.get(dni);
            System.out.println("Contacto encontrado: " + personaEncontrada);
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }
}
