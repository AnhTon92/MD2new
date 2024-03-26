package baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bai5 {
    public static void main(String[] args) {


    String str = "Rikkei Academy để nông dân biết code";
    List<String> stringList = new ArrayList<>();
    // cắt chuỗi thành các ptu trong mảng tại vị trí có dấu " "
    String[] arrString = str.split("\\s");
        System.out.println(Arrays.toString(arrString));
    //c1: dùng addAll chuyển các ptu trong mảng sang danh sách
    boolean b = Collections.addAll(stringList, arrString);
    int min = stringList.get(0).length();
        System.out.println(stringList);
        List<String> listMin = new ArrayList<>();
    for (String word : stringList){
        if (word.length() < min) {
            listMin.clear();
            listMin.add(word);
            min = word.length();

        } else if (word.length() == min) {
            listMin.add(word);

        }
    }
        System.out.println("danh sách phần tử ngắn nhất là:");
        System.out.println(listMin);
}
}
