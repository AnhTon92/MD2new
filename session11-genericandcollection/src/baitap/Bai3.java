package baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bai3 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        Collections.sort(listNumber, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("sắp xếp giảm dần " + listNumber);
    }
}
