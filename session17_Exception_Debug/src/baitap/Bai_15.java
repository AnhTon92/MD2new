package baitap;

import java.util.Scanner;

public class Bai_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // khai báo biến trong khối try-catch
        try {
            System.out.println("Nhập cạnh thứ nhất: ");
            int side1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh thứ hai: ");
            int side2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập cạnh thứ ba: ");
            int side3 = Integer.parseInt(scanner.nextLine());
            // gọi phương thức validateTriangleSides
            validateTriangleSides(side1, side2, side3);
            System.out.println("Ba cạnh tạo thành 1 hình tam giác hợp lệ");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        scanner.close();
    }
// tạo phương thức để check 3 cạnh nhập vào
    private static void validateTriangleSides(int side1, int side2, int side3) throws IllegalTriangleException{
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Cạnh của tam giác phải là số dương");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1 ) {
            throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }
    }
}
