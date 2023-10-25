
public class pruebaCatch {
    public static void main(String[] args) {
        int numerador = 8;
        int denominador = 0;

        try {
            int resultado = dividir(numerador, denominador);
            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.err.println("Error de division: " + e.getMessage());
        }
    }

    public static int dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        return numerador / denominador;
    }
}
