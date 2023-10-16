
public class Auto implements ImpactoEcologico  {

		    private double kilometraje;
		    private double cilindrada;
		   
		    public Auto(double kilometraje, double cilindrada) {
		        this.kilometraje = kilometraje;
		        this.cilindrada = cilindrada;
		    }
		   
		    
		     @Override
		    public double obtenerImpactoEcologico () {
		        double factorEmision = 0.3;
		        double datoActividad = kilometraje * cilindrada;
		        return datoActividad = factorEmision;
		     }
}
