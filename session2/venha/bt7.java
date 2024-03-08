import java.util.Scanner;

public class bt7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chon;
        do {
            System.out.println("**Menu chức năng:**");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    // Tính chu vi và diện tích hình chữ nhật
                    System.out.print("Nhập chiều dài: ");
                    double chieuDai = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng: ");
                    double chieuRong = scanner.nextDouble();
                    double chuViHCN = (chieuDai + chieuRong) * 2;
                    double dienTichHCN = chieuDai * chieuRong;
                    System.out.println("Chu vi hình chữ nhật: " + chuViHCN);
                    System.out.println("Diện tích hình chữ nhật: " + dienTichHCN);
                    break;
                case 2:
                    // Tính chu vi và diện tích hình tam giác
                    System.out.print("Nhập cạnh a: ");
                    double canhA = scanner.nextDouble();
                    System.out.print("Nhập cạnh b: ");
                    double canhB = scanner.nextDouble();
                    System.out.print("Nhập cạnh c: ");
                    double canhC = scanner.nextDouble();
                    double chuViHTG = canhA + canhB + canhC;
                    double p = (canhA + canhB + canhC) / 2;
                    double dienTichHTG = Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
                    System.out.println("Chu vi hình tam giác: " + chuViHTG);
                    System.out.println("Diện tích hình tam giác: " + dienTichHTG);
                    break;
                case 3:
                    // Tính chu vi và diện tích hình tròn
                    System.out.print("Nhập bán kính: ");
                    double banKinh = scanner.nextDouble();
                    double chuViHtron = 2 * Math.PI * banKinh;
                    double dienTichHtron = Math.PI * banKinh * banKinh;
                    System.out.println("Chu vi hình tròn: " + chuViHtron);
                    System.out.println("Diện tích hình tròn: " + dienTichHtron);
                    break;
                case 4:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 4);
    }
}

