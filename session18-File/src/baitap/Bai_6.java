package baitap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Bai_6 {
    public static void main(String[] args) {
        String filePath = "C:\\rikkei\\MD2\\session18-File\\du_lieu_van_ban"; // ???ng d?n t?i file v?n b?n

        Map<String, Integer> wordFrequency = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Tách chu?i d?a trên kho?ng tr?ng
                for (String word : words) {
                    word = word.toLowerCase(); // Chuy?n ??i t?t c? các t? v? d?ng ch? th??ng
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Có l?i khi ??c file: " + e.getMessage());
            return;
        }

        int maxFrequency = 0;
        String mostFrequentWord = "";

        // Tìm t? có t?n su?t xu?t hi?n cao nh?t
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // Hi?n th? t? ???c s? d?ng nhi?u nh?t và t?n su?t xu?t hi?n c?a nó
        System.out.println("T? ???c s? d?ng nhi?u nh?t là: \"" + mostFrequentWord + "\" v?i t?n su?t: " + maxFrequency);
    }
}
