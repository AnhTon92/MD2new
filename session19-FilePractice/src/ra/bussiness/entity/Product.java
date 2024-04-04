package ra.bussiness.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Product {
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private int catalogId;
    private int productStatus;
    private static Set<String> existingProductIds = new HashSet<>();
    private static Set<String> existingProductNames = new HashSet<>();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Product() {
    }

    public Product(String productId, String productName, float price, String description, Date created, int catalogId, int productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.created = created;
        this.catalogId = catalogId;
        this.productStatus = productStatus;
    }

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

    // Validate product ID
    private void validateProductId(String id) throws IllegalArgumentException {
        if (!id.matches("[CSA]\\d{3}")) {
            throw new IllegalArgumentException("Mã sản phẩm không hợp lệ.");
        }
        if (existingProductIds.contains(id)) {
            throw new IllegalArgumentException("Mã sản phẩm đã tồn tại.");
        }
        this.productId = id;
        existingProductIds.add(id);
    }

    // Validate product name
    private void validateProductName(String name) throws IllegalArgumentException {
        if (name.length() < 10 || name.length() > 50) {
            throw new IllegalArgumentException("Tên sản phẩm phải từ 10 đến 50 kí tự.");
        }
        if (existingProductNames.contains(name)) {
            throw new IllegalArgumentException("Tên sản phẩm đã tồn tại.");
        }
        this.productName = name;
        existingProductNames.add(name);
    }

    // Input data method
    public void inputData(Map<Integer, String> categoriesMap) {
        Scanner scanner = new Scanner(System.in);
        // Product ID input
        while (true) {
            try {
                System.out.println("Nhập mã sản phẩm (4 kí tự, bắt đầu bằng C, S hoặc A): ");
                String id = scanner.nextLine();
                validateProductId(id);
                break; // Exit loop if no exception
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage() + " Vui lòng nhập lại.");
            }
        }

        // Product name input
        while (true) {
            try {
                System.out.println("Nhập tên sản phẩm (10-50 kí tự): ");
                String name = scanner.nextLine();
                validateProductName(name);
                break; // Exit loop if no exception
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage() + " Vui lòng nhập lại.");
            }
        }

        // Price input
        while (true) {
            try {
                System.out.println("Nhập giá sản phẩm (lớn hơn 0): ");
                float priceInput = Float.parseFloat(scanner.nextLine());
                if (priceInput <= 0) {
                    throw new IllegalArgumentException("Giá sản phẩm phải lớn hơn 0.");
                }
                setPrice(priceInput);
                break; // Exit loop if no exception
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Giá sản phẩm phải là một số. Vui lòng nhập lại.");
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi: " + e.getMessage() + " Vui lòng nhập lại.");
            }
        }

        // Description input
        System.out.println("Nhập mô tả sản phẩm: ");
        setDescription(scanner.nextLine());

        // Created date input
        while (true) {
            try {
                System.out.println("Nhập ngày tạo sản phẩm (dd/MM/yyyy): ");
                setCreated(dateFormat.parse(scanner.nextLine()));
                break; // Exit loop if no exception
            } catch (ParseException e) {
                System.out.println("Lỗi: Ngày không hợp lệ, vui lòng nhập lại theo định dạng dd/MM/yyyy.");
            }
        }

        // Catalog ID input
        System.out.println("Chọn danh mục sản phẩm: ");
        categoriesMap.forEach((key, value) -> System.out.println(key + ": " + value));
        setCatalogId(scanner.nextInt());

        // Product status input
        while (true) {
            System.out.println("Nhập trạng thái sản phẩm (0: Đang bán, 1: Hết hàng, 2: Không bán): ");
            int status = Integer.parseInt(scanner.nextLine());
            if (status >= 0 && status <= 2) {
                setProductStatus(status);
                break; // Exit loop if valid status
            } else {
                System.out.println("Lỗi: Trạng thái sản phẩm không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    // phương thức hiển thị thông tin sản phẩm
    public void displayData() {
        System.out.println("Mã sản phẩm: " + productId);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá sản phẩm: " + price);
        System.out.println("Mô tả sản phẩm: " + description);
        System.out.println("Ngày nhập sản phẩm: " + dateFormat.format(created));
        System.out.println("Mã danh mục: " + catalogId);
        System.out.println("Trạng thái sản phẩm: " + getProductStatus());
    }

}
