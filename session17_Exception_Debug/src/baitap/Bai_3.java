package baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //b1: tạo mảng số nguyên có độ lớn là biến size khai báo từ bàn phím
        System.out.println("nhập kích thước của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        if (size <= 0) {
            throw new IllegalArgumentException("Mảng không thể rỗng hoặc có kích thước âm!");
        }
        int[] array = new int[size];
        //b2: nhập dữ liệu và xử lý ngoại lệ
        int sum = 0; // tạo biến sum để lưu giá trị tổng cộng dồn
        for (int i = 0; i < size; i++) { //duyệt mảng
            try {
                System.out.println("nhập phần tử thứ " +(i + 1) + ":");
                array[i] = Integer.parseInt(scanner.nextLine());
                sum += array[i];
            } catch (InputMismatchException e) {
                System.out.println("Phần tử thứ " + (i + 1) + "không phải là số nguyên. Bỏ qua phần tử này.");
                scanner.next(); //bỏ qua input không hợp lệ
            }
        }
        // hiển thị tổng của mảng
        System.out.println("Tổng của mảng là: "+ sum);
        scanner.close();
    }
}
