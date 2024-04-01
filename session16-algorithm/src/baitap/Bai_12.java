package baitap;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai_12 {
    public static void main(String[] args) {
        // B1: Tạo mảng số nguyên và gọi hàm getArr() để gán
        Integer[] arr = getArr();

        // B2: In ra mảng số nguyên đó
        System.out.println("Mảng đã sắp xếp giảm dần:");
        System.out.println(Arrays.toString(arr));

        // B3: Tạo biến lấy dữ liệu số nguyên từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên cần tìm: ");
        int value = Integer.parseInt(scanner.nextLine());

        // B3: Cài đặt thuật toán nhị phân để tìm ra số nhập vào
        int index = binarySearch(arr, value);

        // B4: In vị trí của số đó ra
        if (index != -1) {
            System.out.println("Số " + value + " được tìm thấy tại vị trí: " + index);
        } else {
            System.out.println("Số " + value + " không tìm thấy trong mảng.");
        }
    }

    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    private static int binarySearch(Integer[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (arr[middle].equals(value)) {
                return middle;
            } else if (arr[middle] < value) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1; // Nếu không tìm thấy giá trị trong mảng
    }
}
