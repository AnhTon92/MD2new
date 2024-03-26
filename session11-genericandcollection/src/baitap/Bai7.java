package baitap;

import java.util.ArrayList;
import java.util.List;

public class Bai7 {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            listNumber.add(i);

        }
        for (int i = 0; i <listNumber.size() ; i++) {
            if (listNumber.get(i)%2==0){
                listNumber.remove(i);
            }
        }
        System.out.println("danh sách các phần tử không chia hết cho 2 trong mảng "+listNumber);

    }
}