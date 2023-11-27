
public class Persona {
    private String nombre;
    private String numeroTelefono;

    public Persona(String nombre, String numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Número de Teléfono: " + numeroTelefono;
    }
}
