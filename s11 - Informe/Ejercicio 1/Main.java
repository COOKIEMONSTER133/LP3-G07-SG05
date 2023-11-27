import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            CandyBags candyBags = new CandyBags(5);

            candyBags.add(new Goodies(1, "Chocolate", 2.5f));
            candyBags.add(new Goodies(2, "Osos de goma", 1.0f));
            candyBags.add(new Goodies(3, "Caramelo", 1.5f));
            candyBags.add(new Goodies(4, "Paleta", 0.75f));
            candyBags.add(new Goodies(5, "Caramelo acido", 1.25f));

            Goodies cheapestGoodie = candyBags.cheapest();
            System.out.println("Golosina más económica: " + cheapestGoodie.getDescription());

            CandyBags expensiveBags = candyBags.mostExpensive(2);
            System.out.println("Las 2 golosinas más caras: " + Arrays.toString(expensiveBags.getObjects()));
        } catch (IsEmpty e) {
            e.printStackTrace();
        }
    }
}
