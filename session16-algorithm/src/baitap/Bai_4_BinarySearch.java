package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_4_BinarySearch {
    public static void main(String[] args) {
        // B1: Tạo mảng đã sắp xếp tăng dần
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        // In mảng
        System.out.println("Mảng đã sắp xếp tăng dần:");
        System.out.println(Arrays.toString(arr));

        // B2: Lấy số cần tìm từ Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        // B3: Tìm số trong mảng sử dụng tìm kiếm nhị phân và in ra
        int index = binarySearch(arr, target);
        if (index == -1) {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        } else {
            System.out.println("Số " + target + " được tìm thấy tại vị trí: " + index);
        }
    }

    // Phương thức tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Trả về vị trí của giá trị cần tìm
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Nếu không tìm thấy giá trị trong mảng
    }
}
