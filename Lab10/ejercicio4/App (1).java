package Ejercicios;

public class App {
    public static void main(String[] args) {
        String[] strArray = {"uno","dos","tres","cuatro","cinco","seis","siete","ocho"};
        System.out.println("Elemento buscado: "+ buscarElemento(strArray, "dos"));

        Producto[] arrayProductos = new Producto[3];
        
        arrayProductos[0] = new Producto("123", "Nueces", 20);
        arrayProductos[1] = new Producto("124", "Caramelos", 2) ;
        arrayProductos[2] = new Producto("125", "Cocina", 500);
        System.out.println("Elemento buscado en array Producto: " + Producto.buscarPorCodigo(arrayProductos, "123"));
        
        Persona[] arrayPersonas = new Persona[3];
        arrayPersonas[0] = new Persona("753402", "Pedro", "Av ejercito");
        arrayPersonas[1] = new Persona("723016", "Maria", "Los rosales");
        arrayPersonas[2] = new Persona("530156", "Lorena", "Pedregal");
        System.out.println("Elemento buscado en array Persona: " + Persona.buscarPorNombres(arrayPersonas, "Pedro"));

        Estudiante[] arrayEstudiantes = new Estudiante[3];
        arrayEstudiantes[0] = new Estudiante("753402", "Pedro", "Av ejercito","Derecho");
        arrayEstudiantes[1] = new Estudiante("723016", "Maria", "Los rosales","Psicologia");
        arrayEstudiantes[2] = new Estudiante("530156", "Lorena", "Pedregal", "Sistemas");
        System.out.println("Elemento buscado en array Estudiante: " + Estudiante.buscarPorNombresYCarrera(arrayEstudiantes, "Maria", "Psicologia"));
    }
    public static <T> Integer buscarElemento(T[] array, T elemento) {
        for (int i = 0; i < array.length; i++) {
            if (elemento == null && array[i] == null) {
                return i;
            } else if (elemento != null && elemento.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
}
