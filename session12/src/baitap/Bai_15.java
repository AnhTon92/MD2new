package baitap;

import java.util.Scanner;
import java.util.Stack;

public class Bai_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("nhập vào một số thập phân");
        int demcNumber = scanner.nextInt();
        while(demcNumber != 0){
            int d = demcNumber % 2 ;
            stack.push(d);
            demcNumber /= 2;
        }
        System.out.println("\n Giá trị nhị phân là: ");
        while (!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
    }
}
