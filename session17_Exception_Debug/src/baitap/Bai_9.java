package baitap;

import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        //b1 khai báo biến
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ tự thứ n của dãy Fibonacci: ");
        int n = Integer.parseInt(scanner.nextLine());
        //b2: kiểm tra điều kiện là số nguyên dương
        if(n <= 0) {
            throw new IllegalArgumentException("Giá trị n phải là số nguyên dương.");
        }
        //b3: Tính số fibonacci thứ n qua phương thức calculateFibonacci(n)
        long fibonacciNum = calculateFibonacci(n);
        //b4: hiển thị kết quả
        System.out.println("số fibonacci thứ " +n+ " là: " + fibonacciNum);
        scanner.close();
    }

    private static long calculateFibonacci(int n) {
        if (n <= 1){
            return n;
        }// đặt số trước là 0 số sau là 1 sau đó gán tổng 2 số đó cộng dồn lên
        long prev = 0;
        long next = 1;
        long sum;
        for (long i = 2; i <= n ; i++) {
            sum = prev + next;
            prev = next;
            next = sum;
        }
        return next;

    }

}
