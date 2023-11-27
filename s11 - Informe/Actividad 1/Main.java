public class Main {
    public static void main(String[] args) {
        
        Persona[] personas = {new Persona("Nombre1", "Direccion1", "Telefono1"),
                              new Persona("Nombre2", "Direccion2", "Telefono2")};
        ContenedoraUtils.verificarExistencia(personas, "Nombre1"); 

        
        Goodies[] goodies = {new Goodies(1, "Descripción1", 10.0f),
                             new Goodies(2, "Descripción2", 20.0f)};
        ContenedoraUtils.verificarExistencia(goodies, 1);

        
        Estudiante[] estudiantes = {new Estudiante("Estudiante1", "Direccion1", "Telefono1", "Especialidad1", new Procedencia("Departamento1", "Provincia1")),
                                    new Estudiante("Estudiante2", "Direccion2", "Telefono2", "Especialidad2", new Procedencia("Departamento2", "Provincia2"))};
        ContenedoraUtils.verificarExistencia(estudiantes, "Estudiante1");
    }
}