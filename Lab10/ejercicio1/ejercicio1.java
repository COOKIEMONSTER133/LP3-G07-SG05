package Ejercicios;

public class ejercicio1 {
    public static void main(String[] args) {
       String[] strArray = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};
       imprimirArray(strArray);

       String[] strArray1 = {"Ana", "Beto" , "Carlo", "Daniel", "Ernesto", "Fabian", "Gerardo", "Hugo"};
       imprimirArray(strArray1);
   }

   public static void imprimirArray(String[] array) {
       System.out.println("Array de cadenas contiene:");
       for (String elemento : array) {
           System.out.print("\t" + elemento);
           if (elemento.equals(array[3])){
               System.out.print("\n");
           }
       }
       System.out.println(); 
   }
}
