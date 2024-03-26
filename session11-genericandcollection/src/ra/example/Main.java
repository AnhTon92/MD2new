package ra.example;

public class Main {
    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<>();
        myArray.array = new Integer[]{1, 2, 3, 4, 5};
        myArray.printArray(myArray.array);
        MyArray<String> myStringArray = new MyArray<>();
        myStringArray.array = new String[]{"1", "2", "3", "4", "5"};
        myStringArray.printArray(myStringArray.array);
        MyArray<?> myArraydounble = new MyArray<>();

    }
}