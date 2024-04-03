package baitap;

import java.io.*;

public class Bai_2 {
    public static void main(String[] args) {
//đường dẫn đên file nguồn và đích
        String sourceFilePath = "C:\\rikkei\\MD2\\session18-File\\source_file.bin";
        String targetFilePath = "C:\\rikkei\\MD2\\session18-File\\target_file.bin";
        //tạo buffer để chứa dữ liệu đọc từ file nguồn
        byte[] buffer = new byte[1024];
        int bytesRead;
        try (FileInputStream sourceFile = new FileInputStream(sourceFilePath);
        FileOutputStream targetFile = new FileOutputStream(targetFilePath)){
            //đọc và ghi dữ liệu từ file nguồn sang file đích đến
        while ((bytesRead = sourceFile.read(buffer)) != -1) {
            targetFile.write(buffer, 0 , bytesRead);
        }
            System.out.println("Sao chép file hoàn tất. Số byte đã sao chép: " +new File(targetFilePath).length());
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép file: " + e.getMessage());
        }
    }
}
