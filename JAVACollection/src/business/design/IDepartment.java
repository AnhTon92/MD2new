package business.design;

import business.entity.Department;

public interface IDepartment extends IGeneric<Department, Integer> {
    void searchDepartmentByName();
}
