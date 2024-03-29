package ra.impl;

import ra.design.IProduct;
import ra.entity.Categories;
import ra.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProductImp implements IProduct {
    static List<Categories> categoriesList = new ArrayList<>();
    static List<Product> productList = new ArrayList<>();
    @Override
    public void displayAll() {
        if (productList.isEmpty()) {
            System.err.println("danh sách trống");
        } else {
            productList.forEach(Product :: displayData);
        }

    }

    @Override
    public void addNew() {
        Scanner scanner = new Scanner(System.in);
    if (categoriesList.isEmpty()){
        System.err.println("chưa có danh mục nào, mời thêm danh mục");
        return;
    }
        System.out.println("nhập số lượng sản phẩm muốn thêm: ");
    byte count = Byte.parseByte(scanner.nextLine());
        for (int i = 1; i < count ; i++) {
            System.out.println("nhập thông tin của sản phẩm thứ " +i+":");
            Product product = new Product();
            product.inputData(categoriesList, productList);
            productList.add(product);
        }
        System.out.println("Đã thêm sản phẩm");
    }

    @Override
    public void update() {
        System.out.println("Hãy chọn sản phẩm muốn update");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        Product edit = findbyId(id);
        if (edit == null) {
            System.err.println("id không tim thấy");
            return;
        } else {
            System.out.println("Thông tin cũ là: ");
            edit.displayData();
        }
        System.out.println("Nhập thông tin mới");
        edit.inputData(categoriesList, productList);
        System.out.println("cập nhật thành công");

    }

    @Override
    public Product findbyId(String id) {
        for (Product p : productList) {
            if (p.getProductId().equals(id))
                return p;
        }
        return null;
    }

    @Override
    public Product changeStatusById(Integer id) {
        return null;
    }

    @Override
    public void getListProductByCategory() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Danh sách danh mục: ");
        categoriesList.forEach(categories -> System.out.printf("| CatalogID: %5s | CategoryName: %-10s |\n", categories.getCatalogId(), categories.getCatalogName()));
        System.out.println("Hãy chọn danh mục muốn xem: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (categoriesList.stream().noneMatch(t ->t.getCatalogId() == id)) {
            System.err.println("id không tồn tại");
            return;
        }
        List<Product> filterList = productList.stream().filter(e -> e.getCatalogId() == id)
                .collect(Collectors.toList());
        if (filterList.isEmpty()) {
            System.out.println("không có sản phẩm nào trong danh mục này");
        } else {
            filterList.forEach(product -> {
                product.displayData();
            });
        }

    }

    @Override
    public void sortProductByPrice() {

    }
}
