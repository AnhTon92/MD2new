package ra.business.design;

import ra.business.entity.Employee;

public interface iGenericDesign<T,E> {
    T findById(E id);
    void addNewElement();
    void editElement();
    void deleteElement();
    void displayAll();
    Employee inputData(boolean isAdd);
}
