package baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // bước 1: tạo biến
        int num1 = 0;
        int num2 = 0;
        boolean validInput;

        //bước 2: tạo vòng lặp thực thi yêu cầu
        //2.1: vòng lặp do-whlie check điều kiện số thứ 1
        do {
            System.out.println("nhập số nguyên thứ nhất: ");
            validInput = true; // cờ biến validInput đặt true
            try {
                num1 = Integer.parseInt(scanner.nextLine());// nhập biến num1 vào try-catch để kiểm tra
            } catch (Exception e) {// đặt checked Exception thông báo ra
                System.out.println("Giá trị nhập vào không phải số nguyên. Vui lòng nhập lại");
                validInput = false; // đổi cờ validInput sang false
            }
        } while (!validInput); // điều kiện dừng vòng lặp là nếu validInput false thì dừng
        //2.2 còng lặp do- while check điều kiện số thứ 2
        do {
            System.out.println("Nhập số nguyên thứ hai: ");
            validInput = true;
            try {
                num2 = Integer.parseInt(scanner.nextLine()); // nhập biến num2 vào try-catch
                if (num2 < 0) {
                    throw new IllegalArgumentException("Số nguyên phải lớn hơn hoặc bằng 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Giá trị nhập vào không phải số nguyên. Mời nhập lại");
                validInput = false;
            }
        } while (!validInput);
        //bước 3: tính tổng và in ra kết quả
        int sum = num1 + num2; // đặt biến sum = num1 + num2 rồi in ra màn hình
        System.out.println("Tổng của 2 số là:" +sum);
        //b4: kết thúc chương trình
        scanner.close();
        System.out.println("END!");
    }

}
