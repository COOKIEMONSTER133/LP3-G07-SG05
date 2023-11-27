package Ejercicios;


public class ejercicio3 {
    public static void main(String[] args) {
        Integer v1 = 2;
        Object v2 = 3;
        Double v3 = 2.0;
        String v4 = "2";
        System.out.println("La comparacion es " + isEqualTo(v1, v3)); 
    }

    public static <E> boolean isEqualTo(E valor1, E valor2) {
        if (valor1 == null && valor2 == null) {
            return true;
        }
        if (valor1 == null || valor2 == null) {
            return false;
        }
        return valor1.equals(valor2);
        
    }
}
