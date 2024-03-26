package ontapbuoi1;

import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        // Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
//tử của mảng 1 chiều số nguyên. Nhập chỉ số phần tử cần xóa (deleteIndex)
//và thực hiện xóa phần tử trong mảng theo deleteIndex
// cách 1: thông thường
        //1. khai báo biến n số phần tử của mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        //2. khai báo mảng
        int[] array = new int[n];
        //3. nhập giá trị cho mảng
        int temp = 0;
        System.out.println("nhập giá trị các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.println("phần tử thứ " + (i + 1) + ": ");
            temp = Integer.parseInt(scanner.nextLine());
            array[i] = temp;
        }
        //4. nhập chỉ số phần tử cần xóa
        System.out.println("nhập chỉ số phần tử cần xóa: ");
        int deleteIndex = Integer.parseInt(scanner.nextLine());
        // xóa phần tử tại chỉ số deleteIndex
        while (deleteIndex < 0 || deleteIndex >= n) {
            System.out.println("chỉ số deleteIndex không hợp lệ. mời nhập lại");
            deleteIndex = Integer.parseInt(scanner.nextLine());
        }
        for (int i = deleteIndex; i < n - 1; i++) {
            array[i] = array[i + 1];

        }
        n--; // giảm kích thước mảng sau khi xóa

        //in mảng sau khi xóa
        System.out.println("mảng sau khi xóa:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
    }
}

