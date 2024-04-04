package ra.bussinessImp;

import ra.bussiness.IProduct;

import java.util.Scanner;

public class Product implements IProduct {
    // các thuộc tính
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean productStatus;
// constructor không tham số
    public Product() {
    }
// constructor đủ tham số
    public Product(int productId, String productName, String title, String descriptions,
                   float importPrice, float exportPrice, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = exportPrice - importPrice;
        this.productStatus = productStatus;
    }
// các getter setter
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }
// phương thức nhập dữ liệu
    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        this.productId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product name: ");
        this.productName = scanner.nextLine();
        System.out.print("Enter title: ");
        this.title = scanner.nextLine();
        System.out.print("Enter descriptions: ");
        this.descriptions = scanner.nextLine();
        System.out.print("Enter import price: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter export price: ");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        // Calculate interest
        this.interest = this.exportPrice - this.importPrice;
        System.out.print("Enter product status (true/false): ");
        this.productStatus = Boolean.parseBoolean(scanner.nextLine());

    }
// phương thức hiển thị dữ liệu
    @Override
    public void displayData() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Title: " + title);
        System.out.println("Descriptions: " + descriptions);
        System.out.println("Import Price: " + importPrice);
        System.out.println("Export Price: " + exportPrice);
        System.out.println("Interest: " + interest);
        System.out.println("Product Status: " + (productStatus ? "Active" : "Inactive"));
    }
}

