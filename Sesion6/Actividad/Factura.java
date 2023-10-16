
public class Factura implements PorPagar{
	private String numeroPieza;
	private String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;
	
	public Factura(String numero, String descripcion, int cantidad, double precioPorArticulo) {
		this.numeroPieza = numero;
		this.descripcionPieza = descripcion;
		this.cantidad = cantidad;
		this.precioPorArticulo = precioPorArticulo;
	}
	
	


	public String getNumeroPieza() {
		return this.numeroPieza;
	}


	public void setNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}


	public String getDescripcionPieza() {
		return this.descripcionPieza;
	}


	public void setDescripcionPieza(String descripcionPieza) {
		this.descripcionPieza = descripcionPieza;
	}


	public int getCantidad() {
		return this.cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecioPorArticulo() {
		return this.precioPorArticulo;
	}


	public void setPrecioPorArticulo(double precioPorArticulo) {
		this.precioPorArticulo = precioPorArticulo;
	}


	public double obtenerMontoPago() {
		
		return this.getCantidad() * this.getPrecioPorArticulo();
	}
	public double pagoAnual() {
		return meses*obtenerMontoPago() - (meses * obtenerMontoPago()*0.05);
	}
	@Override
	public String toString() {
	    return String.format("Número de pieza: %s\nDescripcion: %s\nCantidad: %d\nPrecio por articulo: %.2f",
	        getNumeroPieza(), getDescripcionPieza(), getCantidad(), getPrecioPorArticulo());
	}




	@Override
	public double obtenerMontoPago1() {
		// TODO Auto-generated method stub
		return 0;
	}
}
