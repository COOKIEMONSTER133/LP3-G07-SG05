package Ejercicios;

public class Persona {
    private String dni;
    private String nombres;
    private String direccion;

    public Persona(String dni, String nombres, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }

   
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Persona persona = (Persona) obj;

        return dni.equals(persona.dni) &&
               nombres.equals(persona.nombres) &&
               direccion.equals(persona.direccion);
    }
    public static Integer buscarPorNombres(Persona[] array, String nombres) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getNombres().equals(nombres)) {
                return i;
            }
        }
        return -1;
    }
}