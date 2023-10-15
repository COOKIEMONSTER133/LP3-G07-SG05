public class Esfera extends FiguraTridimencional {
    private double radio = 5;

    public double obtenerArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public String toString() {
        return "Esfera con radio de: " + radio;
    }
}
