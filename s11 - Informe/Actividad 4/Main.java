public class Main {
    public static void main(String[] args) {
        Goodies goodies = new Goodies(1, "Generic Goodie", 5.0f);
        Biscuits biscuits = new Biscuits(2, "Delicious Biscuit", 3.0f, "Chocolate");
        Chocolate chocolate = new Chocolate(3, "Premium Chocolate", 10.0f, 70);
        Soda soda = new Soda(4, "Refreshing Soda", 2.5f, "Cola");
        Sweet sweet = new Sweet(5, "Sweet Delight", 4.0f, true);

        Contenedora[] bolsa = {goodies, biscuits, chocolate, soda, sweet};

        ContenedoraUtils.verificarExistencia(bolsa, 3);
    }
}