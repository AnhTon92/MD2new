import java.util.Scanner;

public class bt8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo 3 biến là 3 cạnh của tam giác
        float a, b, c;

        // Vòng lặp while lặp vô hạn
        while (true) {
            // Nhập vào giá trị của 3 cạnh tam giác
            System.out.print("Nhập vào cạnh a: ");
            a = scanner.nextFloat();
            System.out.print("Nhập vào cạnh b: ");
            b = scanner.nextFloat();
            System.out.print("Nhập vào cạnh c: ");
            c = scanner.nextFloat();

            // Kiểm tra điều kiện tam giác
            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Cạnh tam giác phải lớn hơn 0. Vui lòng nhập lại!");
                continue;
            } else if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Tổng hai cạnh bất kỳ phải lớn hơn cạnh còn lại. Vui lòng nhập lại!");
                continue;
            }

            // Tính chu vi và diện tích tam giác
            float chuVi = a + b + c;
            float p = chuVi / 2;
            float dienTich = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));

            // Hiển thị kết quả
            System.out.println("Chu vi tam giác: " + chuVi);
            System.out.println("Diện tích tam giác: " + dienTich);

            // Dừng vòng lặp
            break;
        }
    }
}

