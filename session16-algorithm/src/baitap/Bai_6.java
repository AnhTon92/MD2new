package baitap;

public class Bai_6 {
    public static void main(String[] args) {
        // Định nghĩa mảng số nguyên
        int[] arr = {5, 2, 4, 6, 1, 3};

        // In mảng ban đầu
        System.out.println("Mảng ban đầu:");
        printArray(arr);

        // Thực hiện thuật toán sắp xếp chèn
        insertionSort(arr);
    }

    // Phương thức sắp xếp chèn
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr[0..i-1], lớn hơn key
            // đến vị trí phía trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            // In các bước thực hiện
            System.out.println("Bước " + i + ":");
            printArray(arr);
        }
    }

    // Phương thức in mảng
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
