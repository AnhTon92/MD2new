package baitap;

import java.util.ArrayList;
import java.util.List;

public class Bai8 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        List<Integer> number1 = new ArrayList<>();
        number1.add(5);
        number1.add(6);
        number1.add(7);
        number1.add(8);

        number.addAll(number1);
        System.out.println(number);

    }
}
