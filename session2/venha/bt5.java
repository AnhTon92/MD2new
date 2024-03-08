import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        while (true) {
            if (n % 5 == 0 && n % 7 == 0 && n % 11 == 0) {
                System.out.println("Số nguyên dương nhỏ nhất chia hết cho 5,7,11 là: " + n);
                break;
            }
            n++;
        }
    }
}
