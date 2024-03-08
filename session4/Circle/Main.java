package Circle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Circle[] ht = new Circle[5];
        int num;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số hình tròn bạn muốn kiểm tra giới hạn 5 hình tròn");
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("Số hình tròn phải lớn hơn 0. Vui lòng nhập lại.");
            } else {
                for (int i = 0; i < num; i++) {
                    ht[i] = new Circle();
                    System.out.println("Hinh tròn  " + i);
                    ht[i].setBanKinh();
                    ht[i].setChuVi();
                    ht[i].setDienTich();
                }
            }
        } while (num <= 0);
    }
}
