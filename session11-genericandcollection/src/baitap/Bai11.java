package baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai11 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listNumber.add((int) Math.ceil(Math.random() * 10));
        }
        for (Integer i : listNumber) {
            System.out.println(i);
        }
        System.out.println("giá trị lớn nhất của list là " + Collections.max(listNumber));
    }
}
