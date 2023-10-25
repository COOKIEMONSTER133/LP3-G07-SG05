
public class Main1 {
    
     public static void main (String[] args) throws Exception
                                                             {
        double[] V = new double[15];
        acceso(V, 16);
     }
     public static double acceso(double[] v, int j) throws Exception{
        try {
             if (j >= 0 && j <= v.length)
                 return v[j];
             else
                throw new Exception("E1 indice " + j + "no existe en el vector");
         }
         catch (Exception exc) {
             throw exc;
         }
    }
}
