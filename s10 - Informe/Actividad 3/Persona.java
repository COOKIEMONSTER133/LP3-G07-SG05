class Persona implements Comparable<Persona> {
    private String dni;
    private String nombres;
    private String direccion;

    public Persona(String dni, String nombres, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
    }

    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' + ", nombres='" + nombres + '\'' + ", direccion='" + direccion + '\'' + '}';
    }

    @Override
    public int compareTo(Persona otraPersona) {
        return this.nombres.compareTo(otraPersona.nombres);
    }
}