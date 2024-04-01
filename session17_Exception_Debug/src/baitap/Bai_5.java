package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //khai báo mảng số nguyên có size độ dài
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        // khai báo biến và nhập dữ liệu
        System.out.println("nhập các phần tử của mảng: ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        //sắp xếp mảng đã khai báo
        Arrays.sort(array);
        // khai báo giá trị cần tìm kiếm
        System.out.println("nhập giá trị cần tìm kiếm: ");
        int numFind = Integer.parseInt(scanner.nextLine());
        // thực hiện tìm kiếm nhị phân
        try {
            int result = binarySearch(array, numFind);
            //xử lý kết quả
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int binarySearch(int[] array, int numFind) throws ElementNotFoundException {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == numFind) {
                return mid;
            } else if (array[mid] < numFind) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        throw new ElementNotFoundException("Phần tử không được tìm thấy trong mảng");
    }


}
