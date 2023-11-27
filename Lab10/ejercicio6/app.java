package Ejercicios;

import java.util.Arrays;
import java.util.HashSet;

public class app {
    public static <T> T[] copyArray(T[] array1, T[] array2) {
       HashSet<T> set = new HashSet<>();
       
       for (T element : array1) {
    	   set.add(element);
       }
       
       for (T element : array2) {
    	   set.add(element);
       }
       
       return set.toArray(Arrays.copyOf(array1, 0));
    }
    
    public static void main(String[] args) {
    	String[] arrayStrings1 = {"uno", "dos", "tres"};
    	String[] arrayStrings2 = {"dos", "tres", "cuatro"};
    	String[] resultadoStrings = copyArray (arrayStrings1, arrayStrings2);
    	System.out.println("Array de String sin repetidos: " + Arrays.toString(resultadoStrings));
    	Producto[] arrayProductos1 = {new Producto("001", "Producto1", 10), new Producto("002", "Producto2", 20)};
    	Producto[] arrayProductos2 = {new Producto("002", "Producto2", 20), new Producto("003", "Producto3", 30)};
    	Producto[] resultadoProductos = copyArray(arrayProductos1, arrayProductos2);
    	System.out.println("Array de Productos sin repetidos: " + Arrays.toString(resultadoProductos));
    	
    	Persona[] arrayPersonas1 = {new Persona("111", "Juan", "Direccion1"), new Persona("222", "Ana", "Direccion2")};
    	Persona[] arrayPersonas2 = {new Persona("222", "Ana", "Direccion2"), new Persona("333", "Carlos", "Direccion3")};
    	System.out.println("Array de Personas sin repetidos: " + Arrays.toString(resultadoPersonas));
    }
}