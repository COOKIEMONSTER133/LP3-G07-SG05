public class App {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = {5, 2, 3, 4, 1};
        Double[] doubleArray = {1.1, 5.5, 3.3, 4.4, 2.2};
        String[] stringArray = {"z", "x", "y", "w", "v"};
        Persona[] personaArray = {
            new Persona("12323545", "Juan Quispe", "123 Av. Ejercito"),
            new Persona("67891230", "Julio Velarde", "456 Calle Melgar"),
            new Persona("82371204", "Daniel Rios", "456 Av. Bolivar"),
            new Persona("98237523", "Pedro Velarde", "94 Calle Cristo Rey")
        };

        System.out.println("El mínimo en intArray es: " + minimo(intArray));
        System.out.println("El mínimo en doubleArray es: " + minimo(doubleArray));
        System.out.println("El mínimo en stringArray es: " + minimo(stringArray));
        System.out.println("El mínimo en personaArray es: " + minimo(personaArray));
    }

    public static <T extends Comparable<T>> T minimo(T[] inputArray) {
        T min = inputArray[0];
        for (T elemento : inputArray) {
            if (elemento.compareTo(min) < 0) {
                min = elemento;
            }
        }
        return min;
    }
}