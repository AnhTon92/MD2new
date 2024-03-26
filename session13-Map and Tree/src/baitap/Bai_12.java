package baitap;

import java.util.Scanner;
import java.util.TreeMap;

public class Bai_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // B1: Khai báo và khởi tạo mảng
        int[] arr = {1, 5, 3, 2, 7, 4, 6, 88, 32};
        //tạo biến n
        System.out.println("tìm phần tử lớn thứ: ");
        int n = Integer.parseInt(scanner.nextLine()); // Tìm phần tử lớn thứ n

        // B2: Khai báo TreeMap
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // B3: Thêm phần tử từ mảng vào TreeMap
        for (int i : arr) {
            treeMap.put(i, 0);
        }

        // B4: Lấy phần tử lớn thứ n
        int count = 0;
        for (int key : treeMap.descendingKeySet()) {
            count++;
            if (count == n) {
                System.out.println("Phần tử lớn thứ " + n + " là: " + key);
                break;
            }
        }
    }
}

