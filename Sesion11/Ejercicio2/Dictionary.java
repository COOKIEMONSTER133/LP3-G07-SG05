package ejercicio2;

import actividad2.OrderedPair;
import java.util.ArrayList;

public class Dictionary<K, V> {
    private ArrayList<OrderedPair<K, V>> pairs;

    public Dictionary() {
        pairs = new ArrayList<>();
    }

    public void add(K key, V value) {
        OrderedPair<K, V> newPair = new OrderedPair<>(key, value);
        pairs.add(newPair);
    }

    public boolean delete(K key) {
        for (OrderedPair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                pairs.remove(pair);
                return true;
            }
        }
        return false;
    }

    public V getValue(K key) throws ObjectNoExist {
        for (OrderedPair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new ObjectNoExist("La key '" + key + "' no se encontro dentro del diccionario");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (OrderedPair<K, V> pair : pairs) {
            result.append(pair.toString()).append("\n");
        }
        return result.toString();
    }
}