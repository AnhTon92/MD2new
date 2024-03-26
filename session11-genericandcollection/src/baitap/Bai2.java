package baitap;

import java.util.ArrayList;
import java.util.List;

public class Bai2 {
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
        System.out.println("List số nguyên ban đầu là: ");
        for (int soNguyen : listInt) {
            System.out.println(soNguyen + " ");
        }
        List<Integer> reversedList = new ArrayList<>();
        for (int i = listInt.size(); i >= 0 ; i--) {
            reversedList.add(listInt.get(i));
        }
        System.out.println("List đảo là:" + reversedList);
    }
}
