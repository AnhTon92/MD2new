package baitap.entitty;

import java.util.Arrays;
import java.util.Collections;

public class RandomIntArr {
    // phương thức tạo và trả về 1 mảng 1 chiều ngẫu nhiên
    public static int[] getArr() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    // in mảng 1 chiều
    public static void printIntArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[][] getTwoDimensionalArray() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    // Phương thức in mảng 2 chiều
    public static void printTwoDimensionalArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    // Phương thức tạo và trả về mảng ngẫu nhiên đã sắp xếp
    public static Integer[] getSortedArray() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }
    // Phương thức tạo và trả về mảng ngẫu nhiên đã sắp xếp đảo ngược
    public static Integer[] getDescendingSortedArray() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
}



