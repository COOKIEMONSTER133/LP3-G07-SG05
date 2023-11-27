package Ejercicios;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ejercicio2 {
    public static void main(String[] args) {
        String[] strArray = {"a", "b", "c", "d", "e", "f", "g"};
        imprimirArray(strArray);
        intercambiarPos(strArray, 0, 2);
    }

    public static <E> void intercambiarPos(E array[], int v1, int v2) {
        List<E> lista = Arrays.asList(array);
        Collections.swap(lista, v1, v2);

        array = lista.toArray(array);

        System.out.println("\nLa posición " + v1 + " fue intercambiada con la posición: " + v2);
        for (E ele : array) {
            if (ele != null)
                System.out.print(ele + ", ");
        }
    }

    public static <E> void imprimirArray(E array[]) {
        for (E ele : array)
            if (ele != null)
                System.out.print(ele + ", ");
                
    }
}
