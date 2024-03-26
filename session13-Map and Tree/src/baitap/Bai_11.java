package baitap;

import java.util.Map;
import java.util.TreeMap;

public class Bai_11 {
    public static void main(String[] args) {
        //khai báo mảng các ptu nguyên và đối tượng treemap
        int[] arr = {5, 2, 4, 6, 1, 3};
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        //thêm phần tử của mảng vào treemap
        for (int i : arr) {
            treeMap.put(i,0);
        }
        //duyệt treemap và in ra phần tử (treemap tự sắp xếp theo tăng dần)
        for (Map.Entry<Integer,Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey());
        }

    }
}
