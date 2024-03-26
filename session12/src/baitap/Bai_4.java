package baitap;

import java.util.Scanner;
import java.util.Stack;

public class Bai_4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        int numberOfWords = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập vào số lượng từ: ");
        numberOfWords = scanner.nextInt();

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("nhập vào" + (i +1) + ":");
            stack.push(scanner.next());
        }
        System.out.println("in ra các từ ở ngăn xếp");
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
