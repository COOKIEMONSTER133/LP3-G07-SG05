import java.util.Scanner;
public class Ventas {
    public static void main(String[] args) {
        int[][] ventas = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Ingrese ventas del vendedor %d para el producto %d: ", i + 1, j + 1);
                ventas[j][i] = scanner.nextInt();
            }
        }
        int[] totalPorVendedor = new int[5];
        int[] totalPorProducto = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                totalPorVendedor[i] += ventas[j][i];
                totalPorProducto[j] += ventas[j][i];
            }
        }
        System.out.println("\nResumen de Ventas");
        System.out.println("Producto | Vendedor 1 | Vendedor 2 | Vendedor 3 | Vendedor 4 | Vendedor 5 | Total");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%8d |", i + 1);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%12d |", ventas[i][j]);
            }
            System.out.printf("%10d\n", totalPorProducto[i]);
        }
        System.out.println("---------------------------------------------");
        System.out.print("Total    |");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%12d |", totalPorVendedor[i]);
        }
        System.out.println();
        scanner.close();
    }
}