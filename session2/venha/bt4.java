import java.util.Scanner;

public class bt4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số lượng số nguyên tố cần in
        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        int numbers = scanner.nextInt();

        // Bước 2: Khai báo biến đếm và biến N
        int count = 0;
        int N = 2;

        // Bước 3: Lặp while in 20 số nguyên tố
        while (count < numbers) {
            boolean isPrime = true;

            // Bước 4: Kiểm tra N có phải là số nguyên tố
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // In ra N nếu là số nguyên tố và tăng count
            if (isPrime) {
                System.out.print(N + " ");
                count++;
            }

            // Tăng N để kiểm tra số tiếp theo
            N++;
        }
    }
}

