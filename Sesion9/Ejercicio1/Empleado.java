
package Empleado;


public class Empleado implements Seriable {
	private static final long serialVersionUID = 1L;
	private int numero;
	private String nombre;
	private int sueldo;
	
	public Empleado(int numero, String nombre, double suel) {
		this.numero = numero;
		this.nombre = nombre;
		this.sueldo = (int) suel;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public static long getSerialVersionuid() {
		return serialVersionUID;
	}
	
	
     
}
