
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String tipo;
    private Cuenta cuenta;

    public Persona(int id, String nombre, String apellido, String tipo, int num) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.cuenta = new Cuenta(100 + num);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cuenta getCuenta() {
        return this.cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String toString() {
        return this.id + "\t " + this.nombre + "\t" + this.apellido + "\t " + this.tipo + "\t " + this.cuenta.toString();
    }
}
