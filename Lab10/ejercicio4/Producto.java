package Ejercicios;

public class Producto {
    private String codigo;
    private String descripcion;
    private Integer precio;
    
    public Producto(String codigo, String descripcion, Integer precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto(int i, String descripcion2, double d) {
		// TODO Auto-generated constructor stub
	}

	public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setPrecio(Integer precio){
        this.precio = precio;
    }
    public Integer getPrecio(){
        return this.precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Producto producto = (Producto) obj;

        return codigo.equals(producto.codigo) &&
               descripcion.equals(producto.descripcion) &&
               precio.equals(producto.precio);
    }

    public static Integer buscarPorCodigo(Producto[] array, String codigo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }
    
    public String toString (){
        return this.codigo + " " + this.descripcion + " " + this.precio;
    }
}
