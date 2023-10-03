
public class EmpleadoDistribucion extends Asalariado {
    private String region;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String region) {
        super(nombre, dni, diasVacaciones);
        this.region = region;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String nueva_region) {
        this.region = nueva_region;
    }

    @Override
    public double calcularSalario() {
        return super.getsalarioBase() * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRegión: " + region + "\nSalario: " + calcularSalario();
    }
}
