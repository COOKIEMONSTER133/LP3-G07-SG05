
public class Asalariado {
             
	private String nombre;
	private long dni;
	private int diasVacaciones;
	private double salarioBase;
	
	public Asalariado(String nombre, long dni, int diasVacaciones, double salarioBase) {
           this.nombre = nombre;
	       this.dni = dni;
	       this.diasVacaciones = diasVacaciones;
	       this.salarioBase = salarioBase;
} 

	public Asalariado(String nombre2, long dni2, int diasVacaciones2) {
	
	}

	public double calcularSalario() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nuevo_nombre) {
		this.nombre = nuevo_nombre;
	}

	public long getDni() {
		return this.dni;
	}

	public void setDni(long nuevo_dni) {
		this.dni = nuevo_dni;
	}

	public int getDiasVacaciones() {
		return this.diasVacaciones;
	}

	public void setDiasVacaciones(int nuevo_diasVacaciones) {
		this.diasVacaciones = nuevo_diasVacaciones;
	}

	public double getsalarioBase() {
		
		return 0;
	}
	  @Override
	    public String toString() {
	        return "DNI: " + dni + "\nNombre: " + nombre + "\nDias de Vacaciones: " + diasVacaciones
	                + "\nSalario Base: " + salarioBase;
	    }
}