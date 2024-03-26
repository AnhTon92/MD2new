package ontapbuoi1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// cách 2: dùng arraylist
//        1. khai báo biến n số phần tử của mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng: " );
        int n = Integer.parseInt(scanner.nextLine());
        //2. khai báo arrayList
        ArrayList<Integer> array = new ArrayList<>();
        //3. nhập giá trị cho mảng
        int temp = 0;
        System.out.println("nhập giá trị các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.println("phần tử thứ " + (i + 1) + ": ");
            temp = Integer.parseInt(scanner.nextLine());
            array.add(temp);
        }
        //4. nhập chỉ số phần tử cần xóa
        System.out.println("nhập chỉ số phần tử cần xóa: ");
        int deleteIndex = Integer.parseInt(scanner.nextLine());
        // xóa phần tử tại chỉ số deleteIndex
        while (deleteIndex < 0 || deleteIndex >= n) {
            System.out.println("chỉ số deleteIndex không hợp lệ. mời nhập lại");
            deleteIndex = Integer.parseInt(scanner.nextLine());
        }
        array.remove(deleteIndex);
        System.out.println("phần tử tại chỉ số "+ deleteIndex+"đã được xóa!");
        //in mảng sau khi xóa
        System.out.println("mảng sau khi xóa:");
       for (int value : array) {
           System.out.println(value + " ");
    }
    }
}

