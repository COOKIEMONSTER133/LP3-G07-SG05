import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static int cociente(int numerador, int denominador) {
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner explorador = new Scanner(System.in);
        boolean f1 = true;

        do {
            try {
                System.out.print("Introducir un numerador entero: ");
                int numerador = explorador.nextInt();
                System.out.print("Introduzca un denominador entero: ");
                int denominador = explorador.nextInt();
                int resultado = cociente(numerador, denominador);
                System.out.printf("\nResultado: %d/%d = %d\n", numerador, denominador, resultado);
            } catch (InputMismatchException e) {
                System.out.printf("Excepción: %s\n", e);
                explorador.nextLine();
                System.out.println("Debe introducir enteros. Intente de nuevo... \n");
            } catch (ArithmeticException arithmeticE) {
                System.out.printf("Excepción: %s\n", arithmeticE);
                explorador.nextLine();
                System.out.println("Cero es un denominador inválido. Intente de nuevo... \n");
            }
        } while (f1);
    }
}
