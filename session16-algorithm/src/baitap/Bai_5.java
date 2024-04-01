package baitap;

import baitap.entitty.RandomIntArr;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        //b1: sử dụng mảng ngẫu nhiên có từ RandomIntArr
        Integer[] arr = RandomIntArr.getSortedArray();
        //in mảng đã sắp xếp
        System.out.println("Mảng đã sắp xếp là: ");
        System.out.println(Arrays.toString(arr));
        //b2: lấy 2 số min và max từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhỏ nhất trong khoảng: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số lớn nhất trong khoảng: ");
        int max = Integer.parseInt(scanner.nextLine());
        //b3: duyệt mảng và tạo ra phương thức tìm kiếm và in ra trong khoảng
        findNumbersInRange(arr, min, max);
    }

    // Phương thức tìm kiếm nhị phân trong khoảng
    private static void findNumbersInRange(Integer[] arr, int min, int max) {
        int count = 0;
        System.out.println("Các số trong khoảng từ " + min + " đến " + max + ":");
        for (int num : arr) {
            if (num >= min && num <= max) {
                System.out.println(num + " tại vị trí " + Arrays.asList(arr).indexOf(num));
                count++;
            }
        }
        System.out.println("Tổng cộng có " + count + " số trong khoảng đã cho.");
    }
}


