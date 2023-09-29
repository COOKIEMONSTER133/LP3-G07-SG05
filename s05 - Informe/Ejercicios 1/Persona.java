public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    private char tipoCliente;

    public Persona(int id, String nombre, String apellido, char tipoCliente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = tipoCliente;

        String numero = "0";
        switch (tipoCliente) {
            case 'C':
                numero = "C1000";
                break;
            case 'B':
                numero = "B5000";
                break;
            case 'E':
                numero = "E8000";
                break;
            default:
                System.out.println("Tipo de cliente no valido");
                break;
        }
        this.cuenta = new Cuenta(numero, 0);
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
        return "Cliente: " + id + "\n" + "Tipo:    " + tipoCliente + "\n" + "Nombres: " + nombre + " " + apellido + "\n"
                + "No.Cuenta: " + cuenta;
    }
}
