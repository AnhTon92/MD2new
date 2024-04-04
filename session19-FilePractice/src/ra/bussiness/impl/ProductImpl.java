package ra.bussiness.impl;

import ra.bussiness.design.IProduct;
import ra.bussiness.entity.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProductImpl implements IProduct {
    private List<Product> productList;
    private Scanner scanner;

    public ProductImpl(){
        this.productList = new ArrayList<>();
        this.scanner = new Scanner(System.in);

    }

    @Override
    public void inputData() {
    Product product = new Product();
    product.inputData();
    productList.add(product);
    }

    @Override
    public void displayData() {
productList.forEach(Product ::displayData);
    }

    @Override
    public void sortProductsByPrice() {
productList.sort(Comparator.comparingDouble(Product::getPrice));
    }

    @Override
    public void updateProduct(String productId) {
Product productToUpdate = findProductById(productId);
if (productToUpdate != null) {
    productToUpdate.inputData();
} else {
    System.out.println("Sản phẩm không tồn tại.");
}
    }

    public Product findProductById(String productId) {
        return productList.stream()
                .filter(p -> p.getId().equals(productId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void deleteProduct(String productId) {
    Product productToDelete = findProductById(productId);
    if (productToDelete != null) {
        productList.remove(productToDelete);
    } else {
        System.out.println("Sản phẩm không tồn tại");
    }
    }

    @Override
    public void searchProductByName(String productName) {
    List<Product> results = productList.stream()
            .filter(p -> p.getName().equalsIgnoreCase(productName))
            .collect(Collectors.toList());
        results.forEach(Product::displayData);
    }

    @Override
    public void searchProductByPriceRange(float lowerBound, float upperBound) {
        List<Product> results = productList.stream()
                .filter(p -> p.getPrice() >= lowerBound && p.getPrice() <= upperBound)
                .collect(Collectors.toList());
        results.forEach(Product::displayData);
    }
}
