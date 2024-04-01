package baitap;

import baitap.entitty.RandomIntArr;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        // B1: Tạo mảng bằng hàm getArr()
        Integer[] arr = RandomIntArr.getDescendingSortedArray();

        // In mảng đã sắp xếp đảo ngược
        System.out.println("Mảng đã sắp xếp đảo ngược:");
        System.out.println(Arrays.toString(arr));

        // B2: Lấy 2 số min và max từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhỏ nhất trong khoảng: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số lớn nhất trong khoảng: ");
        int max = Integer.parseInt(scanner.nextLine());

        // B3 và B4: Duyệt mảng để tìm ra vị trí và in ra số lượng số tìm thấy
        findNumbersInRange(arr, min, max);
    }

    // Phương thức tìm kiếm nhị phân trong khoảng cho mảng đảo ngược
    private static void findNumbersInRange(Integer[] arr, int min, int max) {
        int count = 0;
        System.out.println("Các số trong khoảng từ " + min + " đến " + max + ":");
        for (int num : arr) {
            if (num <= max && num >= min) {
                System.out.println(num + " tại vị trí " + Arrays.asList(arr).indexOf(num));
                count++;
            }
        }
        System.out.println("Tổng cộng có " + count + " số trong khoảng đã cho.");
    }
}

