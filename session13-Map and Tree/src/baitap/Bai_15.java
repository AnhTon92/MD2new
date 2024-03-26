package baitap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Bai_15 {
    public static void main(String[] args) {
        // B1: Khởi tạo TreeMap với comparator.reverseOrder()
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // B2: Thêm các phần tử vào TreeMap
        treeMap.put("A", 10);
        treeMap.put("B", 20);
        treeMap.put("C", 30);
        treeMap.put("D", 40);
        treeMap.put("E", 50);

        // B3: In ra các phần tử của TreeMap
        for (String key : treeMap.keySet()) {
            System.out.println(key + " : " + treeMap.get(key));
        }
        //B4: Xóa key A khỏi TreeMap
        treeMap.remove("A");
        // B5: In ra sau khi xóa
        // In TreeMap ra để kiểm tra
        System.out.println("TreeMap sau khi xóa:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
