package baitap;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //tạo mảng 100 số nguyên ngẫu nhiên
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));
        //tạo biến x
        System.out.println("nhập vào giá trị cần xác định");
        int x = Integer.parseInt(scanner.nextLine());
        int[] newArr = Arrays.stream(arr).filter(value -> value > x).toArray();
        System.out.println(Arrays.toString(newArr));
    }
    }

