package baitap;

import baitap.entitty.RandomIntArr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_2_SearchInTwoDemensionalArr {
    public static void main(String[] args) {
        //b1: tạo mảng 2 chiều và in ra
        int[][] arr = RandomIntArr.getTwoDimensionalArray();
        RandomIntArr.printTwoDimensionalArray(arr);
        //b2: tiến hành tìm kiếm số nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần tìm: ");
        int findNumber = Integer.parseInt(scanner.nextLine());
        // tạo biến found để check có tồn tại hay không qua phương thức searchNumber
        boolean found = searchNumber(arr, findNumber);
        System.out.println("Số" + findNumber + (found ? "có" : "không có") + " trong mảng");
    }

    private static boolean searchNumber(int[][] arr, int findNumber) {
        //tạo ra List cho row và col của mảng 2 chiều để duyệt
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        // đặt cờ found về false
        boolean found = false;
        //duyệt mảng 2 chiều
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == findNumber) {// nếu phần tử ở vị trí i,j = findNumber thì
                    // thêm vào giá trị của phần tử ấy tại i,j vào rows và cols và cờ found về true cho đến hết mảng
                    rows.add(i);
                    cols.add(j);
                    found = true;
                }
            }

        }
        if (found) {
            System.out.println("Vị trí của số " + findNumber + ":");
            for (int i = 0; i < rows.size(); i++) {
                System.out.println("(" + rows.get(i) + ", " + cols.get(i) + ")");
            }
        }

        return found;
    }
}


