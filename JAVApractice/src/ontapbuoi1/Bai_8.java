package ontapbuoi1;

import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
                //Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
        //tử của mảng 1 chiều số nguyên. Nhập giá trị (updateValue) và chỉ số phần
        //tử cần cập nhật (updateIndex), thực hiện cập nhật giá trị updateValue vào
        //phần tử có chỉ số updateIndex
        Scanner scanner = new Scanner(System.in);
// 1.nhập số phần tử của mảng
        System.out.println("nhập số phần tử của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        //2. khai báo mảng số nguyên
        int[] array = new int[n];
        //3. nhập giá trị cho mảng
        int temp = 0;
        System.out.println("nhập giá trị các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.println("phần tử thứ " + (i + 1) + ": ");
            temp = Integer.parseInt(scanner.nextLine());
            array[i] = temp;
        }
        //4. nhập giá trị updateValue và chỉ số updateIndex
        System.out.println("nhập giá trị updateValue để chèn vào mảng: ");
        int updateValue = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giá trị updateIndex để chèn vào mảng: ");
        int updateIndex = Integer.parseInt(scanner.nextLine());
        //5.thêm chèn giá trị addValue và chỉ số addIndex của mảng
        while (updateIndex < 0 || updateIndex >= n) {
            System.out.println("chỉ số updateIndex không hợp lệ. mời nhập lại");
            updateIndex = Integer.parseInt(scanner.nextLine());
        }
        array[updateIndex] = updateValue;

        //6. in mảng sau khi chèn
        System.out.println("mảng sau khi update là:");
        for (int value : array) {
            System.out.println(value + " ");
        }
    }
}
