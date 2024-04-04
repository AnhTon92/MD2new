package bai_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam_Advance_3 {
    public void initializeData() {
        customerQueue.offer("Ngô Đăng Anh Tôn");
        customerQueue.offer("Trần Thị Ngu Ngơ");
    }
    private Queue<String> customerQueue;

    public Exam_Advance_3() {
        customerQueue = new LinkedList<>();
    }

    public void addCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên khách hàng chờ mua vé xem phim: ");
        String customerName = scanner.nextLine();
        customerQueue.offer(customerName);
        System.out.println("Khách hàng '" + customerName + "' đã được thêm vào hàng đợi.");
    }

    public void nextCustomer() {
        if (!customerQueue.isEmpty()) {
            System.out.println("Khách hàng tiếp theo: " + customerQueue.poll());
        } else {
            System.out.println("Không còn khách hàng trong hàng đợi.");
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        initializeData();
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-3-MENU***************");
            System.out.println("1. Nhập tên khách hàng chờ mua vé xem phim");
            System.out.println("2. Khách tiếp theo");
            System.out.println("3. Thoát");
            System.out.print("Chọn một chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    nextCustomer();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 3);
    }

    public static void main(String[] args) {
        new Exam_Advance_3().start();
    }
}
