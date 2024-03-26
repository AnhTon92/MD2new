package baitap;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Bai_4 {
    public static void main(String[] args) {
        List<String> danhSachChuoi = Arrays.asList("cam", "tao", "chuoi", "oi", "buoi","Ton","Tuan");

        Comparator<String> comparatorTV = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Collator.getInstance(new Locale("vi","VN")).compare(o1, o2);
            }
        };
        danhSachChuoi.stream().sorted(comparatorTV).forEach(System.out::println);

    }
}
