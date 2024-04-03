package baitap;


import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;

public class Bai_1 {
    public static void main(String[] args) {
        String filePath = "C://rikkei/MD2/session18-File/file.txt.txt";
        int wordCount = countWords(filePath);
        System.out.println("S? l??ng t? trong file là "+wordCount);
    }

    private static int countWords(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int wordCount = 0;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            return wordCount;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
