public class Principal {
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada(1,6);
        Coordenada c2 = new Coordenada(0,0);
        Rectangulo r1 = new Rectangulo(c1,c2);
        System.out.println(r1);
        System.out.println("Color: " + r1.getColor());
        System.out.println("Area: " + Manejador.Area(r1));
        System.out.println("Parametro: " + Manejador.Perimetro(r1));
        Manejador.moverX(r1,1);
        Manejador.moverY(r1,0);
        System.out.println("Nueva posicion: " + r1);
        Coordenada c3 = new Coordenada(4,7);
        Coordenada c4 = new Coordenada(-4,0);
        Rectangulo r2 = new Rectangulo(c3,c4);
        System.out.println(r2);
        System.out.println("Color: " + r2.getColor());
        System.out.println("Area: " + Manejador.Area(r2));
        System.out.println("Parametro: " + Manejador.Perimetro(r2));
        Coordenada c5 = new Coordenada(8,7);
        Coordenada c6 = new Coordenada(-10,0);
        Rectangulo r3 = new Rectangulo(c5,c6);
        System.out.println(r3);
        System.out.println("Color: " + r3.getColor());
        System.out.println("Area: " + Manejador.Area(r3));
        System.out.println("Parametro: " + Manejador.Perimetro(r3));
        System.out.println("Ultimo color: " + Rectangulo.getUltimoColor());
        
    }
}