package ontapbuoi1;

import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        //// nhập vào số phần tử mảng n, khai báo và nhập giá trị các phần tử của mảng
//// 1 chiều số nguyên. Nhập vào giá trị findNumber, in ra chỉ số các phần tử và
//// tổng các phần tử bằng với giá trị findNumber
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhập vào độ dài của mảng: ");
    int n = Integer.parseInt(scanner.nextLine());
    //khai báo mảng
    int[] array = new int[n];
    // nhập giá trị
    System.out.println("nhập giá trị cho các phần tử mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.println("phần tử thứ "+ (i+1)+":");
        array[i] = Integer. parseInt(scanner.nextLine());
    }
    System.out.println(" nhập vào giá trị findNumber: ");
    int findNumber = Integer.parseInt(scanner.nextLine());
    // in ra chỉ số các phần tử và tổng của các phần tử bằng với findNumber
    int sum = 0 ;
    System.out.println("chỉ số các phần tử bằng với "+findNumber +"là:" );
    for (int i = 0; i < n; i++) {
        if (array[i] ==  findNumber) {
            System.out.printf(i+" ");
            sum += array[i];
        }
    }
    System.out.println("\n Tổng các phần tử bằng với "+findNumber+" là: " + sum);
    }
}
