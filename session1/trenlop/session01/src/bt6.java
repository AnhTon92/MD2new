import java.util.Scanner;

public class bt6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến
        int soCanKiemTra;
        String chuoiHienThi;

        // Nhập số cần kiểm tra
        System.out.print("Nhập số cần kiểm tra: ");
        soCanKiemTra = scanner.nextInt();

        // Bước 3: Tiến hành kiểm tra và xác định đầu ra
        if (soCanKiemTra % 3 == 0 && soCanKiemTra % 5 == 0) {
            chuoiHienThi = "Chia hết cho cả 3 và 5";
        } else if (soCanKiemTra % 3 == 0) {
            chuoiHienThi = "Chỉ chia hết cho 3";
        } else if (soCanKiemTra % 5 == 0) {
            chuoiHienThi = "Chỉ chia hết cho 5";
        } else {
            chuoiHienThi = "Không chia hết cho 3, cũng không chia hết cho 5";
        }

        // Bước 4: Hiển thị kết quả ra màn hình
        System.out.println(chuoiHienThi);
    }
}
