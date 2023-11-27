

public class App {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        Menu menu = new Menu(new String[] { "Agregar Contacto", "Eliminar Contacto", "Mostrar Contactos",
                "Buscar Contacto", "Salir" }, contacts);

        int opcion;
        do {
            menu.mostrarMenu();
            opcion = Integer.parseInt(System.console().readLine());
            menu.elegirOpcion(opcion);
        } while (opcion != 5);
    }
}
