import java.util.ArrayList;

public class Pila<T> {
    private ArrayList<T> elementi;

    public Pila() {
        elementi = new ArrayList<>();
    }

    public boolean isEmpty() {
        return elementi.isEmpty();
    }

    public void push(T dato) {
        elementi.add(dato);
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Pila vuota");
        return elementi.remove(elementi.size() - 1);
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Pila vuota");
        return elementi.get(elementi.size() - 1);
    }

    public int size() {
        return elementi.size();
    }

    @Override
    public String toString() {
        return elementi.toString();
    }
}