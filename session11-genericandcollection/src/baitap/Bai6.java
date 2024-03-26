package baitap;

import java.util.ArrayList;
import java.util.List;

public class Bai6 {
    public static void main(String[] args) {
        // tạo list số nguyên
        List<Integer> listInt = new ArrayList<>();
        //tạo số lượng phần tử ngẫu nhiên
        int count = (int) (Math.random() * 10) +1;
        //duyệt vòng lặp để gán giá trị ngẫu nhiên cho từng phân tử
        for (int i = 0; i < count; i++) {
            listInt.add((int) (Math.random() * 100));
        }
        //In ra
        System.out.println("List số nguyên ngẫu nhiên là: ");
        for (int soNguyen : listInt) {
            System.out.println(soNguyen + " ");
        }
        for (int i = 0; i < listInt.size(); i++) {
            for (int j = i; j < listInt.size() - 1 ; j++) {
                if (listInt.get(j) > listInt.get(j+1)) {
                    int key = listInt.get(j);
                    listInt.set(j, listInt.get(j+1));
                    listInt.set(key, listInt.get(j+1));
                }
            }
        }
        System.out.println(listInt);
    }
}
