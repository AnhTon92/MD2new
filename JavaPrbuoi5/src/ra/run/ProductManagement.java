package ra.run;

import ra.design.IProduct;
import ra.impl.ProductImp;

import java.util.Scanner;

public class ProductManagement {
    static IProduct iProduct = new ProductImp();

    public void displayProductMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("================Product Menu===================");
            System.out.println("1- Hiển thi tất cả các sản phẩm \n" +
                    "2- Thêm mới sản phẩm\n" +
                    "3- Sửa thông tin sản phẩm theo mã sản phẩm \n" +
                    "4- Xóa sản phẩm \n" +
                    "5- Tìm kiếm sản phẩm theo tên \n" +
                    "6- Sắp xếp theo giá \n" +
                    "7- Tìm kiếm sản phẩm trong khoảng giá a-b(a,b nhập từ bàn phím \n" +
                    "8- Quay lại ");

            System.out.println("Nhập lựa chọn");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    iProduct.displayAll();
                    break;
                case 2:
                    iProduct.addNew();
                    break;
                case 3:
                    iProduct.update();
                    break;
                case 4:
                    iProduct.deletebyId(String.valueOf(scanner));
                    break;
                case 5:
                    iProduct.getListProductByCategory();
                    break;
                case 6:
                    iProduct.sortProductByPrice();
                    break;
                case 7:
                    iProduct.searchProductsByPriceRange();
                    break;
                case 8:
                    return;
                default:
                    System.err.println("Nhập lựa chọn không chính xác");

            }

        }
    }
}

