public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[6];

        figuras[0] = new Circulo();
        figuras[1] = new Cuadrado();
        figuras[2] = new Triangulo();
        figuras[3] = new Cubo();
        figuras[4] = new Esfera();
        figuras[5] = new Tetraedro();

        for (Figura ofigura : figuras) {
            System.out.println("Descripción: " + ofigura.toString());

            if (ofigura instanceof FiguraBidimencional) {
                System.out.println(
                        "FiguraBidimencional: " + "\n" + "Area: " + ((FiguraBidimencional) ofigura).obtenerArea());
            } else if (ofigura instanceof FiguraTridimencional) {
                System.out.println("FiguraTridimencional: ");
                System.out.println("Area: " + ((FiguraTridimencional) ofigura).obtenerArea());
                System.out.println("Volumen: " + ((FiguraTridimencional) ofigura).obtenerVolumen());
            }

            System.out.println();
        }
    }
}