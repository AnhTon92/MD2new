package baitap;

import java.util.TreeMap;

public class Bai_13 {
    public static void main(String[] args) {
        //khai báo treemap
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        //thêm phần tử vào treemap
        treeMap.put(34, 0);
        treeMap.put(323, 0);
        treeMap.put(5, 0);
        treeMap.put(3, 0);
        treeMap.put(22, 0);
        //in ra phần tử có key bé nhất

        System.out.println(treeMap.firstEntry());
    }
}
