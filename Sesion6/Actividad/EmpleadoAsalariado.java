
public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        establecerSalarioSemanal(salario);
    }

    public void establecerSalarioSemanal(double salario) {
        salarioSemanal = salario;
    }

    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    @Override
    public double obtenerMontoPago() {
        return salarioSemanal;
    }

    @Override
    public double obtenerMontoPago1() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Empleado Asalariado: %s %s\nSalario Semanal: S/.%.2f", getNombre(), getApellido(), salarioSemanal);
    }

	private Object getApellido() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ingreso() {
		// TODO Auto-generated method stub
		
	}
}
