package baitap;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Bai_3 {
    public static void main(String[] args) {
        //liên k?t ???ng d?n t?i file
        String filePath = "C:\\rikkei\\MD2\\session18-File\\du_lieu_van_ban";
        try {
            // ??c file sang String
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            //convert l?i thành m?ng string v?i m?i t? là 1 ph?n t? c?a m?ng
            String[] words = content.split("\\s+");
            //T?o 1 list String ?? l?u các t? tìm ???c
            List<String> longestWords = new ArrayList<>();
            int max = 0;// ??t bi?n max ?? tìm t? có ?? dài l?n nh?t
            for (String word : words) {
                if (word.length() > max) {
                    max = word.length();
                    longestWords.clear(); // n?u tìm th?y t? dài h?n thì ??i list m?i và gán l?i
                    longestWords.add(word);
                } else if (word.length() == max) {
                    longestWords.add(word);// n?u ?? dài c?a ptu = ?? dài l?n nh?t tìm ???c thì add vào list
                }
            }
            // In ra
            System.out.println("Các t? có ?? dài l?n nh?t là: " + longestWords +"v?i ?? dài là: "+max );
        } catch (IOException e) {
            System.out.println("Có l?i khi ??c: "+e.getMessage());
        }
    }
}
