package Circle;

import java.util.Scanner;

public class Circle {
    // khai báo thuộc tiính hình tròn
    double banKinh;
    double chuVi;
    double dienTich;

    public void setBanKinh() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập bán kính: ");
            banKinh = scanner.nextDouble();
        } while (banKinh <= 0);

    }

    public double setChuVi() {
        return 2 * Math.PI * banKinh;

    }

    public double setDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    public void displayData() {
        System.out.println("Bán kính hình tròn: " + banKinh);
        System.out.println("Chu vi hình tròn: " + setChuVi());
        System.out.println("Diện tích hình tròn: " + setDienTich());
    }
}
