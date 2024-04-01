package baitap;

import baitap.entitty.RandomIntArr;

public class Bai_1_LinearSearch {
    public static void main(String[] args) {
        // gọi phương thức từ class RandomInt
        int[] arr = RandomIntArr.getArr();
        // in ra mảng
        System.out.println("mảng số nguyên: ");
        RandomIntArr.printIntArr(arr);
        //thuật toán tìm kiếm tuyến tính
        int maxNumber = findMaxByLinearSearch(arr);
        //in ra số lớn nhất
        System.out.println("số lớn nhất trong mảng là:" + maxNumber);

    }
    private static int findMaxByLinearSearch (int[] arr) {
        int max = arr[0]; //b1: gán max = phần tử có địa chỉ đầu tiên của mảng
        for (int i = 0; i < arr.length; i++) { //b2: vòng lặp duyệt hết mảng
            if (arr[i] > max) {// b3: đặt điều kiên trong vòng lặp nếu phần t ở vị trí i có giá trị
                max = arr[i]; // lớn hơn max thì max đc gán là phần tử đó.

            }
        }
        return max;
    }
}
