public class MyList<T> {
    private Object[] elements = new Object[10];
    private int size = 0;

    public void add(T element) {
        if (size >= elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) elements[index];
    }

    public int size() {
        return size;
    }
}
