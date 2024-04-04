package ra.run;

import ra.bussinessImp.Product;

import java.util.*;

public class ProductManagement {
    private List<Product> productList = new ArrayList<>();// tạo list productlist để chạy các chức năng và lưu trữ

    public static void main(String[] args) {
        ProductManagement manager = new ProductManagement(); //tạo biến manager con từ thuộc kiểu dl ProductManagement
        Scanner scanner = new Scanner(System.in);
        int choice; // tạo biến chọn
        do {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************");
            System.out.println("1. Nhập số sản phẩm và nhập thông tin sản phẩm: ");
            System.out.println("2. Hiển thị thông tin các sản phẩm: ");
            System.out.println("3. Sắp xếp sản phẩm theo lợi nhuận tăng dần: ");
            System.out.println("4. Xóa sản phẩm theo mã sản phẩm: ");
            System.out.println("5. Tìm kiếm sản phẩm theo tên sản phẩm: ");
            System.out.println("6. Thay đổi trạng thái của sản phẩm theo mã sản phẩm: ");
            System.out.println("7. Thoát: ");
            System.out.print("Chọn một số từ 1 đến 7: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    manager.inputProducts(scanner);
                    break;
                case 2:
                    manager.displayProducts();
                    break;
                case 3:
                    manager.sortProductsByInterest();
                    break;
                case 4:
                    manager.deleteProductById(scanner);
                    break;
                case 5:
                    manager.searchProductByName(scanner);
                    break;
                case 6:
                    manager.toggleProductStatus(scanner);
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 7);
    }
// phương thức thay đổi trạng thái sp
    private void toggleProductStatus(Scanner scanner) {
        System.out.println("Nhập mã sản phẩm cần thay đổi trạng thái: ");
        int idToChange = Integer.parseInt(scanner.nextLine());// tạo biến cho người dùng nhập id sp cần thay đổi trạng thái
        productList.forEach(product -> { // dùng for-each duyệt productList nếu productId = id ng dùng nhập thì set lại
            //trạng thái của sp có id đó ngược lại với trạng thái vốn có của nó.
            if (product.getProductId() == idToChange) {
                product.setProductStatus(!product.isProductStatus());
            }
        });
    }

    // phương thức tìm kiếm sp theo tên
    private void searchProductByName(Scanner scanner) {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String nameToSearch = scanner.nextLine();// cho người dùng nhập tên sp muốn tìm
        productList.stream() //dùng filter trong stream của productList lọc ra những tên sp mà trùng với tên sp người
                //dùng nhập vào bất kể viết hoa hay thường (equalsIgnoreCase) sau đó duyệt for-each để hiển thị ra
                .filter(p -> p.getProductName().equalsIgnoreCase(nameToSearch))
                .forEach(Product::displayData);
    }

    //phương thức xóa sp
    private void deleteProductById(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        int idToDelete = Integer.parseInt(scanner.nextLine()); // tạo biến idToDelete để cho người dùng nhập vào id cần xóa
        productList.removeIf(p -> p.getProductId() == idToDelete);// nếu productId trùng với idToDelete thì xóa sp có id đó
    }

    // phương thức sắp xếp theo lợi nhuận sp
    private void sortProductsByInterest() {
        Collections.sort(productList);
    }

    // phương thức hiển thị sản phẩm
    private void displayProducts() {
        productList.forEach(Product :: displayData); //dùng for-each để duyệt
    }
// phương thức nhập sp
    private void inputProducts(Scanner scanner) {
        System.out.print("Nhập số sản phẩm cần nhập thông tin: ");
        int addNum = Integer.parseInt(scanner.nextLine()); // số sp cần thêm
        for (int i = 0; i < addNum; i++) { // tạo vòng for để duyệt đến n
            Product product = new Product(); // mỗi lần lặp tạo 1 sp mới kiểu dữ liệu Product
            product.inputData(); // nhập lại thông tin cho mỗi sp thêm vào
            productList.add(product); // thêm sản phẩm đã nhập vào productList
        }
    }

}
