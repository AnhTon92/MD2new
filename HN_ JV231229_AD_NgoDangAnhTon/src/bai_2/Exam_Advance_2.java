package bai_2;

import java.util.Scanner;
import java.util.Stack;

public class Exam_Advance_2 {
    public void initializeData() {
        historyStack.push("https://www.example.com");
        historyStack.push("https://www.anotherexample.com");
    }
    private Stack<String> historyStack;
    public Exam_Advance_2(){
        historyStack = new Stack<>();
    }
    public void enterURL(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào URL muốn truy cập: ");
        String url = scanner.nextLine();
        historyStack.push(url);
        System.out.println("URL '" + url + "' đã được thêm vào lịch sử.");
    }
    public void goBack () {
        if (!historyStack.isEmpty()) {
            historyStack.pop();
            if (!historyStack.isEmpty()) {
                System.out.println("URL tiếp theo: " + historyStack.peek());
            } else {
                System.out.println("Không còn lịch sử URL để quay lại.");
            }
        } else {
            System.out.println("Lịch sử trống");
        }
    }
    public void start () {
        Scanner scanner = new Scanner(System.in);
        int choice;
        initializeData();
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************");
            System.out.println("1. Nhập URL muốn truy cập");
            System.out.println("2. Quay lại");
            System.out.println("3. Thoát");
            System.out.print("Chọn một chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    enterURL();
                    break;
                case 2:
                    goBack();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 3);
    }

    public static void main(String[] args) {
        new Exam_Advance_2().start();
    }
}
