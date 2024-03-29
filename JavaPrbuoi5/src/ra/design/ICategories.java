package ra.design;

import ra.entity.Categories;

public interface ICategories extends IGeneric<Categories, Integer>{
    void searchCategoriesByName();
}
