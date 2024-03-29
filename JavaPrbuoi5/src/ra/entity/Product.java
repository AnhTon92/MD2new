package ra.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Product {
    private static final List<String> productIds = new ArrayList<>();// tạo list để check Id
    private static final List<String> productNames = new ArrayList<>(); // tạo list để check name
    private String productId;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private Categories catalogId;
    private ProductStatus productStatus;

    public Product() {
    }

    public Product(String productId, String productName, float price, String description, Date created, Categories catalogId, ProductStatus productStatus) {
        if (!productIds.contains(productId)) {
            this.productId = productId;
            productIds.add(productId);
        } else {
            throw new IllegalArgumentException("Mã sản phẩm đã tồn tại.");
        }
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

    public void setCatalogId(Categories catalogId) {
        this.catalogId = catalogId;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData(List<Categories> categoriesList, List<Product> productList) {
        Scanner scanner = new Scanner(System.in);
        this.productId = inputProductId();
        this.productName = inputProductName();
        this.price = inputPrice(scanner);
        this.description = inputDescription(scanner);
        this.created = inputCreated(scanner);
        this.catalogId = inputCatalogId(categoriesList);
        this.productStatus = inputProductStatus(scanner);
    }

    private ProductStatus inputProductStatus(Scanner scanner) {
        System.out.print("Nhập trạng thái sản phẩm (ACTIVE/BLOCK/INACTIVE): ");
        String statusInput = scanner.nextLine().toUpperCase();
        while (!statusInput.equals("ACTIVE") && !statusInput.equals("BLOCK") && !statusInput.equals("INACTIVE")) {
            System.out.println("Trạng thái không hợp lệ. Vui lòng nhập lại (ACTIVE/BLOCK/INACTIVE):");
            statusInput = scanner.nextLine().toUpperCase();
        }
        this.productStatus = ProductStatus.valueOf(statusInput);


        return null;
    }

    private Categories inputCatalogId(List<Categories> categoriesList) {
        Scanner scanner = new Scanner(System.in);
        // hiển thị danh mục
        System.out.println("List danh mục để chọn:");
        for (int i = 0; i < categoriesList.size(); i++) {
            System.out.printf("|Stt: %d | Tên danh mục: %-15s |\n", i+ 1, categoriesList.get(i).getCatalogName());
        }
        System.out.print("Chọn số thứ tự của danh mục: ");
        int catalogChoice = scanner.nextInt();
        while (catalogChoice < 1 || catalogChoice > categoriesList.size()) {
            System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn số thứ tự trong danh sách.");
            catalogChoice = scanner.nextInt();
        }
        int selectedCatalogId = categoriesList.get(catalogChoice - 1).getCatalogId();


        return null;
    }

    private Date inputCreated(Scanner scanner) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhập vào ngày nhập sản phẩm:");
        do {
            String created = scanner.nextLine();
            try {
                Date returnCreated = sdf.parse(created);
                return returnCreated;
            } catch (ParseException e) {
                System.err.println("Định dạng ngày nhập không đúng, vui lòng nhập lại");
            } catch (Exception ex) {
                System.err.println("Có lỗi trong quá trình xử lý, vui lòng nhập lại");
            }

        } while (true);
    }

    private String inputDescription(Scanner scanner) {
        System.out.println("Nhập vào mô tả sản phẩm:");
        return scanner.nextLine();
    }

    private float inputPrice(Scanner scanner) {
        System.out.println("Nhập vào giá sản phẩm: ");
        do {
            float inputPrice = Float.parseFloat(scanner.nextLine());
            if (inputPrice >0) {
                return price;
            }else {
                System.out.println("giá sản phẩm phải lớn hơn 0, hãy nhập lại!");
            }
        } while (true);
    }

    private String inputProductName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm (10-50 ký tự) : ");
        String tempProductName = scanner.nextLine();
        while (productNames.contains(tempProductName) || tempProductName.length()<10 || tempProductName.length() >50) {
            System.out.println("Tên sản phẩm không hợp lệ (không nằm trong khoảng 10-50 kí tự) hoặc đã tồn tại. Vui lòng nhập lại: ");
            tempProductName = scanner.nextLine();
        }this.productName =tempProductName;
        productNames.add(this.productName);

        return tempProductName;
    }

    private String inputProductId() {
//        khi nhập productid, chương trình sẽ kiểm tra xem mã 
//        đã tồn tại trong List hay chưa
//        và có đúng định dạng 4 ký tự, bắt đầu bằng một trong ba ký tự ‘C’, ‘S’, hoặc ‘A’. Nếu productid không hợp lệ hoặc đã tồn tại, người dùng sẽ được yêu cầu nhập lại.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm (4 ký tự, bắt đầu bằng C, S hoặc A): ");
        String tempProductId = scanner.nextLine();
        while (productIds.contains(tempProductId) || tempProductId.length() != 4 || !(tempProductId.startsWith("C") || tempProductId.startsWith("S") || tempProductId.startsWith("A"))) {
            System.out.println("Mã sản phẩm không hợp lệ hoặc đã tồn tại. Vui lòng nhập lại:");
            tempProductId = scanner.nextLine();
        }
        this.productId = tempProductId;
        productIds.add(this.productId);

        return tempProductId;
    }
    public void displayData() {
        System.out.println("Mã sản phẩm: " + this.productId);
        System.out.println("Tên sản phẩm: " + this.productName);
        System.out.println("Giá sản phẩm: " + this.price);
        System.out.println("Mô tả sản phẩm: " + this.description);
        System.out.println("Ngày nhập sản phẩm: " + new SimpleDateFormat("dd/MM/yyyy").format(this.created));
        System.out.println("Mã danh mục: " + this.catalogId);
        System.out.println("Trạng thái sản phẩm: " + this.productStatus);
    }
}

