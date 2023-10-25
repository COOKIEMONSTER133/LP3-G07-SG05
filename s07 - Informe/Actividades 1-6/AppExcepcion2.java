public class AppExcepcion2 {
    public static void main(String[] args) {
        validaPropia(15); 
    }
    public static void validaPropia (int n) {
        try {
            minimo (n);
            System.out.println(n + " es mayor a 10");
            }
        catch (MiExcepcion e) {
            System.out.println("No me sirve ese número");
            e.printStackTrace();
            }
    }
    public static void minimo (int numero) throws MiExcepcion { 
        if (numero <= 10)
            throw new MiExcepcion ("Necesito un numero mayor a 10");
    }


    public static void metodo1() throws Exception {
        try {
            System.out.println("Metodo1");
            throw new Exception();
        }
        catch (Exception excepcion) {
            System.out.println("La excepcion se manejo en el metodo1"); 
            throw excepcion;
        }
        finally {
            System.out.println("Se ejecuto finally en metodo1");
        }
    }
    public static void metodo2() {
        try {
            System.out.println("Metodo metodo2");
        }
        catch (Exception excepcion) {
        System.out.println(excepcion);
        }
        finally {
            System.out.println("Se ejecuto finally en metodo2");
            System.out.println("Fin del metodo2");
        }
    }
}