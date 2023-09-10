import java.util.Random;

public class EvaluacionCrediticia {
    public static void main(String[] args) {
        int totalPersonas = 8;
        int[] sexo = new int[totalPersonas];
        int[] trabaja = new int[totalPersonas];
        int[] sueldo = new int[totalPersonas];

        Random random = new Random();
        for (int i = 0; i < totalPersonas; i++) {
            sexo[i] = random.nextInt(2) + 1;
            trabaja[i] = random.nextInt(2) + 1;
            if (trabaja[i] == 1) {
                sueldo[i] = random.nextInt(2051) + 950;
            } else {
                sueldo[i] = 0;
            }
        }
        int hombres = 0;
        int mujeres = 0;
        int hombresTrabajan = 0;
        int mujeresTrabajan = 0;
        int totalSueldoHombres = 0;
        int totalSueldoMujeres = 0;
        for (int i = 0; i < totalPersonas; i++) {
            if (sexo[i] == 1) {
                hombres++;
                if (trabaja[i] == 1) {
                    hombresTrabajan++;
                    totalSueldoHombres += sueldo[i];
                }
            } else {
                mujeres++;
                if (trabaja[i] == 1) {
                    mujeresTrabajan++;
                    totalSueldoMujeres += sueldo[i];
                }
            }
        }
        double porcentajeHombres = (double) hombres / totalPersonas * 100;
        double porcentajeMujeres = (double) mujeres / totalPersonas * 100;
        double porcentajeHombresTrabajan = (double) hombresTrabajan / hombres * 100;
        double porcentajeMujeresTrabajan = (double) mujeresTrabajan / mujeres * 100;
        double sueldoPromedioHombres = hombresTrabajan == 0 ? 0 : (double) totalSueldoHombres / hombresTrabajan;
        double sueldoPromedioMujeres = mujeresTrabajan == 0 ? 0 : (double) totalSueldoMujeres / mujeresTrabajan;
        System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("Porcentaje de hombres que trabajan: " + porcentajeHombresTrabajan + "%");
        System.out.println("Porcentaje de mujeres que trabajan: " + porcentajeMujeresTrabajan + "%");
        System.out.println("Sueldo promedio de los hombres que trabajan: " + sueldoPromedioHombres);
        System.out.println("Sueldo promedio de las mujeres que trabajan: " + sueldoPromedioMujeres);
    }
}