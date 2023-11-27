public class ContenedoraUtils {
    public static <T extends Contenedora<V>, V> boolean verificarExistencia(T[] arreglo, V valor) {
        for (T elemento : arreglo) {
            if (elemento.contiene(valor)) {
                System.out.println("El objeto existe en el arreglo.");
                return true;
            }
        }
        System.out.println("El objeto no existe en el arreglo.");
        return false;
    }
}