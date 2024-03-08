import java.util.Scanner;

public class bt1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến
        int a, b, tong = 0;

        // Nhập giá trị đầu và giá trị cuối
        System.out.print("Nhập giá trị đầu: ");
        a = scanner.nextInt();
        System.out.print("Nhập giá trị cuối: ");
        b = scanner.nextInt();

        // Tính tổng các số chẵn
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                tong += i;
            }
        }

        // Hiển thị kết quả
        System.out.println("Tổng các số chẵn trong khoảng từ " + a + " đến " + b + " là: " + tong);
    }
}

