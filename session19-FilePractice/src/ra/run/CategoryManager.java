package ra.run;

import ra.bussiness.impl.CategoriesImpl;

import java.util.Scanner;

public class CategoryManager {
    private CategoriesImpl categoriesImpl;
    private Scanner scanner;

    public CategoryManager() {
        this.categoriesImpl = new CategoriesImpl();
        this.scanner = new Scanner(System.in);
    }

    public void displayCategoryMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("************CATEGORIES MENU************");
            System.out.println("1. Nhập thông tin các danh mục: ");
            System.out.println("2. Hiển thị thông tin các danh mục: ");
            System.out.println("3. Cập nhật thông tin danh mục: ");
            System.out.println("4. Xóa danh mục:");
            System.out.println("5. Cập nhật trạng thái danh mục: ");
            System.out.println("6. Thoát");
            System.out.print("Chọn một chức năng: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    inputCategories();
                    break;
                case 2:
                    categoriesImpl.displayData();
                    break;
                case 3:
                    updateCategory();
                    break;
                case 4:
                    deleteCategory();
                    break;
                case 5:
                    updateCategoryStatus();
                    break;
                case 6:
                    back = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }

    private void updateCategoryStatus() {
        System.out.println("Nhập mã danh mục cần cập nhật trạng thái: ");
        int catalogIdToUpdateStatus = Integer.parseInt(scanner.nextLine());
        categoriesImpl.updateCategoryStatus(catalogIdToUpdateStatus);
    }

    private void deleteCategory() {
        System.out.println("Nhập mã danh mục cần xóa: ");
        int catalogIdToDelete = Integer.parseInt(scanner.nextLine());
        categoriesImpl.deleteCategory(catalogIdToDelete);
    }

    private void updateCategory() {
        System.out.println("Nhập mã danh mục cần cập nhật: ");
        int catalogId = Integer.parseInt(scanner.nextLine());
        categoriesImpl.updateCategory(catalogId);
    }

    private void inputCategories() {
        System.out.println("Nhập số lượng danh mục cần thêm: ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count ; i++) {
            categoriesImpl.inputData();
        }
    }
}
