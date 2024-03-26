package baitap;

import java.util.Stack;

public class Bai_2 {
    public static void main(String[] args) {
        String input = "{,[,(,),],}";
        System.out.println(isValid(input));
    }

    public static boolean isValid(String s) {
//        Tạo một ngăn xếp trống để lưu trữ các dấu ngoặc
        Stack<Character> stack = new Stack<>();

        // Lặp qua từng ký tự trong chuỗi đầu vào
        for (char c : s.toCharArray()) {
            // Nếu ký tự là dấu ngoặc mở thì đẩy nó vào ngăn xếp
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }


            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char topElement = stack.pop();
                if (c == ')' && topElement != '(') {
                    return false;
                }
                if (c == '}' && topElement != '{') {
                    return false;
                }
                if (c == ']' && topElement != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
