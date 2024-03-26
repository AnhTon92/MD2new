package ontapbuoi1;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
                //khai báo mảng số nguyên gồm 5 pần tử ,
        // nhập giá trị các phần tử từ bàn phím và in ra giá trị các
        // phần tử của mảng
        Integer [] arr = new Integer[5]; // khai báo mảng số nguyên arr gồm 5 ptu
        // nhập giá trị
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập giá trị cho phần tử thứ "+ (i+1) + ":");
            arr[i] = scanner.nextInt();
        }
        //In ra
        System.out.println("giá trị phần tử của mảng là: ");
        for (int j : arr) {
            System.out.println(j);
        }
    }

}
