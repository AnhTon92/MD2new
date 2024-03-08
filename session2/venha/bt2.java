import java.util.Scanner;

public class bt2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hiển thị menu
        while (true) {
            System.out.println("=========================");
            System.out.println("   Menu Chọn Hình Vẽ   ");
            System.out.println("=========================");
            System.out.println("1. Vẽ Hình Chữ Nhật");
            System.out.println("2. Vẽ Tam Giác Vuông (Góc vuông ở 4 đỉnh)");
            System.out.println("3. Vẽ Tam Giác Cân");
            System.out.println("0. Thoát");
            System.out.println("-------------------------");
            System.out.print("Lựa chọn của bạn (1-3 hoặc 0): ");

            int chon = scanner.nextInt();

            // Xử lý lựa chọn
            switch (chon) {
                case 1: // vẽ hình chữ nhật
                    System.out.println("nhập chiều dài: ");
                    int chieuDai = scanner.nextInt();
                    System.out.println("nhập chiều rộng: ");
                    int chieuRong = scanner.nextInt();
                    for (int i = 0; i < chieuDai; i++) {
                        for (int j = 0; j < chieuRong; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2: // vẽ tam giác vuông
                    System.out.println("nhập chiều cao: ");
                    int chieuCao = scanner.nextInt();
                    // góc vuông ở đỉnh trái trên
                    for (int i = 0; i < chieuCao; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    // góc vuông ở đỉnh phải trên
                    for (int i = 0; i < chieuCao; i++) {
                        for (int j = chieuCao - 1; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    //góc vuông ở đỉnh trái dưới
                    for (int i = chieuCao - 1; i >= 0; i--) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    //góc vuông đỉnh phải dưới
                    for (int i = chieuCao - 1; i >= 0; i--) {
                        for (int j = chieuCao - 1; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3: // vẽ tam giác cân
                    System.out.print("Nhập chiều cao tam giác cân: ");
                    int height = scanner.nextInt();

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }

                    break;
                case 0:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("sai");

            }
        }
    }
}