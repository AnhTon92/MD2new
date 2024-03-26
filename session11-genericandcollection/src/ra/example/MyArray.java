package ra.example;

public class MyArray<E> {
    E[] array;
    public void printArray(E[] arr) {
        for (E e: arr) {
            System.out.println(e);
        }
    }
}
