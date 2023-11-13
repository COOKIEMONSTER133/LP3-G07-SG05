import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Binarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        double[][] matriz;
        int filas, columnas, i, j;

        System.out.print("Número de filas: ");
        filas = sc.nextInt();
        while (filas <= 0) {
            System.out.print("Número de filas debe ser mayor que 0. Intente de nuevo: ");
            filas = sc.nextInt();
        }

        System.out.print("Número de columnas: ");
        columnas = sc.nextInt();
        while (columnas <= 0) {
            System.out.print("Número de columnas debe ser mayor que 0. Intente de nuevo: ");
            columnas = sc.nextInt();
        }

        matriz = new double[filas][columnas]; // Se crea la matriz

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                // Lectura de datos por teclado
                System.out.print("matriz(" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        try {
            
            fos = new FileOutputStream("C:\\Users\\Rambo\\Downloads\\UNIVERSITY\\SEMESTER IV\\Phase 3\\LENGUAJES DE PROGRAMACION III\\s09 - Informe\\Actividad 3\\test1.txt");
            salida = new DataOutputStream(fos);

            salida.writeInt(filas);
            salida.writeInt(columnas);

            for (i = 0; i < filas; i++) {
                for (j = 0; j < columnas; j++) {
                    salida.writeDouble(matriz[i][j]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
