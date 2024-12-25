public class MyList {
    private Object[] elements = new Object[10];
    private int size = 0;

    public void add(Object element) {
        if (size >= elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[size++] = element;
    }

    public Object get(int index) {
        return elements[index];
    }

    public int size() {
        return size;
    }
}
