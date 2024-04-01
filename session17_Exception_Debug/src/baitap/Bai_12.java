package baitap;

import java.util.Scanner;

public class Bai_12 {
    public static void main(String[] args) {
        //khai báo biến và nhập vào dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số nguyên thứ hai: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        //dùng try-catch để check lỗi ngoại lệ và in ra kết quả
        try {// đặt biến ucln bằng phương thức findUcln để tìm ucln rồi in ra kết quả
            int ucln = findUcln(num1, num2);
            System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2+ "là: "+ ucln);
        } catch (IllegalArgumentException e) {// in ra ngoại lệ
            System.out.println("Lỗi: " + e.getMessage());
        }
        scanner.close();
    }
// tạo ra phương thức tìm ucln
    private static int findUcln(int num1, int num2) {
        if (num1 == 0 && num2 == 0){// nếu 2 biến đêu = 0 thì vứt ra lỗi
            throw new IllegalArgumentException("Cả hai số không thể = 0");
        }
        // gán 2 biến bằng bình phương của chính nó
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        //vòng lặp while để check
        while (num1 != 0 && num2 != 0) {//điều kiện dừng vòng lặp khi 2 biến khác 0
            if (num1 > num2) { // nếu num1 bình > num2 bình thì
                num1 %= num2;// num1 bình chia lấy dư cho num2 bình thì bằng chính num1
            } else { // ngược lại thì num2 bình chia lấy dư cho num1 bình thì bắng chính num2.
                num2 %= num1;
            }
        }
        return num1 + num2;// 1 trong 2 số sẽ = 0 nên số còn lại chính là Ucln của cả 2 số.
    }
}
