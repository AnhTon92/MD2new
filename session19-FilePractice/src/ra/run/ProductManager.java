package ra.run;

import ra.bussiness.impl.ProductImpl;

import java.util.Scanner;

public class ProductManager {
    private ProductImpl productImpl;
    private Scanner scanner;

    public ProductManager() {
        this.productImpl = new ProductImpl();
        this.scanner = new Scanner(System.in);
    }

    public void displayProductMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("*******************PRODUCT MANAGEMENT*****************");
            System.out.println("1. Nhập thông tin các sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Sắp xếp các sản phẩm theo giá");
            System.out.println("4. Cập nhật thông tin sản phẩm theo mã sản phẩm");
            System.out.println("5. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("6. Tìm kiếm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Tìm kiếm sản phẩm trong khoảng giá a – b");
            System.out.println("8. Thoát");
            System.out.print("Chọn một chức năng: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    productImpl.inputData();
                    break;
                case 2:
                    productImpl.displayData();
                    break;
                case 3:
                    productImpl.sortProductsByPrice();
                    break;
                case 4:
                    System.out.print("Nhập mã sản phẩm cần cập nhật: ");
                    String productId = scanner.next();
                    productImpl.updateProduct(productId);
                    break;
                case 5:
                    System.out.print("Nhập mã sản phẩm cần xóa: ");
                    productId = scanner.next();
                    productImpl.deleteProduct(productId);
                    break;
                case 6:
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String productName = scanner.next();
                    productImpl.searchProductByName(productName);
                    break;
                case 7:
                    System.out.print("Nhập giá thấp nhất: ");
                    float lowerBound = scanner.nextFloat();
                    System.out.print("Nhập giá cao nhất: ");
                    float upperBound = scanner.nextFloat();
                    productImpl.searchProductByPriceRange(lowerBound, upperBound);
                    break;
                case 8:
                    back = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }


}
