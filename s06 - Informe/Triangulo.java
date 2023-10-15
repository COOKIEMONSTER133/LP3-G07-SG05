public class Triangulo extends FiguraBidimencional {
    private double base = 5;
    private double altura = 5;

    public double obtenerArea() {
        return base * altura;
    }

    public String toString() {
        return "Triangulo con base de: " + base + " y altura de: " + altura;
    }
}
