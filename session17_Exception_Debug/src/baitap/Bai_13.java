package baitap;

import java.util.Scanner;

public class Bai_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // khai báo chuỗi
        System.out.println("Nhập chuỗi cần đảo ngược: ");
        String inputString = scanner.nextLine();
        // dùng try-catch để in ra chuỗi đảo ngược và bắt ngoại lệ
        try {
            String reversedString =  reverse(inputString);//dùng phương thức reverse để gán vào biến
            System.out.println("Chuỗi sau khi đảo ngược: " + reversedString);// in ra chuỗi đảo ngược
        } catch (IllegalArgumentException e) {// bắt ngoại lệ
            System.out.println("Lỗi: " + e.getMessage());
        }
        scanner.close();
    }

    private static String reverse(String str) {
        if (str == null || str.isEmpty()) {// nếu chuỗi rỗng thì vứt ra lỗi
            throw new IllegalArgumentException("Chuỗi không hợp lệ. Vui lòng nhập chuỗi không rỗng");
        }
        return new StringBuilder(str).reverse().toString();// còn không thì dùng StringBuilder để đảo ngược chuỗi và in ra chuỗi đã đảo ngược

    }
}
