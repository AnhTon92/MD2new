package baitap.bai7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Bai_7 {
    public static void main(String[] args) {
        String filePath = "C:\\rikkei\\MD2\\session18-File\\countries.csv"; // ???ng d?n t?i file nh? phân

        // B??c 2: S? d?ng ObjectInputStream ?? ??c t? t?p
        try (FileInputStream fileStream = new FileInputStream(filePath);
             ObjectInputStream objectStream = new ObjectInputStream(fileStream)) {

            // B??c 3: Hi?n th? danh sách lên màn hình
            ArrayList<Country> countries = (ArrayList<Country>) objectStream.readObject();
            for (Country country : countries) {
                System.out.println(country);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
