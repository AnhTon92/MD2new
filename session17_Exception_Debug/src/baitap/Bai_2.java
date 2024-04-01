package baitap;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //b1: khai báo mảng kèm biến size để xác độ dài của mảng
        System.out.println("Nhập số lượng phần tử có trong mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        if (size <= 0) {
            throw new IllegalArgumentException("Mảng không thể rỗng hoặc có kích thước âm!");
        }
        int[] array = new int[size];
        //b2: khai báo biến và nhập dữ liệu từ bàn phím
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        //b3: xây dựng phương thức findMax để tìm số lớn nhất
        int max = findMax(array);
        //b4: hiển thị kết quả
        System.out.println("số lớn nhất trong mảng là: " + max);
        scanner.close();
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
