package ra.run;

import ra.entity.Product;

import java.util.Scanner;

public class ShopManagement {
    public static CategoryManagement categoryManagement = new CategoryManagement();
    public static ProductManagement productManagement = new ProductManagement();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("============MENU============");
            System.out.println("1. Quản lý danh mục");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.println("============================");
            System.out.print("Vui lòng lựa chọn: ");
            choice = Integer.parseInt(new Scanner(System.in).nextLine());

            switch (choice) {
                case 1:
                    categoryManagement.displayCategoryMenu();
                    break;
                case 2:
                    productManagement.displayProductMenu();
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

