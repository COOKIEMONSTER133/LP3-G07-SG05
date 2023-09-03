public class Manejador {
    
    public static double Area(Rectangulo r) { 
        return r.getAncho() * r.getAlto(); 
    }
    public static double Perimetro(Rectangulo r) {
        return 2 * (r.getAncho() + r.getAlto()); 
    }
    public static void moverX(Rectangulo r, int dx) {
        Coordenada c1 = r.getEsquina1();
        Coordenada c2 = r.getEsquina2();
        c1.setX(c1.getX() + dx);
        c2.setX(c2.getX() + dx);
    }
    public static void moverY(Rectangulo r, int dy) {
        Coordenada c1 = r.getEsquina1();
        Coordenada c2 = r.getEsquina2();
        c1.setY(c1.getY() + dy);
        c2.setY(c2.getY() + dy);
    }

}