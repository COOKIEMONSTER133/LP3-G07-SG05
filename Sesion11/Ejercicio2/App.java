package ejercicio2;

public class App {
    public static void main(String[] args) {
        Dictionary<String, Integer> dictionary = new Dictionary<>();

        dictionary.add("uno", 1);
        dictionary.add("dos", 2);
        dictionary.add("tres", 3);

        System.out.println("Contenido del diccionario:");
        System.out.println(dictionary);

        try {
            System.out.println("valor para key 'dos': " + dictionary.getValue("dos"));
            System.out.println("eliminando key 'dos': " + dictionary.delete("dos"));
            System.out.println("valor para la key 'dos' despues de su eliminacion: " + dictionary.getValue("dos"));
        } catch (ObjectNoExist e) {
            System.out.println(e.getMessage());
        }
    }
}
