package baitap;

import java.util.Scanner;

public class Bai_10 {
    public static void main(String[] args) {
        // khai báo biến
        Scanner scanner = new Scanner(System.in);
        double radius = 0;
        boolean validInput; // cờ validInput
        //kiểm tra điều kiện âm
        do {// vòng lặp do-while để cho người dùng nhập lại
            System.out.println("nhập bán kính hình tròn (giá trị dương): ");
            radius = Double.parseDouble(scanner.nextLine());
            validInput = radius >= 0; // gán cờ validInput = biến radius mới nhập vào ( điều kiện >= 0)
            if (!validInput) {// nếu cờ validInput sai (điều kiện >= 0 không đc thỏa mãn)
                System.out.println("Giá trị bán kính không thể là số âm. Hãy nhập lại");
            }
        } while (!validInput);// điều kiện dừng vòng lặp là validInput = false
        // tính diện tích hình tròn
        double area = calculateCircleArea(radius);
        System.out.println("Diện tích hình tròn là: " + area);
        scanner.close();
    }

    //tạo phương thức tính diện tích hình tròn
    private static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }


}
