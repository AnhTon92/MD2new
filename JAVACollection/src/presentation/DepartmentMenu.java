package presentation;


import business.design.IDepartment;
import business.impl.DepartmentImp;

import java.util.Scanner;

public class DepartmentMenu {
    static IDepartment iDepartment = new DepartmentImp();

    public void displayDepartmentMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("================Department Menu===================");
            System.out.println("1- Hiển thi tất cả cac department \n" +
                    "2- Thêm mới department\n" +
                    "3- Sửa thông tin department \n" +
                    "4- Thay đổi trạng thái department \n" +
                    "5- Tìm kiếm phòng ban theo tên \n" +
                    "6- Quay lại ");

            System.out.println("Nhập lựa chọn");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    iDepartment.displayAll();
                    break;
                case 2:
                    iDepartment.addNew();
                    break;
                case 3:
                    iDepartment.update();
                    break;
                case 4:
                    System.out.println("mời bạn nhập id cần chuyển đổi status");
                    int idChange = Integer.parseInt(scanner.nextLine());
                    iDepartment.changeStatusById(idChange);
                    break;
                case 5:
                    iDepartment.searchDepartmentByName();
                    break;
                case 6:
                    return;
                default:
                    System.err.println("Nhap lua chon ko chinh xác");

            }


        }
    }

}