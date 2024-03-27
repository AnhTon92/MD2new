package ontapbuoi2.ra.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Product {
//1. khai báo thuộc tính
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private int catalogId;
    private int productStatus;
    //1.1 SimpleDateFormat để parse ngày theo định dạng dd/MM/yyyy
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    //1.2 constructor không tham số

    public Product() {
    }
    //1.3 constructor đầy đủ tham số

    public Product(String productId, String productName, float price, String description, Date created, int catalogId, int productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.catalogId = catalogId;
        this.productStatus = productStatus;
    }
    //2. getter và setter

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }
    //3. phương thức nhập dữ liệu
    //3.1 validate các thuộc tính theo yêu cầu
    //validate productId
    private boolean validateProductId(String productId, Product[] arrProduct) {
        if (productId.length() != 4 || (!productId.startsWith("C") &&
                !productId.startsWith("S") &&
                !productId.startsWith("A"))) {
            System.out.println("Mã sản phẩm phải gồm 4 kí tự và bắt đầu bằng C, S hoặc A.");
            return false;
        }
        for (Product product : arrProduct) {
            if (product != null && product.getProductId().equals(productId)) {
                System.out.println("mã sản phẩm đã tồn tại. Vui lòng nhập mã khác.");
                return false;
            }
        }
        return true;
    }
    //validate productName
    private boolean validateProductName(String productName, Product[] arrProduct) {
        if (productName.trim().length() < 10 || productName.trim().length() > 50) {
            System.out.println("Tên sản phẩm phải có từ 10 đến 50 ký tự.");
            return false;
        }
        for (Product product : arrProduct) {
            if (product != null && product.getProductName().equalsIgnoreCase(productName)) {
                System.out.println("tên sản phẩm đã tồn tại. Vui lòng nhập lại");
                return false;
            }
        }
        return true;
    }
    //validate giá sp
    private boolean validatePrice(float price) {
        if (price <= 0) {
            System.out.println("giá sản phẩm phải lớn hơn 0.");
            return false;
        }
        return true;
    }
    //validate created
    private boolean validateCreatedDate(String created) {
        try {
            sdf.parse(created);
            return true;
        } catch (ParseException e) {
            System.out.println("Ngày nhập không hợp lệ");
            return false;
        }
    }
    //validate status
    private boolean validateProductStatus(int productStatus) {
        if (productStatus < 0 || productStatus > 2) {
            System.out.println("trạng thái sản phẩm không hợp lệ. Chỉ nhận giá trị 0,1 hoặc 2");
            return false;
        }
        return true;
    }
    //3.2 phương thức nhập dữ liệu
    public void inputData(Scanner scanner, Product[] arrProduct,int indexProduct, Categories[] arrCategories, int indexCategories) {
        //nhập dữ liệu Id sp
        String productIdInput;
        do {
            System.out.println("nhập mã sản phẩm đúng yêu cầu (4 kí tự, bắt đầu bằng C,S hoặc A: )");
            productIdInput = scanner.nextLine();
        } while (!validateProductId(productIdInput, arrProduct));
        this.productId = productIdInput;
        //nhập dữ liệu tên sp
        String productNameInput;
        do {
            System.out.println("nhập tên sản phẩm: ");
            productNameInput = scanner.nextLine();
        } while (!validateProductName(productNameInput, arrProduct));
        this.productName = productNameInput;
        //nhập giá sp
        float priceInput;
        do {
            System.out.println("nhập giá sản phẩm: ");
            priceInput = Float.parseFloat(scanner.nextLine());
        } while (!validatePrice(priceInput));
        this.price = priceInput;
        //nhập mô tả sp
        String descriptionInput;
        System.out.println("nhập mô tả sản phẩm: ");
        descriptionInput = scanner.nextLine();
        this.description = descriptionInput;
        // nhập ngày nhập sp
        String createdInput;
        do {
            System.out.println("nhập ngày nhập sản phẩm theo định dạng dd/MM/yyyy: ");
            createdInput =scanner.nextLine();
        } while (!validateCreatedDate(createdInput));
        try {
            this.created = sdf.parse(createdInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // chọn mã danh mục của sp
        System.out.println("chọn mã danh mục cho sản phẩm: ");
        for (int i = 0; i < indexCategories; i++) {
            System.out.println((i + 1) + "." + arrCategories[i].getCatalogName());
        }
        int catalogChoice;
        do {
            catalogChoice = Integer.parseInt(scanner.nextLine());
        } while (catalogChoice <= 0 || catalogChoice > indexCategories);
        this.catalogId =arrCategories[catalogChoice - 1].getCatalogId();
        //nhập trạng thái sản phẩm
        int productStatusInput;
        do {
            System.out.println("nhập trạng thái sản phẩm: (0. Đang bán, 1. Hết hàng, 2. Không bán): ");
            productStatusInput = Integer.parseInt(scanner.nextLine());
        } while (!validateProductStatus(productStatusInput));
        this.productStatus = productStatusInput;
    }//3.3 phương thức hiển thị dữ liệu
    public void displayData() {
        System.out.println("Mã sản phẩm: " + this.productId);
        System.out.println("Tên sản phẩm: "+ this.productName);
        System.out.println("Giá sản phẩm: " + this.price);
        System.out.println("Mô tả sản phẩm: "+ this.description);
        System.out.println("Ngày nhập sản phẩm: "+ this.created);
        System.out.println("Mã danh mục sản phẩm: "+ this.catalogId);
        System.out.println("Trạng thái sản phẩm: "+ this.productStatus);
    }
}
