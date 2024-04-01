package baitap;

import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        //khai báo biến số bị chia và số chia
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số bị chia: ");
        int dividendNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số chia: ");
        int divisorNum = Integer.parseInt(scanner.nextLine());
        //xử lý ngoại lệ
        try {
            int result = divide(dividendNum, divisorNum);
            // hiển thị kết quả
            System.out.println("Kết quả phép chia là: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: không thể chia cho 0.");
        }
        // kết thúc chương trình
        scanner. close();
    }
    public static int divide(int dividendNum, int divisorNum) {
        if (divisorNum == 0) {
            throw new ArithmeticException("Số chia không thể là 0.");
        }
        return dividendNum / divisorNum;
    }
}
