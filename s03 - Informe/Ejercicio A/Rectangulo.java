public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    private String color;
    private static String ultimoColor = "Rojo";
    public Rectangulo(Coordenada c1, Coordenada c2) {
        esquina1 = c1;
        esquina2 = c2;
        if (ultimoColor.equals ("Verde")) {
            color = "Amarillo";
            ultimoColor = "Amarillo";
        } else if (ultimoColor.equals ("Amarillo")) {
            color = "Rojo";
            ultimoColor = "Rojo";
        } else if (ultimoColor.equals ("Rojo")) {
            color = "Verde";
            ultimoColor = "Verde";
        }
    }
    public Coordenada getEsquina1() {
        return esquina1;
    }
    public void setEsquina1(Coordenada c) {
        esquina1 = c;
    }
    public Coordenada getEsquina2() {
        return esquina2;
    }
    public void setEsquina2(Coordenada c) {
        esquina2 = c;
    }
    public double getAncho() {
        return Math.abs(esquina2.getX() - esquina1.getX());
    }
    public double getAlto() {
        return Math.abs(esquina2.getY() - esquina1.getY());
    }
    public String getColor() {
        return color;
    }
    public static String getUltimoColor() {
        return ultimoColor;
    }
    public String toString() {
        return esquina1 + " " + esquina2 + " " + color;
    }

}