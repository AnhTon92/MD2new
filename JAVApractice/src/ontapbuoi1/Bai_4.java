package ontapbuoi1;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        //nhập số phần tử và giá trị các phần tử của mảng 1 chiều số nguyên
// tìm giá trị lớn nhất và nhỏ nhất trong mảng
    // nhập độ dài mảng
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
    // tìm giá trị lớn nhất và nhỏ nhất
    int max = array[0];
    int min = array[0];
    for (int j: array){
        if (j > max){
            max =j;
        }
        if (j<min){
            min = j;
        }
    }
    //in ra min và max
    System.out.println("giá trị lớn nhất trong mảng là: " +max);
    System.out.println("giá trị nhỏ nhất trong mảng là: "+min);
    }
}
