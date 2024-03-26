package baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bai4 {
    public static void main(String[] args) {
        String str = "Rikkei Academy để nông dân biết code";
        List<String> stringList = new ArrayList<>();
        // cắt chuỗi thành các ptu trong mảng tại vị trí có dấu " "
        String[] arrString = str.split("\\s");
        System.out.println(Arrays.toString(arrString));
        //c1: dùng addAll chuyển các ptu trong mảng sang danh sách
        boolean b = Collections.addAll(stringList, arrString);
        //c2: duyet từng phần tử trong mảng add vào danh sách
//        for (String word : arrString) {
//            stringList.add(word.trim());
//        }
        System.out.println("danh sách các phần tử có độ dài lớn hơn 3 là: ");
        for (String word : stringList) {
            if (word.length() > 3) {
                System.out.println(word);
            }
        }
    }
}
