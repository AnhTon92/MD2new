package ra.design;

import ra.entity.Product;

public interface IProduct extends IGeneric<Product, Integer> {
    void getListProductByCategory();
    void sortProductByPrice();
}
