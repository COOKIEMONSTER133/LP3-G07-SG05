import java.util.Arrays;
import java.util.Comparator;
public class CandyBags extends Bag<Goodies> {

    public CandyBags(int n) {
        super(n);
    }
    @Override
    public void add(Goodies obj) {
        try {
            if (!contains(obj)) {
                super.add(obj);
            }
        } catch (IsFull e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean contains(Goodies obj) {
        return super.contains(obj);
    }
    @Override
    public boolean isEmpty() {
        return getCount() == 0;
    }
    public Goodies cheapest() throws IsEmpty {
        if (isEmpty()) {
            throw new IsEmpty("La bolsa de golosinas está vacía, no hay golosinas para devolver.");
        }

        Goodies[] goodiesArray = getObjects();
        Arrays.sort(goodiesArray, Comparator.comparingDouble(Goodies::getPrice));

        return goodiesArray[0];
    }
    public CandyBags mostExpensive(int n) throws IsEmpty {
        if (isEmpty()) {
            throw new IsEmpty("La bolsa de golosinas está vacía, no hay golosinas para devolver.");
        }
        Goodies[] goodiesArray = getObjects();
        Arrays.sort(goodiesArray, Comparator.comparingDouble(Goodies::getPrice).reversed());

        CandyBags expensiveBags = new CandyBags(n);
        for (int i = 0; i < n && i < goodiesArray.length; i++) {
            expensiveBags.add(goodiesArray[i]);
        }
        return expensiveBags;
    }
}
