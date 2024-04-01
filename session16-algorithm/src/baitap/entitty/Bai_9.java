package baitap.entitty;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khởi tạo mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp mảng
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        // Bước 3: Tìm kiếm nhị phân đệ quy
        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();
        int result = binarySearch(array, 0, array.length - 1, value);

        if (result == -1) {
            System.out.println("Giá trị không tìm thấy trong mảng.");
        } else {
            System.out.println("Giá trị tìm thấy tại vị trí: " + result);
        }
    }

    // Bước 3: Khai báo hàm binarySearch
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            // Bước 4: Tính middle
            int middle = left + (right - left) / 2;

            // Bước 5: Kiểm tra giá trị tại middle
            if (array[middle] == value) {
                return middle;
            }

            // Bước 6 và 7: Đệ quy tìm kiếm trong nửa mảng phù hợp
            if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            } else {
                return binarySearch(array, left, middle - 1, value);
            }
        }

        // Bước 8: Nếu không tìm thấy
        return -1;
    }
}
