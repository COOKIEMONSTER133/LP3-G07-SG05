package Ejercicios;

public class ejercicio5<T extends Number> {
    public static <T extends Number> Integer buscarPorValorNumerico(T[] array, T valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arrayEnteros = {1, 2, 3, 4, 5};
        System.out.println("Elemento buscado: " + buscarPorValorNumerico(arrayEnteros, 3));
    }
}
