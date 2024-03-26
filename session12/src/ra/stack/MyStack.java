package ra.stack;

public class MyStack<E> {
    private static final int INTIIAL_SIZE = 16;
    private E[] elements;
    private int count = 0;

    public MyStack() {
        elements = (E[]) new Object[INTIIAL_SIZE];
    }

    public void push(E e) {
        ensureCapacity(); //kiểm tra xem có cần nơới ộng không
        elements[count] = e;
        count++;
    }

    private void ensureCapacity() {
        if (count >= elements.length) {
            E[] newElements = (E[]) new Object[elements.length * 2 + 1];
            System.arraycopy(elements, 0, newElements, 0, count);
            elements = newElements;
        }
    }
}

