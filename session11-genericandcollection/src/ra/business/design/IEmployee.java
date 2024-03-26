package ra.business.design;

import ra.business.entity.Employee;

public interface IEmployee extends iGenericDesign<Employee,Integer> {
    int getNewId();
}
