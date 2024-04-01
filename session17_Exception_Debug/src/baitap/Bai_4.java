package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //b1: khai báo chuỗi
        System.out.println("Nhập chuỗi : ");
        String str = scanner.nextLine();
        // tạo list rỗng để thêm vào
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) { // duyệt chuỗi
            try {// cho vào khối try- catch
                int number = Integer.parseInt(str.valueOf(str.charAt(i))); // tạo biến number gán bằng kí tự
                // chuỗi là số nguyên của chuỗi str
                list.add(number); // gán xong thì thêm biến number vào list đã tạo
                System.out.println("Đã thêm số " + number + " vào mảng");// in ra chuỗi có biến number đã gán
            } catch (NumberFormatException e) {// bắt ngoại lệ nếu không phải số nguyên
                System.out.println("Lỗi : ký tự không phải số nguyên");// thì in ra lỗi
                list.add(0);// và thêm số 0 vào list
            }
        }
        System.out.println("Danh sách mảng số nguyên : " + list);//in ra list đã được biến đổi theo yêu cầu
    }
}
