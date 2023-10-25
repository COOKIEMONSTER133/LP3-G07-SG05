
public  class Bicicleta implements ImpactoEcologico {
        private int distanciaRecorrida;
        
        public Bicicleta(int distanciaRecorrida) {
        
        this.distanciaRecorrida = distanciaRecorrida;
        }

     @Override
      public double obtenerImpactoEcologico () {
          double factorEmision = 0.05;
          double datoActividad = distanciaRecorrida;
          return datoActividad * factorEmision;
     }
 }
