package baitap;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Bai_3 {
    public static void main(String[] args) {
        //li�n k?t ???ng d?n t?i file
        String filePath = "C:\\rikkei\\MD2\\session18-File\\du_lieu_van_ban";
        try {
            // ??c file sang String
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            //convert l?i th�nh m?ng string v?i m?i t? l� 1 ph?n t? c?a m?ng
            String[] words = content.split("\\s+");
            //T?o 1 list String ?? l?u c�c t? t�m ???c
            List<String> longestWords = new ArrayList<>();
            int max = 0;// ??t bi?n max ?? t�m t? c� ?? d�i l?n nh?t
            for (String word : words) {
                if (word.length() > max) {
                    max = word.length();
                    longestWords.clear(); // n?u t�m th?y t? d�i h?n th� ??i list m?i v� g�n l?i
                    longestWords.add(word);
                } else if (word.length() == max) {
                    longestWords.add(word);// n?u ?? d�i c?a ptu = ?? d�i l?n nh?t t�m ???c th� add v�o list
                }
            }
            // In ra
            System.out.println("C�c t? c� ?? d�i l?n nh?t l�: " + longestWords +"v?i ?? d�i l�: "+max );
        } catch (IOException e) {
            System.out.println("C� l?i khi ??c: "+e.getMessage());
        }
    }
}
