package baitap;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Bai_4 {
    public static void main(String[] args) {
        //t?o file
        String sourceFilePath = "C:\\rikkei\\MD2\\session18-File\\FileGoc";
        String targetFilePath = "C:\\rikkei\\MD2\\session18-File\\FileCop";
        try {
            //??c v?n b?n thành string
            List<String> lines = Files.readAllLines(Paths.get(sourceFilePath));
            // ??o ng??c m?ng string và ??i l?i thành 1 string
            Collections.reverse(lines); // ??o ng??c th? t? các dòng
            String reversedContent = String.join("\n", lines);

            // Ghi ra file m?i
            Files.write(Paths.get(targetFilePath), reversedContent.getBytes());
            System.out.println("?ã sao chép và ??o ng??c t? trong file thành công.");
        }catch (IOException e) {
            System.out.println("Có l?i khi th?c hi?n: " + e.getMessage());
        }
    }
}
