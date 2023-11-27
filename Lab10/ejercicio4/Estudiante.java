package Ejercicios;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String dni, String nombres, String direccion, String carrera) {
        super(dni, nombres, direccion);
        this.carrera = carrera;
    }


    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        if (!super.equals(obj)) {
            return false;
        }

        Estudiante estudiante = (Estudiante) obj;

        return carrera.equals(estudiante.carrera);
    }
    public static Integer buscarPorNombresYCarrera(Estudiante[] array, String nombres, String carrera) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getNombres().equals(nombres) && array[i].getCarrera().equals(carrera)) {
                return i;
            }
        }
        return -1;
    }
}
