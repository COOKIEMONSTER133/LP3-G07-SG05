public class TestHerencia {

    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado("Manuel Cortina", 12345678, 28, 5000);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Juan Mota", 55333222, 30, "noche");
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Antonio Camino", 55333666, 35, "Granada");


        System.out.println("Empleado Asalariado:\n" + empleado1.toString());
        System.out.println("\nEmpleado de Produccion:\n" + empleado2.toString());
        System.out.println("\nEmpleado de Distribucion:\n" + empleado3.toString());

      
        System.out.println("\nSalario del Asalariado: $" + empleado1.calcularSalario());
        System.out.println("Salario del empleado de produccion: $" + empleado2.calcularSalario());
        System.out.println("Salario del empleado de distribucion: $" + empleado3.calcularSalario());
    }
}
