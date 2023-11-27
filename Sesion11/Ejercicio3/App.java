import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        Menu menu = new Menu(new String[] { "Agregar Contacto", "Eliminar Contacto", "Mostrar Contactos",
                "Buscar Contacto", "Salir" }, contacts);

        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            menu.mostrarMenu();
            
          
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese un número válido.");
                scanner.next(); 
            }

            opcion = scanner.nextInt();
            menu.elegirOpcion(opcion);
        } while (opcion != 5);


        scanner.close();
    }
}
