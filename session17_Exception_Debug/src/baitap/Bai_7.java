package baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        //khai báo những biến
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean valid; // biến cờ valid
        // nhập dữ liệu
        do { // vòng lặp do - while để nhập lại nếu người dùng nhập sai
            valid = true;// đặt cờ về true để check
            try { // khối try catch để check giá trị đưa ra ngoại lệ
                System.out.println("Nhập số nguyên thứ nhất: ");
                num1 = Integer.parseInt(scanner.nextLine());
            } catch (InputMismatchException e) {
                // xử lý ngoại lệ
                System.out.println("Giá trị nhập không phải số nguyên. Vui lòng nhập lại");
                valid = false;// biến valid đổi thành false
                scanner.next();// loại bỏ input không hợp lệ
            }
        } while (!valid);// dừng vòng lặp khi valid về false
        // tương tự nhập dữ liệu cho số thứ 2 như cách trên
        do { // vòng lặp do - while để nhập lại nếu người dùng nhập sai
            valid = true;// đặt cờ về true để check
            try { // khối try catch để check giá trị đưa ra ngoại lệ
                System.out.println("Nhập số nguyên thứ hai: ");
                num2 = Integer.parseInt(scanner.nextLine());
            } catch (InputMismatchException e) {
                // xử lý ngoại lệ
                System.out.println("Giá trị nhập không phải số nguyên. Vui lòng nhập lại");
                valid = false;// biến valid đổi thành false
                scanner.next();// loại bỏ input không hợp lệ
            }
        } while (!valid);// dừng vòng lặp khi valid về false
        // so sánh 2 số và tìm số lớn nhất
        int maxNumber = Math.max(num1, num2);
        System.out.println("Số lớn nhất là: "+maxNumber);
        scanner.close();
    }

}
