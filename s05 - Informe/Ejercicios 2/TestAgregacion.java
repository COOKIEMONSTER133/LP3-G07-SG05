public class TestAgregacion {
    public static void main(String[] args) {
        Motor motor1 = new Motor(12345, 2000);
        Automovil automovil1 = new Automovil("ABC123", 4, "Toyota", "Camry");
        automovil1.setMotor(motor1);
        Automovil automovil2 = new Automovil("XYZ789", 2, "Honda", "Civic");
        automovil2.setMotor(new Motor(67890, 2500));

        System.out.println("Datos del Automóvil 1:");
        System.out.println(automovil1);
        System.out.println("\nDatos del Automóvil 2:");
        System.out.println(automovil2);
    }
}
