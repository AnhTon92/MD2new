package ontapbuoi2.ra.run;

import ontapbuoi2.ra.entity.Categories;
import ontapbuoi2.ra.entity.Product;

import java.util.Scanner;

public class ShopManagement {
    private static Product[] arrProduct = new Product[100];
    private static Categories[] arrCategories = new Categories[100];
    private static int indexCategories = 0;
    private static int indexProduct = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("******************SHOP MENU*******************");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuCategory(scanner);
                    break;
                case 2:
                    menuProduct(scanner);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ. Hãy nhập lại.");
            }
        } while (choice != 3);
    }

    public static void menuCategory(Scanner scanner) {
        int choice;
        do {
            System.out.println("********************CATEGORIES MENU***********\n" +
                    "1. Nhập thông tin các danh mục\n" +
                    "2. Hiển thị thông tin các danh mục\n" +
                    "3. Cập nhật thông tin danh mục\n" +
                    "4. Xóa danh mục\n" +
                    "5. Cập nhật trạng thái danh mục\n" +
                    "6. Thoát\n");
            System.out.println("Chọn chức năng : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Muốn nhập bao nhiêu danh mục: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        Categories categories = new Categories();
                        categories.inputData(scanner, arrCategories, indexCategories);
                        arrCategories[indexCategories++] = categories;
                    }
                    break;
                case 2:
                    for (int i = 0; i < indexCategories; i++) {
                        arrCategories[i].displayData();
                    }
                    break;

                case 3:
                    System.out.println("Nhap vao id muon sửa");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    boolean found = false;
                    for (int i = 0; i < indexCategories; i++) {
                        if (arrCategories[i].getCatalogId() == idEdit) {
                            System.out.println("Nhập thông tin mới cho danh mục :");
                            arrCategories[i].inputData(scanner, arrCategories, indexCategories);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("không tìm thấy id danh mục muốn sửa");
                    }
                case 4:
                    System.out.println("Nhập id muốn xóa ");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    int index = -1;
                    for (int i = 0; i < indexCategories; i++) {
                        if (arrCategories[i].getCatalogId() == idDelete) {
                            index = i;
                            break;
                        }
                    }
                    if (index != -1) {
                        // Kiểm tra xem danh mục có chứa sản phẩm không
                        boolean hasProduct = false;
                        for (Product product : arrProduct) {
                            if (product != null && product.getCatalogId() == idDelete) {
                                hasProduct = true;
                                break;
                            }
                        }
                        if (!hasProduct) {
                            for (int i = index; i < indexCategories - 1; i++) {
                                arrCategories[i] = arrCategories[i + 1];
                            }
                            arrCategories[indexCategories - 1] = null;
                            --indexCategories;
                            System.out.println("Đã xóa danh mục id = " + idDelete);
                        } else {
                            System.out.println("Không thể xóa danh mục vì nó chứa sản phẩm.");
                        }
                    } else {
                        System.out.println("Không tìm thấy danh mục với id " + idDelete);
                    }
                    break;
                case 5:
                    System.out.println("Nhập id danh mục muốn cập nhật trạng thái");
                    int idUpdate = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < indexCategories; i++) {
                        if (arrCategories[i].getCatalogId() == idUpdate) {
                            arrCategories[i].setCatalogStatus(!arrCategories[i].getCatalogStatus());
                            System.out.println("Đã cập nhật trạng thái danh mục id = " + idUpdate);
                            break;
                        }
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Hãy nhập lại.");

            }
        } while (choice != 6);
    }

    public static void menuProduct(Scanner scanner) {
        int choice;
        do {
            System.out.println("*******************PRODUCT MANAGEMENT*****************\n" +
                    "1. Nhập thông tin các sản phẩm\n" +
                    "2. Hiển thị thông tin các sản phẩm\n" +
                    "3. Sắp xếp các sản phẩm theo giá\n" +
                    "4. Cập nhật thông tin sản phẩm theo mã sản phẩm\n" +
                    "5. Xóa sản phẩm theo mã sản phẩm\n" +
                    "6. Tìm kiếm các sản phẩm theo tên sản phẩm\n" +
                    "7. Tìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn\n" +
                    "phím)\n" +
                    "8. Thoát");
            System.out.println("Chọn chức năng : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if (indexCategories == 0) {
                        System.err.println("Chưa có danh muc , them danh muc truoc");
                        return;
                    }
                    System.out.println("Nhập thông tin bạn muôn them");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        Product product = new Product();
                        product.inputData(scanner, arrProduct, indexProduct, arrCategories, indexCategories);
                        arrProduct[indexProduct++] = product;
                    }
                case 2:
                    for (int i = 0; i < indexProduct; i++) {
                        arrProduct[i].displayData();
                    }
                    break;
                case 3:
                    for (int i = 0; i < indexProduct; i++) {
                        for (int j = 0; j < indexProduct - i - 1; j++) {
                            if (arrProduct[i].getPrice() < arrProduct[j + 1].getPrice()) {
                                Product temp = arrProduct[j];
                                arrProduct[j] = arrProduct[j + 1];
                                arrProduct[j + 1] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < indexProduct; i++) {
                        arrProduct[i].displayData();
                    }
                    break;
                case 4:
                    System.out.println("Nhap ma muốn sửa");
                    String idEdit = scanner.nextLine();
                    for (int i = 0; i < indexProduct; i++) {
                        if (arrProduct[i].getProductId().equals(idEdit)) {
                            arrProduct[i].inputData(scanner, arrProduct, indexProduct, arrCategories, indexCategories);
                        }
                    }
                    break;
                case 5:
                    System.out.println("nhập mã muốn xóa sản phâm");
                    String idDelete = scanner.nextLine();
                    int index = -1;
                    for (int i = 0; i < indexProduct; i++) {
                        if (arrProduct[i].getProductId().equals(idDelete)) {
                            index = i;
                        }
                    }
                    if (index != -1) {
                        for (int i = index; i < indexProduct - 1; i++) {
                            arrProduct[i] = arrProduct[i + 1];
                        }
                        indexProduct--;
                        System.out.println("Đã xóa sản pẩm có id " + idDelete);
                    } else {
                        System.out.println("Ko tìm thấy id " + idDelete);
                    }
                    break;
                case 6:
                    System.out.println("Nhập tên bạn muốn tìm kiếm");
                    String searchNameProduct = scanner.nextLine();
                    boolean foundProduct = false;
                    for (Product p : arrProduct) {
                        if (p != null && p.getProductName().toLowerCase().contains(searchNameProduct.toLowerCase())) {
                            p.displayData();
                            foundProduct = true;
                        }
                    }
                    if (!foundProduct) {
                        System.out.println("Không tìm thấy sản phẩm với tên \"" + searchNameProduct + "\"");
                    }
                    break;
                case 7:
                    System.out.println("Nhập khoảng giá bạn muốn tìm kiếm (a – b)");
                    System.out.print("Nhập giá thấp nhất (a): ");
                    float priceLow = Float.parseFloat(scanner.nextLine());
                    System.out.print("Nhập giá cao nhất (b): ");
                    float priceHigh = Float.parseFloat(scanner.nextLine());
                    boolean foundProduct1 = false;
                    for (Product p : arrProduct) {
                        if (p != null && p.getPrice() >= priceLow && p.getPrice() <= priceHigh) {
                            p.displayData();
                            foundProduct1 = true;
                        }
                    }
                    if (!foundProduct1) {
                        System.out.println("Không tìm thấy sản phẩm nào trong khoảng giá từ " + priceLow + " đến " + priceHigh);
                    }
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Hãy nhập lại.");
            }
        } while (choice != 8);
    }


}




