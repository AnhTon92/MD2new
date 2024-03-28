package presentation;

import java.util.Scanner;

public class Menu {
    public static DepartmentMenu departmentMenu = new DepartmentMenu();
    public static  EmployeeMenu employeeMenu = new EmployeeMenu();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("============MENU============");
            System.out.println("1. Quản lý Department");
            System.out.println("2. Quản lý Employee");
            System.out.println("3. Thoát");
            System.out.println("============================");
            System.out.print("Vui lòng lựa chọn: ");
            choice = Integer.parseInt(new Scanner(System.in).nextLine());

            switch (choice) {
                case 1:
                    departmentMenu.displayDepartmentMenu();
                    break;
                case 2:
                    employeeMenu.displayEmployeeMenu();
                    break;
                case 3:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }


}

