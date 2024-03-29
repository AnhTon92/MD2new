package ra.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Categories {
private static final List<Integer> catalogIds = new ArrayList<>(); //tạo List
    private int catalogId;
    private String catalogName;
    private String descriptions;
    private Boolean catalogStatus;

    public Categories() {
        //mỗi khi một đối tượng Categories mới được tạo, constructor không tham số
        // sẽ kiểm tra danh sách catalogIds. Nếu danh sách rỗng, catalogId sẽ bắt đầu từ 1.
        // Nếu không, nó sẽ lấy catalogId lớn nhất từ danh sách và cộng thêm 1.
        // Sau đó, catalogId mới sẽ được thêm vào danh sách để theo dõi.

        if (catalogIds.isEmpty()){
            this.catalogId = 1;
        } else {
            this.catalogId = catalogIds.get(catalogIds.size()-1)+ 1;
        }
        catalogIds.add(this.catalogId);
    }


    public Categories(int catalogId, String catalogName, String descriptions, Boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
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
    public void inputData (List<Categories> categoriesList){
        Scanner scanner = new Scanner(System.in);
        this.catalogName = inputName(categoriesList);
        System.out.println("nhập mô tả danh mục");
        String desc = scanner.nextLine();
        setDescriptions(desc);
        System.out.println("nhập trạng thái danh mục(true: đang hoạt động/false: không hoạt động): ");
        boolean status = Boolean.parseBoolean(scanner.nextLine());
        setCatalogStatus(status);
    }

    private String inputName(List<Categories> categoriesList) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào tên danh mục: ");
            String categoryNameInput = scanner.nextLine();
            if (!categoryNameInput.isEmpty() && categoryNameInput.length() <= 50) {
                // kiểm tra trùng
                if (categoriesList.stream().noneMatch(t -> t.getCatalogName().equals(categoryNameInput))) {
                    //trùng
                    return categoryNameInput;
                }
                System.out.println("Tên danh mục đã tồn tại, vui lòng nhập lại ");
            } else {
                System.out.println("Không được để trống hoặc viết quá 50 kí tự ");
            }
        }
    }
    public void displayData() {
        System.out.printf("| ID : %-5s | Name : %-15s | TotalMembers : %-3s | Trạng thái: %-8s \n",
                catalogId, catalogName, descriptions, catalogStatus ? "Đang hoạt động" : "không hoạt động");
        System.out.println("------------------------------------------------------------------------");
    }
}


