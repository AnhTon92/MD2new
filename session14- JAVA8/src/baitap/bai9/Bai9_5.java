package baitap.bai9;



import java.time.LocalDate;


public class Bai9_5 {
    public static void main(String[] args) {
        LocalDate year = LocalDate.now();
        int lengthYear = year.lengthOfYear();
        System.out.println(lengthYear);
    }
}
