package baitap;

import baitap.entitty.RandomIntArr;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        // B1: Sử dụng mảng ngẫu nhiên từ RandomIntArr
        int[] arr = RandomIntArr.getArr();

        // In mảng ngẫu nhiên
        System.out.println("Mảng số nguyên:");
        RandomIntArr.printIntArr(arr);

        // B2: Lấy số cần tìm từ Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = Integer.parseInt(scanner.nextLine());

        // B3: Tìm số trong mảng và in ra
        int index = linearSearch(arr, target);
        if (index == -1) {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        } else {
            System.out.println("Số " + target + " được tìm thấy tại vị trí: " + index);
        }
    }

    // Phương thức tìm kiếm tuyến tính
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Trả về vị trí của giá trị cần tìm
            }
        }
        return -1; // Nếu không tìm thấy giá trị trong mảng
    }
}

