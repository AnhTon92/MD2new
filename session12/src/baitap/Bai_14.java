package baitap;

import java.util.Scanner;
import java.util.Stack;

public class Bai_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp vào chuỗi để kiểm tra");
        String input = scanner.nextLine();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                stack.push(Character.getNumericValue(input.charAt(i)));
            }
        }
        if (stack.empty()) {
            System.out.println("chuỗi này rỗng");
        } else {
            boolean checkSNT = false;
            for (int i = 0; i < stack.size(); i++) {
                for (int j = 2; j < stack.get(i); j++) {
                    if (stack.get(i) % j == 0) {
                        checkSNT = true;
                        break;
                    }
                }
            }
            if (checkSNT) {
                System.out.println("chuôỗi này không phải dãy nguyên tố");
            } else {
                System.out.println("là chuỗi nguyên tố");
            }
        }
    }
}
