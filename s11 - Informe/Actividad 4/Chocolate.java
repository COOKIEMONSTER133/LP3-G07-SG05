public class Chocolate extends Goodies {
    private int cocoaPercentage;

    public Chocolate(int id, String description, float price, int cocoaPercentage) {
        super(id, description, price);
        this.cocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    public void setCocoaPercentage(int cocoaPercentage) {
        this.cocoaPercentage = cocoaPercentage;
    }
}