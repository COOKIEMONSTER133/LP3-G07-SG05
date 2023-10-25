import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        LeerEntrada lector = new LeerEntrada(System.in);
        System.out.println("Determine caracteres para evaluar: ");
        while (true) {
            try {
                char caracter = lector.getChar();
                procesar(caracter);
            } catch (ExcepcionVocal e) {
                System.out.println("Excepción de vocal: " + e.getMessage());
            } catch (ExcepcionNumero e) {
                System.out.println("Excepción de número: " + e.getMessage());
            } catch (ExcepcionBlanco e) {
                System.out.println("Excepción de blanco: " + e.getMessage());
            } catch (ExcepcionSalida e) {
                System.out.println("Excepción de salida: " + e.getMessage());
                break; 
            } catch (IOException e) {
                System.err.println("Error!: " + e.getMessage());
            }
        }
    }

    private static void procesar(char caracter) throws ExcepcionVocal, ExcepcionNumero, ExcepcionBlanco, ExcepcionSalida {
        if (Character.isDigit(caracter)) {
            throw new ExcepcionNumero("Carácter es un número: " + caracter);
        } else if (Character.isWhitespace(caracter)) {
            throw new ExcepcionBlanco("Carácter es un espacio en blanco: " + caracter);
        } else if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            throw new ExcepcionVocal("Carácter es una vocal: " + caracter);
        } else if (caracter == 'q') {
            throw new ExcepcionSalida("Carácter de salida detectado: " + caracter);
        }
    }
}