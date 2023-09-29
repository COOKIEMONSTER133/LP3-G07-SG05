public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    private char tipoCliente;

    public Persona(int id, String nombre, String apellido, int numero, char tipoCliente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta(numero);
        this.tipoCliente = tipoCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String toString() {
        return "id: " + id + " nombre: " + nombre + " apellido: " + apellido + " Cuenta: " + cuenta + " Tipo cliente: "
                + tipoCliente;
    }
}
