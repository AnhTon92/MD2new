package baitap;


import java.util.*;

public class Bai_5
{
    public static void main(String[] args) {
        // Tao HashMap
        Map<Integer,Integer> map = new HashMap<>();
        // Thêm ptu vào map
        map.put(1, 1);
        map.put(3, 7);
        map.put(5, 9);
        map.put(7, 19);
        map.put(9, 893);
        map.put(10, 80);
        map.put(4, 2);
        map.put(6, 6);
        map.put(22, 8);
        map.put(11, 9);
        System.out.println(map);
        // Them key-value
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);
        // Sap xep
        list.sort((o1, o2) -> o1.getValue() - o2.getValue());
        System.out.println(list);

    }
}
