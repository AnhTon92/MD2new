package ra.impl;

import ra.design.ICategories;
import ra.entity.Categories;
import ra.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryImp implements ICategories {
    static List<Product> productList = new ArrayList<>();
    static List<Categories> categoriesList = new ArrayList<>();

    @Override
    public void searchCategoriesByName() {

    }

    @Override
    public void displayAll() {
        if (categoriesList.isEmpty()) {
            System.err.println("Chưa có danh mục nào hãy nhập thêm");
        } else {
            categoriesList.forEach(Categories::displayData);
        }

    }

    @Override
    public void addNew() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng danh mục muốn thêm: ");
        byte n = Byte.parseByte(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            System.out.println("NHẬP THÔNG TIN CHO DANH MỤC THỨ " + i);
            Categories categories = new Categories();
            categories.inputData(categoriesList);
            categoriesList.add(categories);
        }
        System.out.println("Đã thêm mới!");
    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn ID danh mục muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        Categories update = findbyId(id);
        if (update == null) {
            System.err.println("không tìm thấy danh mục");
            return;
        }
        System.out.println("Thông tin danh mục cũ là: ");
        update.displayData();
        System.out.println("Nhập thông tin mới: ");
        update.inputData(categoriesList);
        System.out.println("Cập nhật danh mục thành công!");
    }

    @Override
    public Categories findbyId(Integer id) {
        Scanner scanner = new Scanner(System.in);
        for (Categories c : categoriesList) {
            if (c.getCatalogId() == (id))
                return c;
        }

        return null;
    }

    @Override
    public Categories changeStatusById(Integer id) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < categoriesList.size(); i++) {
            if (categoriesList.get(i).getCatalogId() == id) {
                categoriesList.get(i).setCatalogStatus(!categoriesList.get(i).getCatalogStatus());
                return categoriesList.get(i);
            }

        }
        return null;
    }

    public void deleteCategoryById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã danh mục cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        Categories categoryToDelete = findbyId(id);

        if (categoryToDelete == null) {
            System.err.println("Mã danh mục không tồn tại.");
            return;
        }

        if (hasProducts(categoryToDelete)) {
            System.err.println("Danh mục chứa sản phẩm, không thể xóa.");
        } else {
            categoriesList.remove(categoryToDelete);
            System.out.println("Đã xóa danh mục thành công!");
        }

    }

    private boolean hasProducts(Categories categoryToDelete) {
        for (Product product : productList) {
            if (product.getCatalogId() categoryToDelete) {
                return true; // Danh mục có chứa ít nhất một sản phẩm
            }
        }
        return false; // Danh mục không chứa sản phẩm nào
    }
}


