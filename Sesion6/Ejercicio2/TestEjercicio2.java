import java.util.ArrayList;

public class TestEjercicio2 {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        
        Edificio edificio = new Edificio(1000, 500);
        Auto auto = new Auto(5000, 2.0);
        Bicicleta bicicleta = new Bicicleta(100);
        
        objetos.add(edificio);
        objetos.add(auto);
        objetos.add(bicicleta);
        
        for (ImpactoEcologico objeto : objetos) {
            if (objeto instanceof Edificio) {
                System.out.println("Edificio - Impacto ecologico: " + objeto.obtenerImpactoEcologico());
            } else if (objeto instanceof Auto) {
                System.out.println("Auto - Impacto ecologico: " + objeto.obtenerImpactoEcologico());
            } else if (objeto instanceof Bicicleta) {
                System.out.println("Bicicleta - Impacto ecologico: " + objeto.obtenerImpactoEcologico());
            }
        }
    }
}
