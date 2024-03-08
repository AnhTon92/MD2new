import java.util.Scanner;

public class bt2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên bất kỳ
        System.out.println("Nhập vào số nguyên bất kỳ: ");
        int n = scanner.nextInt();

        // Hiển thị menu
        int chon;
        do {
            System.out.println("==============MENU==============");
            System.out.println("1. Tìm số ước của số vừa nhập");
            System.out.println("2. Tính tổng các ước đó");
            System.out.println("3. Tìm các số chia hết cho 3 và 5 trong khoảng 1 - n");
            System.out.println("4. Thoát");
            System.out.println("---------------------------------");
            System.out.println("Mời bạn chọn chức năng: ");
            chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    int count = 0;
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0) {
                            count++;
                        }
                    }
                    System.out.println("Số " + n + " có " + count + " ước.");
                    break;
                case 2:
                    int sum = 0;

                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0) {
                            sum += i;
                        }
                    }
                    System.out.println("Tổng các ước của số " + n + " là: " + sum);
                    break;
                case 3:
                    System.out.println("Các số chia hết cho 3 và 5 trong khoảng 1 - " + n + " là: ");
                    for (int i = 1; i <= n; i++) {
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại!");
            }


        } while (chon != 4);
    }
}

