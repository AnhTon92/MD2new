package bussiness.entity;

import java.io.Serializable;
import java.util.Scanner;

public class Catalog implements Serializable{
    private static final long serialVersionUID = 1L;
    private String catalogId; // Bắt đầu bằng kí tự C, 4 kí tự, ví dụ: C001
    private String catalogName; // Không trùng lặp, không để trống
    private String description;

    // Constructor không tham số
    public Catalog() {
    }

    // Constructor với tham số

    public Catalog(String catalogId, String catalogName, String description) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.description = description;
    }
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        // Nhập và kiểm tra mã danh mục
        do {
            System.out.print("Nhập mã danh mục (ví dụ: C001): ");
            this.catalogId = scanner.nextLine();
            if (!isValidCatalogId(this.catalogId)) {
                System.out.println("Mã danh mục không hợp lệ. Mã phải bắt đầu bằng kí tự 'C' và theo sau là 3 chữ số.");
            }
        } while (!isValidCatalogId(this.catalogId));

        // Nhập tên danh mục
        do {
            System.out.print("Nhập tên danh mục: ");
            this.catalogName = scanner.nextLine();
            if (this.catalogName == null || this.catalogName.trim().isEmpty()) {
                System.out.println("Tên danh mục không được để trống.");
            }
        } while (this.catalogName == null || this.catalogName.trim().isEmpty());

        // Nhập mô tả
        System.out.print("Nhập mô tả danh mục: ");
        this.description = scanner.nextLine();
    }

    // Phương thức hiển thị dữ liệu
    public void displayData() {
        System.out.println("Mã danh mục: " + this.catalogId);
        System.out.println("Tên danh mục: " + this.catalogName);
        System.out.println("Mô tả: " + this.description);
    }

    // Phương thức kiểm tra mã danh mục hợp lệ
    private boolean isValidCatalogId(String catalogId) {
        return catalogId != null && catalogId.matches("C\\d{3}");
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
