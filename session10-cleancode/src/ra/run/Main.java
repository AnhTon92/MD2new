package ra.run;

import ra.business.design.CRUD;
import ra.business.design.EmployeeManager;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        CRUD employee = new EmployeeManager();
        do {
            System.out.println("*********************MENU********************** \n" +
                    "1.\tThêm mới 1 nhân viên \n" +
                    "2.\tHiển thị danh sách thông tin nhân viên \n" +
                    "3.\tXem thông tin nhân viên theo mã nhân viên\n" +
                    "4.\tCập nhật thông tin nhân viên\n" +
                    "5.\tXóa nhân viên\n" +
                    "6.\tTìm kiếm nhân viên theo tên (tương đối)\n" +
                    "7.\tSắp xếp và hiển thị danh sách nhân viên theo tên từ a - z\n" +
                    "8.\tThoát\n" +
                    "Mời nhập tác vụ:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employee.createData();
                    break;
                case 2:
                    employee.readData();
                    break;
                case 3:
                    employee.showInfo();
                    break;
                case 4:
                    employee.updateData();
                    break;
                case 5:
                    employee.deleteData();
                    break;
                case 6:
                    employee.searchData();
                    break;
                case 7:
                    employee.sortData();
                    break;
                case 8:
                    System.exit(8);
                    break;
                default:
                    System.out.println("Mời nhập lại!");
                    break;
            }
        }
        while (choice != 8);
    }
}
