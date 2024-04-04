package ra.bussiness.design;

public interface IProduct {
    void inputData();
    void displayData();
    void sortProductsByPrice();
    void updateProduct(String productId);
    void deleteProduct(String productId);
    void searchProductByName(String productName);
    void searchProductByPriceRange(float lowerBound, float upperBound);
}
