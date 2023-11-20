public class App {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = {5, 2, 3, 4, 1};
        Double[] doubleArray = {1.1, 5.5, 3.3, 4.4, 2.2};
        Character[] charArray = {'z', 'x', 'y', 'w', 'v'};
        Persona[] personaArray = {
            new Persona("12323545", "Juan Quispe", "123 Av. Ejercito"),
            new Persona("67891230", "Julio Velarde", "456 Calle Melgar"),
            new Persona("82371204", "Daniel Rios", "456 Av. Bolivar"),
            new Persona("98237523", "Pedro Velarde", "94 Calle Cristo Rey")
        };

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);

        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);

        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);

        System.out.printf("%nArray personaArray contiene:%n");
        imprimirArray(personaArray);
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);
        System.out.println();
    }
}