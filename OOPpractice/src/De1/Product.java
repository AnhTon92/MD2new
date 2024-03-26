package De1;
import java.util.Scanner;
public class Product {
    private String productid;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String descriptions;
    private boolean status;

    public Product() {
    }

    public Product(String productid, String productName, float importPrice, float exportPrice, int quantity,
                   String descriptions, boolean status) {
        this.productid = productid;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;
        calProfit();
    }

    // Getters and setters

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
        calProfit();
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
        calProfit();
    }

    public float getProfit() {
        return profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Phương thức nhập dữ liệu
    public void inputData(Scanner scanner, Product[] arrProduct) {
        // Nhập mã sản phẩm
        do {
            System.out.print("Nhập mã sản phẩm (PXXXX): ");
            productid = scanner.nextLine().trim();
        } while (!validateProductId(productid, arrProduct));

        // Nhập tên sản phẩm
        do {
            System.out.print("Nhập tên sản phẩm (5-50 ký tự): ");
            productName = scanner.nextLine().trim();
        } while (!validateProductName(productName));

        // Nhập giá nhập
        do {
            System.out.print("Nhập giá nhập ( > 0): ");
            importPrice = scanner.nextFloat();
        } while (importPrice <= 0);

        // Nhập giá xuất
        do {
            System.out.print("Nhập giá xuất ( > giá nhập + 20%): ");
            exportPrice = scanner.nextFloat();
        } while (exportPrice <= importPrice + (importPrice * 0.2));

        // Nhập số lượng
        do {
            System.out.print("Nhập số lượng ( > 0): ");
            quantity = scanner.nextInt();
        } while (quantity <= 0);

        // Nhập mô tả
        System.out.print("Nhập mô tả sản phẩm: ");
        descriptions = scanner.nextLine().trim();

        // Nhập trạng thái
        System.out.print("Nhập trạng thái sản phẩm (true/false): ");
        status = scanner.nextBoolean();

        scanner.nextLine(); // Bỏ qua dòng thừa
    }

    // Phương thức hiển thị dữ liệu
    public void displayData() {
        String statusStr = status ? "Đang bán" : "Không bán";
        System.out.printf("|%-10s|%-25s|%10.2f|%10.2f|%10.2f|%5d|%-20s|%s|\n", productid, productName, importPrice,
                exportPrice, profit, quantity, descriptions, statusStr);
    }

    // Phương thức tính lợi nhuận
    public void calProfit()  {
        profit = exportPrice - importPrice;
    }
    // Validate product ID
    private boolean validateProductId(String productId, Product[] arrProduct) {
        if (productId.length() != 4 || !productId.startsWith("P")) {
            System.out.println("Mã sản phẩm phải bắt đầu bằng P và có độ dài 4 ký tự!");
            return false;
        }

        // Kiểm tra trùng lặp
        if (arrProduct != null) {
            for (Product product : arrProduct) {
                if (product != null && product.getProductid().equals(productId)) {
                    System.out.println("Mã sản phẩm đã tồn tại!");
                    return false;
                }
            }
        }

        return true;
    }
    // Validate product name
    private boolean validateProductName(String name) {
        return name.length() >= 5 && name.length() <= 50;
    }
}


