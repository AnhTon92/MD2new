package ontapbuoi1;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        // nhập vào số phần tử n của mảng 1 chiều ,
// khai báo và nhập giá trị của mảng 1 chiều số thực gồm n phần tử.
// In ra giá trị trung bình cộng của các phần tử trong mảng
Scanner scanner =new Scanner(System.in);
        System.out.println("nhập vào số phần tử n của mảng");
        int n = Integer.parseInt(scanner.nextLine());
        // khai báo mảng số thực
        double[] array = new double[n];
        // nhập giá trị
        double sum =0;
        for (int i = 0; i < n; i++) {
            System.out.println("nhập giá trị của phần tử thứ "+ (i+1) + ":");
            array[i] = Double.parseDouble(scanner.nextLine());
            sum += array[i];
        }
// tính giá trị trung bình
        double average = sum / n;
        // in ra giá trị trung bình cộng của mảng
        System.out.println("giá trị trung bình cộng của các phần tử trong mảng là: "+ average);
    }
}
