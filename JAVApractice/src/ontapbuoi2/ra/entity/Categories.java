package ontapbuoi2.ra.entity;

import java.util.Scanner;

public class Categories {
    //1. khai báo các thông tin danh mục
    private static int autoId = 0; // biến tự tăng cho catalogId
   private int catalogId;
   private String catalogName;
   private String descriptions;
   private Boolean catalogStatus = true;
   //2. Các constructor

    public Categories() {
        this.catalogId = ++autoId;//tự động tăng catalogId
    }


    public Categories(String catalogName, String descriptions, Boolean catalogStatus) {
        this.catalogId = ++autoId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }
    //3. getter setter

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
        this.catalogName = catalogName;
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
    //4. xây dựng phương thức
    //4.1 nhập thông tin
    public void inputData(Scanner scanner, Categories[] arrCategories, int indexCategories) {
        String catalogNameInput; // tạo biến để tạm thời lưu dòng nhập
       do {
           System.out.println("nhập vào tên danh mục: ");
         catalogNameInput = scanner.nextLine();}
       while(!validateCatalogName(catalogNameInput, arrCategories)); // dùng vòng lặp do while nhập tên danh mục xong thì chạy phương thức validate
        // đã tạo nếu khác thì gán biến tạm thời lưu dòng nhập thành input chính và kết thúc vòng lặp, nếu sai nhập lại
        this.catalogName = catalogNameInput;
        System.out.println("nhập mô tả danh mục");
        this.descriptions = scanner.nextLine();
    }
    //4.2 hiển thị thông tin
    public void displayData () {
        System.out.printf("[ID: %d | CatalogName: %s | Description: %s | CatalogStatus: %s]\n",this.catalogId, this.catalogName, this.descriptions, (this.catalogStatus ? "Hoạt động" : "không hoạt động"));

    }
    // phương thức validate cho catalogName
    public boolean validateCatalogName(String catalogName, Categories[] arrCategories) {
        if (catalogName.trim().length() > 50 || catalogName.trim().length() <= 0) {
            System.out.println("tên danh mục không được để trống hoặc lớn hơn 50 kí tự");
            return false;
        }
        for (Categories category : arrCategories) {
            if (category != null && category.getCatalogName().equalsIgnoreCase(catalogName)) {
                System.out.println("tên danh mục đã tồn tại, vui lòng nhập tên khác");
                return false;
            }
        }
        return true;
    }

}
