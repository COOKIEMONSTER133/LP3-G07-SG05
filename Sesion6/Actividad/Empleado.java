
public abstract class Empleado implements PorPagar
    {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	
	public Empleado(String nombre, String apellido, String nss) {
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
	}

	abstract public void ingreso();
}