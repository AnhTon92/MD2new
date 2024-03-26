package ra.stack.thuchanh.employeemanagement;

import Empoyee.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class EmployeeManagement {

    private ArrayList<Employee> employeeList;

    public EmployeeManagement() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    // 1. Sort by name (ascending/descending)
    public void sortByName(boolean ascending) {
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return ascending ? o1.getFullName().compareTo(o2.getFullName()) : o2.getFullName().compareTo(o1.getFullName());
            }
        });
    }

    // 2. Sort by age (ascending/descending)
    public void sortByAge(boolean ascending) {
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                long age1 = o1.getBirthday().getTime();
                long age2 = o2.getBirthday().getTime();
                return ascending ? Long.compare(age1, age2) : Long.compare(age2, age1);
            }
        });
    }

    // 3. Sort by salary (ascending/descending)
    public void sortBySalary(boolean ascending) {
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return ascending ? Double.compare(o1.getSalary(), o2.getSalary()) : Double.compare(o2.getSalary(), o1.getSalary());
            }
        });
    }

    // 4. Sort by id (ascending/descending)
    public void sortById(boolean ascending) {
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return ascending ? Integer.compare(o1.getId(), o2.getId()) : Integer.compare(o2.getId(), o1.getId());
            }
        });
    }

    // 5. Sort by name (ascending), then by id (ascending)
    public void sortByNameThenId() {
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int nameCompare = o1.getFullName().compareTo(o2.getFullName());
                return nameCompare == 0 ? Integer.compare(o1.getId(), o2.getId()) : nameCompare;
            }
        });
    }
}
