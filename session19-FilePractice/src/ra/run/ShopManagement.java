package ra.run;

import java.util.Scanner;

public class ShopManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static CategoryManager categoryManager = new CategoryManager();
    private static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("***************SHOP MENU****************");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Chọn một chức năng: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    categoryManager.displayCategoryMenu();
                    break;
                case 2:
                    productManager.displayProductMenu();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
}
