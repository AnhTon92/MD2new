import java.util.Scanner;

public class bt7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến và nhập số từ người dùng
        System.out.print("Nhập vào một số từ 0 đến 9: ");
        int so = scanner.nextInt();

        // Sử dụng switch case để xác định chuỗi cần hiển thị
        String chuoiHienThi;
        switch (so) {
            case 0:
                chuoiHienThi = "Số Không";
                break;
            case 1:
                chuoiHienThi = "Số Một";
                break;
            case 2:
                chuoiHienThi = "Số Hai";
                break;
            case 3:
                chuoiHienThi = "Số Ba";
                break;
            case 4:
                chuoiHienThi = "Số Bốn";
                break;
            case 5:
                chuoiHienThi = "Số Năm";
                break;
            case 6:
                chuoiHienThi = "Số Sáu";
                break;
            case 7:
                chuoiHienThi = "Số Bảy";
                break;
            case 8:
                chuoiHienThi = "Số Tám";
                break;
            case 9:
                chuoiHienThi = "Số Chín";
                break;
            default:
                chuoiHienThi = "Số không hợp lệ";
                break;
        }

        // Hiển thị kết quả
        System.out.println(chuoiHienThi);
    }
}

