import java.lang.reflect.Array;
public class Bag<T> {
    private T[] list;
    private int count;

    public Bag(int n) {
        this.list = (T[]) new Object[n];
        this.count = 0;
    }
    public void add(T obj) throws IsFull {
        if (count < list.length) {
            list[count++] = obj;
        } else {
            throw new IsFull("La bolsa está llena, no se puede agregar más objetos.");
        }
    }
    public T[] getObjects() throws IsEmpty {
        if (count > 0) {
            @SuppressWarnings("unchecked")
            T[] result = (T[]) Array.newInstance(list[0].getClass(), count);

            for (int i = 0; i < count; i++) {
                result[i] = list[i];
            }

            return result;
        } else {
            throw new IsEmpty("La bolsa está vacía, no hay objetos para devolver.");
        }
    }
    public T remove(T obj) throws ObjectNoExist {
        int index = getIndex(obj);
        if (index != -1) {
            T removedObject = list[index];

            for (int i = index; i < count - 1; i++) {
                list[i] = list[i + 1];
            }

            list[count - 1] = null;
            count--;

            return removedObject;
        } else {
            throw new ObjectNoExist("El objeto no existe en la bolsa.");
        }
    }
    public int getIndex(T obj) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }
    public String toString() {
        StringBuilder result = new StringBuilder("Bag{");
        for (int i = 0; i < count; i++) {
            result.append(list[i]);
            if (i < count - 1) {
                result.append(", ");
            }
        }
        result.append("}");
        return result.toString();
    }
}
