public class Circulo extends FiguraBidimencional {
    private double radio = 5;

    public double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public String toString() {
        return "Circulo con radio de: " + radio;
    }
}
