package baitap;

import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //b1: nhập số cần kiểm tra và dùng exception để validate số đó thỏa mãn đk hay không
        System.out.println("Nhập số cần kiểm tra: ");
        int num = Integer.parseInt(scanner.nextLine());
        try {
            if (isPrime(num)) {
                System.out.println(num + " là số nguyên tố.");
            } else {
                System.out.println(num + " không phải số nguyên tố.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        scanner.close();
        //b2: tạo phương thức kiểm tra số nguyên tố
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            throw new IllegalArgumentException("Số phải lớn hơn 1 để là 1 số nguyên tố.");
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
