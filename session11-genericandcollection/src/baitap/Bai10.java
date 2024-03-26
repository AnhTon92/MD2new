package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        List<Integer> arrNumber = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrNumber.add((int) (Math.random() * 10));
        }
        System.out.println("mảng ban đầu " +arrNumber);
        System.out.println("mời bạn nhập số 1");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("mời bạn nhập số 2");
        int number2 = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 0; i < arrNumber.size(); i++) {
            if (arrNumber.get(i) >= number1 && arrNumber.get(i) <= number2){
                sum += arrNumber.get(i);
            }
        }
        System.out.println("Tổng các số từ "+ number1+ " đến " + number2+" là " +sum);
    }
}
