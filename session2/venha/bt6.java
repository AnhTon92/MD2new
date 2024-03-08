import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hiển thị menu
        while (true) {
            System.out.println("nhập số nguyên bất kỳ để kiểm tra: ");
            int num = scanner.nextInt();
            System.out.println("=========================");
            System.out.println("   Menu    ");
            System.out.println("=========================");
            System.out.println("1. kiểm tra tính chẵn lẻ");
            System.out.println("2. kiểm tra số nguyên tố");
            System.out.println("3. kiểm tra chia hết cho 3");
            System.out.println("0. Thoát");
            System.out.println("-------------------------");
            System.out.print("Lựa chọn của bạn (1-3 hoặc 0): ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // kiểm tra chẵn lẻ
                    if (num % 2 == 0) {
                        System.out.println(num + " là số chẵn");
                    } else {
                        System.out.println(num + " là số lẻ");
                    }
                    break;
                case 2: // kiểm tra số nguyên tố
                    boolean isPrime = true;
                    for (int i = 2; i < num; i++) {
                        if (num == 2) {
                            System.out.println(num + " là số nguyên tố");
                            break;
                        }
                        if (num % i == 0) {
                            isPrime = false;
                        }
                    }
                    if (isPrime)
                        System.out.println(num + " là số nguyên tố");
                    else System.out.println(num + " không phải là số nguyên tố");
                    break;
                case 3: // kiểm tra chia hết cho 3
                    if (num % 3 == 0)
                        System.out.println(num + " chia hết cho 3");
                    else System.out.println(num + " không chia hết cho 3");
                    break;
                case 0: // thoát
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println(" số nhập không phải số nguyên");
            }
        }
    }
}
