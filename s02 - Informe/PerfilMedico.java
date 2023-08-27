import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private String sexo;
    private LocalDate fechaNacimiento;
    private double alturaCm;
    private double pesoKg;

    public PerfilMedico(String primerNombre, String apellido, String sexo, int anioNacimiento, int mesNacimiento, int diaNacimiento, double alturaCm, double pesoKg) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        this.alturaCm = alturaCm;
        this.pesoKg = pesoKg;
    }
    public int calcularEdad() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(fechaNacimiento, currentDate);
        return period.getYears();
    }
    public int calcularFrecuenciaCardiacaMaxima() {
        int edad = calcularEdad();
        return (int) Math.round(208 - 0.7 * edad);
    }
    public double calcularIndiceMasaCorporal() {
        double alturaMetros = alturaCm / 100.0;
        return pesoKg / (alturaMetros * alturaMetros);
    }
    public void imprimirPerfil() {
        System.out.println("Información del perfil médico:");
        System.out.println("Nombre completo: " + primerNombre + " " + apellido);
        System.out.println("Sexo: " + sexo);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Altura: " + alturaCm + " cm");
        System.out.println("Peso: " + pesoKg + " kg");
        System.out.println("Edad: " + calcularEdad() + " años");
        System.out.println("Frecuencia Cardiaca Máxima: " + calcularFrecuenciaCardiacaMaxima() + " bpm");
        System.out.println("Índice de Masa Corporal: " + calcularIndiceMasaCorporal());
    }
    public static void main(String[] args) {
        PerfilMedico perfil = new PerfilMedico("Juan", "Perez", "Masculino", 1990, 5, 15, 175.0, 70.0);
        perfil.imprimirPerfil();
    }
}
