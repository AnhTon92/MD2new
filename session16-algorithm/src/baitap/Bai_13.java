package baitap;

import java.util.Arrays;

public class Bai_13 {

    // Hàm sắp xếp chọn
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Đổi chỗ phần tử nhỏ nhất với phần tử đầu tiên
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Hàm sắp xếp chèn
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
        }
    }

    // Hàm sắp xếp nổi bọt
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // Đổi chỗ arr[j+1] và arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // Hàm tạo mảng ngẫu nhiên
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    // Hàm chính để thực thi
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        // Sắp xếp và in mảng sử dụng thuật toán sắp xếp chọn
        selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp chọn: " + Arrays.toString(arr));

        // Tạo lại mảng và sắp xếp sử dụng thuật toán sắp xếp chèn
        arr = getArr();
        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp chèn: " + Arrays.toString(arr));

        // Tạo lại mảng và sắp xếp sử dụng thuật toán sắp xếp nổi bọt
        arr = getArr();
        bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp nổi bọt: " + Arrays.toString(arr));
    }
}
