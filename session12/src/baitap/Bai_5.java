package baitap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chuỗi cần kiểm tra");
        String inputString = scanner.nextLine();
        Queue<Character> queue = new LinkedList<>();
        for (int i = inputString.length() - 1; i >=0  ; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (inputString.equals(reverseString)){
            System.out.println("đây là chuỗi đối xứng");
        } else {
            System.out.println("đây không phải chuỗi đôi xứng");
        }
    }
}
