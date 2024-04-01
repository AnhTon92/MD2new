package baitap;

import java.util.Scanner;

public class Bai_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // khai báo biến ngày, tháng, năm
        System.out.println("Nhập ngày: ");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tháng: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập năm: ");
        int year = Integer.parseInt(scanner.nextLine());
        // cho các biến vào try-catch để in ra và check ngoại lệ
        try {
            validateTime(day, month,year);// dùng phương thức validateTime để check điều kiện của biến nhập vào
            System.out.println("Ngày tháng năm hợp lệ: ");// in ra khi phương thức hợp lệ
        } catch (Exception e) { // in ra lỗi khi phương thức không check được
            System.out.println("lỗi: "+ e.getMessage());
        }
        scanner.close();
    }
// tạo ra phương thức để check validate
    private static void validateTime(int day, int month, int year) throws Exception {
        if (year <= 0) { // nếu year <= 0 thì vứt ra lỗi
            throw new Exception("Năm phải lớn hơn 0.");
        }
        if (month < 1 || month > 12) {// nếu month không nằm trong khoảng 1 đến 12 thì vứt ra lỗi
            throw new Exception("Tháng phải nằm trong khoảng từ 1 đến 12.");
        }
        // khai báo mảng daysInMonth với giá trị của mỗi phần tử trong mảng tương đương với số ngày của 1 tháng trong năm(12 tháng)
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        // kiểm tra năm nhuận
        if (isLeapYear(year)) {// sử dụng phương thức isLeapYear để check năm nhuận truyền vào biến year để check nếu là năm nhuận thì
            daysInMonth[1] = 29; //  số ngày của tháng thứ 2 (tức giá trị thứ 1 của mảng daysInMonth) = 29
        }
        if (day < 1 || day > daysInMonth[month - 1]) {//nếu day bé hơn 1 hoặc day lớn hơn số ngày trong các tháng của mảng daysInMonth (trừ tháng 2 tức địa chỉ số 1 của mảng)
            throw new Exception("Ngày không hợp lệ cho tháng đã chọn");

        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
