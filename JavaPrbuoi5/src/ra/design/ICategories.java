package ra.design;

import ra.entity.Categories;

public interface ICategories extends IGeneric<Categories, Integer>{
    void searchCategoriesByName();
    void deleteCategoryById();
    Categories findbyId(Integer id);
}
