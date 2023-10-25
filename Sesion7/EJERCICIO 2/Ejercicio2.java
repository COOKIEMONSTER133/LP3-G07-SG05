
public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            metodo("42");
        } catch (Exception e) {
        	System.out.println(metodo("w"));

            e.printStackTrace();
        }
    }

    private static int metodo(String num) {
        int valor = 0;
        try {
            valor++;
            valor += Integer.parseInt(num);
            valor++;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {
            valor += Integer.parseInt("42");
            System.out.println("Valor al final del catch: " + valor);
            throw e;
        } finally {
            valor++;
            System.out.println("Valor al final de finally: " + valor);
        }
        valor++;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}
