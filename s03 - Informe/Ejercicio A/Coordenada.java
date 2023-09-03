public class Coordenada {
    private int x;
    private int y;
    public Coordenada(){}
    public Coordenada(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c){
        this.x = c.x;
        this.y = c.y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double Distancia(Coordenada c) {
        return Math.sqrt(Math.pow((c.x - this.x), 2) + Math.pow((c.y - this.y), 2));
    }
    public static double Distancia(Coordenada c1, Coordenada c2) {
        return Math.sqrt(Math.pow((c2.x - c1.x), 2) + Math.pow((c2.y - c1.y), 2 ));
    }
    public String toString() {
        return "X: " + x + " " + "Y:" + y;
    }

}