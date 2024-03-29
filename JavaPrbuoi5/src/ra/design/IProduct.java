package ra.design;

import ra.entity.Product;

public interface IProduct extends IGeneric<Product, Integer> {
    Product findbyId(String id);
    void searchProductsByPriceRange();

    void deletebyId(String id);

    Product changeStatusById(int id);

    void getListProductByCategory();
    void sortProductByPrice();
}
