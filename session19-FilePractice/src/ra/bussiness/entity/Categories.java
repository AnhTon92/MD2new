package ra.bussiness.entity;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Categories {
    private static Set<String> existingCatalogNames = new HashSet<>();
    private static int autoIncrementId = 0;
private int catalogId;
private String catalogName;
private String descriptions;
private Boolean catalogStatus;

    public Categories() {
        this.catalogId = ++autoIncrementId;
    }

    public Categories(String catalogName, String descriptions, Boolean catalogStatus) {
        this.catalogId = ++autoIncrementId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public static int getAutoIncrementId() {
        return autoIncrementId;
    }

    public static void setAutoIncrementId(int autoIncrementId) {
        Categories.autoIncrementId = autoIncrementId;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        if (catalogName == null || catalogName.trim().isEmpty()){
            throw new IllegalArgumentException("Tên danh mục không được bỏ trống.");
        }
        if (catalogName.length() > 50) {
            throw new IllegalArgumentException("Tên danh mục không được vượt quá 50 kí tự.");
        }
        if (isNameDuplicate(catalogName)) {
            throw new IllegalArgumentException("Tên danh mục đã tồn tại");
        }
        this.catalogName = catalogName;
        existingCatalogNames.add(catalogName); // lưu tên danh mục vào danh sách đã có
    }

    private boolean isNameDuplicate(String catalogName) {
        return existingCatalogNames.contains(catalogName);
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
    // Phương thức nhập dữ liệu với xử lý ngoại lệ
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập tên danh mục: ");
            String name = scanner.nextLine();
            setCatalogName(name);

            System.out.print("Nhập mô tả danh mục: ");
            String desc = scanner.nextLine();
            setDescriptions(desc);

            System.out.print("Nhập trạng thái danh mục (true hoạt động, false không hoạt động): ");
            boolean status = scanner.nextBoolean();
            setCatalogStatus(status);
        } catch (InputMismatchException e) {
            System.out.println("Đã nhập sai kiểu dữ liệu. Vui lòng nhập lại.");
            scanner.nextLine(); // Xóa bộ đệm scanner
        } catch (Exception e) {
            System.out.println("Đã xảy ra lỗi không mong đợi: " + e.getMessage());
        }
    }
    public void displayData() {
        System.out.println("Mã danh mục: " + getCatalogId());
        System.out.println("Tên danh mục: " + getCatalogName());
        System.out.println("Mô tả danh mục: " + getDescriptions());
        System.out.println("Trạng thái danh mục: " + (getCatalogStatus() ? "Hoạt động" : "Không hoạt động"));
    }
}
