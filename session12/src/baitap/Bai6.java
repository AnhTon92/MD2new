package baitap;


import java.util.Scanner;
import java.util.Stack;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi đầu vào : ");
        String input = scanner.nextLine();
        Stack<Character> inputStack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                inputStack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (inputStack.isEmpty()) {
                    System.out.println("Không có cặp ngoặc hợp lệ");
                    return;
                }
                char open = inputStack.pop();
                if (!isMatching(open, c)) {
                    System.out.println("Không có cặp ngoặc hợp lệ");
                    return;
                }
            }
        }
        boolean check = inputStack.isEmpty();
        if (check) {
            System.out.println("Có cặp ngoặc hợp lệ");
        } else {
            System.out.println("Không có cặp ngoặc hợp lệ");
        }
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
