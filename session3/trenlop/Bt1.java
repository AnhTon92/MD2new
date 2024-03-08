import java.util.Scanner;

public class Bt1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên
        System.out.println("mời nhập độ dài mảng");
        int n = scanner.nextInt(); // Nhập số lượng phần tử
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = scanner.nextInt(); // Nhập giá trị cho từng phần tử
        }

        // Bước 2: Nhập X là phần tử cần xóa
        System.out.println("nhập phần tử cần xóa");
        int x = scanner.nextInt();

        // Bước 3: Tìm X xem có xuất hiện trong mảng không
        int indexDel = -1; // Vị trí của X trong mảng
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                indexDel = i;
                break;
            }
        }

        // Bước 4: Thực hiện xóa phần tử X khỏi mảng
        if (indexDel != -1) {
            for (int i = indexDel; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
        }

        // Bước 5: In ra mảng sau khi xóa
        for (int i = 0; i < n - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

