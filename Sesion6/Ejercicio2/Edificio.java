
public class Edificio implements ImpactoEcologico {
    private double consumoEnergia;
    private double area;
    
    public Edificio (double consumoEnergia, double area) {
        this.consumoEnergia = consumoEnergia;
        this.area = area;
    }
     @Override
    public double obtenerImpactoEcologico () {
        double factorEmision = 0.5;
        double datoActividad = consumoEnergia * area;
        return datoActividad * factorEmision;
        }
}