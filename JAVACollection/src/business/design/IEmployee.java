package business.design;

import business.entity.Employee;

public interface IEmployee extends IGeneric<Employee, Integer> {
    void getListEmployeeByDepartment();
    void sortEmployeeNameAscending();
}
