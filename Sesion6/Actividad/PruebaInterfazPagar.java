
public class PruebaInterfazPagar {
    
    public static void main(String[] args) {
        PorPagar[] objetPorPagar = new PorPagar[5];
        
        objetPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetPorPagar[4] = new Prestamo(12, 5000.00);
        
        System.out.println("Facturas y Empleados procesados en forma polimorfica:\n");
        for (PorPagar porPagarActual : objetPorPagar) {
            if (porPagarActual != null) {
                System.out.printf("%s\n%s: S/.%,.2f\n\n", porPagarActual.toString(), "Pago vencido", porPagarActual.obtenerMontoPago());
            }
        }
    }
}
