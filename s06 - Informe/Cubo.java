public class Cubo extends FiguraTridimencional {
    private double lado = 5;

    public double obtenerArea() {
        return 6 * Math.pow(lado, 2);
    }

    public double obtenerVolumen() {
        return Math.pow(lado, 3);
    }

    public String toString() {
        return "Cubo con lados de: " + lado;
    }
}
