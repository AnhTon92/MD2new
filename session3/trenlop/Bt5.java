import java.util.Scanner;

public class Bt5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo mảng số nguyên với SIZE phần tử
        System.out.println("mời nhập độ dài mảng");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            arr[i] = scanner.nextInt();
        }

        // Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
        int min = arr[0];

        // Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mang
        for (int i = 1; i < arr.length; i++) {
            // So sánh lần lượt các phần tử tiếp theo với giá trị nhỏ nhất
            if (arr[i] < min) {
                // Nếu phần tử tiếp theo nhỏ hơn giá trị nhỏ nhất thì gán giá trị nhỏ nhất là phần tử tiếp theo
                min = arr[i];
            }
        }

        // Bước 5: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}

