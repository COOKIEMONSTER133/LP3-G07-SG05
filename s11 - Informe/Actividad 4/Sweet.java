public class Sweet extends Goodies {
    private boolean isSugarFree;

    public Sweet(int id, String description, float price, boolean isSugarFree) {
        super(id, description, price);
        this.isSugarFree = isSugarFree;
    }

    public boolean isSugarFree() {
        return isSugarFree;
    }

    public void setSugarFree(boolean sugarFree) {
        isSugarFree = sugarFree;
    }
}