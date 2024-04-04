package ra.bussiness.impl;

import ra.bussiness.design.ICategories;
import ra.bussiness.entity.Categories;
import ra.bussiness.entity.Product;

import java.util.*;

public class CategoriesImpl implements ICategories {
    private List<Categories> categoriesList;
    private Map <Integer, List<Product>> categoryProductsMap;
    private Scanner scanner;

    public CategoriesImpl() {
        this.categoriesList = new ArrayList<>();
        this.categoryProductsMap = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void inputData() {
        Categories category = new Categories();
        category.inputData();
        categoriesList.add(category);
    }

    @Override
    public void displayData() {
        for (Categories category : categoriesList) {
            category.displayData();
        }
    }

    @Override
    public void updateCategory(int catalogId) {
        Categories categoryToUpdate = findById(catalogId);
        if (categoryToUpdate != null) {
            System.out.println("Chọn thông tin bạn muốn cập nhật: ");
            System.out.println("1. Tên danh mục: ");
            System.out.println("2. Mô tả danh mục: ");
            System.out.println("Lựa chọn của bạn: ");
            int updateChoice = Integer.parseInt(scanner.nextLine());
            switch (updateChoice) {
                case 1:
                    System.out.println("nhập tên danh mục mới: ");
                    String newName = scanner.nextLine();
                    categoryToUpdate.setCatalogName(newName);
                    break;
                case 2:
                    System.out.println("Nhập mô tả mới cho danh mục: ");
                    String newDescription = scanner.nextLine();
                    categoryToUpdate.setDescriptions(newDescription);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;

            }
        }else {
            System.out.println("Danh mục không tồn tại.");
        }

    }

    private Categories findById(int catalogId) {
        for (Categories category : categoriesList){
            if (category.getCatalogId() == catalogId) {
                return category;
            }
        }
        return null;
    }

    @Override
    public void deleteCategory(int catalogId) {
Categories categoryToDelete = findById(catalogId);
if (categoryToDelete != null && !isCategoryLinkedToProduct(categoryToDelete)){
    categoriesList.remove(categoryToDelete);
    categoryProductsMap.remove(catalogId); // xóa mối quan hệ danh mục-sp
    System.out.println("Danh mục đã được xóa thành công");
} else {
    System.out.println("Không được xóa vì danh mục này đang chứa sản phẩm hoặc không tồn tại danh mục này.");
}
    }
    public boolean isCategoryLinkedToProduct(Categories category) {

        List<Product> productsInCategory = categoryProductsMap.get(category.getCatalogId());
        return productsInCategory != null && !productsInCategory.isEmpty();
    }

    @Override
    public void updateCategoryStatus(int catalogId) {
    Categories categoryToUpdateStatus = findById(catalogId);
    if (categoryToUpdateStatus != null) {
        categoryToUpdateStatus.setCatalogStatus(!categoryToUpdateStatus.getCatalogStatus());
    } else {
        System.out.println("Danh mục không tồn tại.");
    }
    }
}
