import java.util.Scanner;
public class CuentaBanco {
    private String titular;
    private double cantidad;
    public CuentaBanco(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public CuentaBanco(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Titular = " + this.titular + ". Cantidad = " + this.cantidad;
    }
    public void ingresar(double cantidad) {
        if (cantidad < 0) {
            System.out.println("La cantidad introducida es negativa. Fin.");
        }
        this.cantidad += cantidad;
    }
    public void retirar(double cantidad) {
        if ((this.cantidad - cantidad) < 0) {
            this.cantidad = 0;
        }
        this.cantidad -= cantidad;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        CuentaBanco cuenta1 = new CuentaBanco("Juan", 200.50);
        CuentaBanco cuenta2 = new CuentaBanco("Juan");
        System.out.println("cuenta1: "+cuenta1);
        String o;
        do {
            System.out.println("1. Ingresar cantidad");
            System.out.println("2. Retirar cantidad");
            System.out.println("3. Mostrar cuenta");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            o = scanner.nextLine();
            
            switch (o) {
            case "1": System.out.println("Ingrese la cantidad a ingresar:");
                    double Icantidad = input.nextDouble();
                    cuenta1.ingresar(Icantidad);
                    break;
            case "2": System.out.println("Ingrese la cantidad a retirar:");
                    double Rcantidad = input.nextDouble();
                    cuenta1.retirar(Rcantidad);
                    break;
            case "3": System.out.println("cuenta1"+cuenta1);
                    break;
            case "4": System.out.println("Programa terminado ");
                    break;
            default:  System.out.println("Opcion invalida");
                    break;
            }
        }   while (!o.equals("4"));
        scanner.close();
        input.close();
    }
}
