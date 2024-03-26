package ontapbuoi1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        // nhập số phần tử của mảng n , khai báo và nhập giá trị các phần tử của mảng
// 1 chiều số nguyên . Nhập giá trị addValue và chỉ số chèn phần tử vào mảng
// addIndex, thực hiện thêm chèn giá trị addValue và chỉ số các phần tử addIndex của mảng
        Scanner scanner = new Scanner(System.in);
// 1.nhập số phần tử của mảng
        System.out.println("nhập số phần tử của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        //2. khai báo arraylist để lưu trữ các phần tử số nguyên
        ArrayList<Integer> array = new ArrayList<>();
        //3. nhập giá trị cho mảng
        int temp = 0;
        System.out.println("nhập giá trị các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.println("phần tử thứ " + (i + 1) + ": ");
            temp = Integer.parseInt(scanner.nextLine());
            array.add(temp);
        }
        //4. nhập giá trị addValue và chỉ số addIndex
        System.out.println("nhập giá trị addValue để chèn vào mảng: ");
        int addValue = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giá trị addIndex để chèn vào mảng: ");
        int addIndex = Integer.parseInt(scanner.nextLine());
        //5.thêm chèn giá trị addValue và chỉ số addIndex của mảng
        while (addIndex < 0 || addIndex > n) {
            System.out.println("chỉ số addIndex không hợp lệ. mời nhập lại");
            addIndex = Integer.parseInt(scanner.nextLine());
        }
        array.add(addIndex, addValue);

        //6. in mảng sau khi chèn
        System.out.println("mảng sau khi chèn là:");
        for (int value : array) {
            System.out.println(value + " ");
        }
    }
}
