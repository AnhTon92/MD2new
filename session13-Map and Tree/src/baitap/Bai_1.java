package baitap;

import java.util.HashMap;

public class Bai_1 {

    public static void main(String[] args) {
        // B1: Khai báo mảng
        int[] arr = {1, 2, 3, 4, 2, 5, 1, 3, 1};

        // B2: Tạo HashMap để lưu trữ số lần xuất hiện
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            // Kiểm tra phần tử đã có trong map hay chưa
            if (map.containsKey(key)) {
                // Tăng số lần xuất hiện lên 1
                map.put(key, map.get(key) + 1);
            } else {
                // Thêm phần tử vào map với số lần xuất hiện là 1
                map.put(key, 1);
            }
        }

        // B3: Duyệt qua map và in ra số lần xuất hiện
        for (int key : map.keySet()) {
            int value = map.get(key);
            System.out.println("Phần tử " + key + " xuất hiện " + value + " lần");
        }
    }
}

