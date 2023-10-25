
public class AppExcepcion {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("La excepción se manejó en main");
        }
        metodo2();
    }

    public static void metodo1() throws Exception {
        try {
            System.out.println("Metodo1");
            throw new Exception();
        } catch (Exception exception) {
            System.out.println("La excepción se manejó en el método 1");
            throw exception;
        } finally {
            System.out.println("Se ejecutó el finally en metodo 1");
        }
    }

    public static void metodo2() {
        try {
            System.out.println("Método metodo2");
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
        finally {
            System.out.println("Se ejecutó finally en metodo2");
        }
        System.out.println("fin del metodo2");
    }
}
