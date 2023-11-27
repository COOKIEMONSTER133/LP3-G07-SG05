public class Biscuits extends Goodies {
    private String flavor;

    public Biscuits(int id, String description, float price, String flavor) {
        super(id, description, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}