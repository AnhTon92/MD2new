package baitaptonghop.business.entity;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentId;
    private String departmentName;
    private List<Employee> employees;

    public Department(String departmentId, String departmentName) {
        if (!departmentId.startsWith("D") || departmentId.length() != 4) {
            throw new IllegalArgumentException("Invalid department ID");
        }
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Getters and setters
    // ...

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getTotalMembers() {
        return employees.size();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean removeEmployee(Employee employee) {
        return employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                '}';
    }
// Additional methods
    // ...
}
