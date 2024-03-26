package baitap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Bai1 {
    public static <Interger> void main(String[] args) {
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
        // tìm phần tử lớn nhất
        int maxInt = Collections.max(listInt);
        // In ra
        System.out.println("số nguyên lớn nhất trong list là: "+ maxInt);
    }
}
