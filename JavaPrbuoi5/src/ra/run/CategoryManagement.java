package ra.run;

import ra.design.ICategories;
import ra.impl.CategoryImp;

import java.util.Scanner;

public class CategoryManagement {
    static ICategories iCategories = new CategoryImp();

    public void displayCategoryMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("================Category Menu===================");
            System.out.println("1- Hiển thi tất cả danh mục \n" +
                    "2- Thêm mới danh mục\n" +
                    "3- Sửa thông tin danh mục \n" +
                    "4- Thay đổi trạng thái danh mục \n" +
                    "5- Xóa danh mục \n" +
                    "6- Quay lại ");

            System.out.println("Nhập lựa chọn");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    iCategories.displayAll();
                    break;
                case 2:
                    iCategories.addNew();
                    break;
                case 3:
                    iCategories.update();
                    break;
                case 4:
                    System.out.println("mời bạn nhập id cần chuyển đổi status");
                    int idChange = Integer.parseInt(scanner.nextLine());
                    iCategories.changeStatusById(idChange);
                    break;
                case 5:
                    iCategories.deleteCategoryById();
                    break;
                case 6:
                    return;
                default:
                    System.err.println("nhập lựa chọn không chính xác");

            }
        }
    }

}

