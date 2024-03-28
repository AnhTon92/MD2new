package presentation;

import business.design.IEmployee;
import business.entity.Department;
import business.entity.Employee;
import business.impl.EmployeeImp;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMenu {
    static IEmployee iEmployee = new EmployeeImp();

    public void displayEmployeeMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("================Department Menu===================");
            System.out.println("1- Hiển thi tất cả các employee \n" +
                    "2- Thêm mới employee\n" +
                    "3- Sửa thông tin employee \n" +
                    "4- Thay đổi trạng thái employee \n" +
                    "5- Tìm kiếm employee theo tên \n" +
                    "6- Tìm kiếm employee theo mã phòng ban \n" +
                    "7- Quay lại ");

            System.out.println("Nhập lựa chọn");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    iEmployee.displayAll();
                    break;
                case 2:
                    iEmployee.addNew();
                    break;
                case 3:
                    iEmployee.update();
                    break;
                case 4:
                    System.out.println("mời bạn nhập id cần chuyển đổi status");
                    int idChange = Integer.parseInt(scanner.nextLine());
                    iEmployee.changeStatusById(idChange);
                    break;
                case 5:
                    iEmployee.getListEmployeeByDepartment();
                    break;
                case 6:
                    iEmployee.sortEmployeeNameAscending();
                    break;
                case 7:
                    return;
                default:
                    System.err.println("Nhap lua chon ko chinh xác");

            }

        }
    }
}

