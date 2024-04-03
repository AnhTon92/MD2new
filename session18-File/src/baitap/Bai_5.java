package baitap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bai_5 {
    public static void main(String[] args) {
        String pathToFile = "C:\\rikkei\\MD2\\session18-File\\countries.csv"; // ???ng d?n t?i file CSV

        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                // S? d?ng ph??ng th?c split() ?? c?t chu?i theo d?u ph?y
                String[] country = line.split(",");

                // Hi?n th? thông tin qu?c gia
                System.out.println("ID: " + country[0] + ", Code: " + country[1] + ", Name: " + country[2]);
            }
        } catch (IOException e) {
            System.out.println("Có l?i khi ??c file: " + e.getMessage());
        }
    }
    }

