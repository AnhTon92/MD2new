package business.impl;

import business.design.IEmployee;
import business.entity.Department;
import business.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static business.impl.DepartmentImp.departmentList;

public class EmployeeImp implements IEmployee {
    static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void getListEmployeeByDepartment() {
        System.out.println("Danh sách phòng ban");
        departmentList.forEach(department -> System.out.printf("| ID : %-5s | DepartmentName : %-10s |\n", department.getId(), department.getName()));
        System.out.println("Hãy chọn departmentId muốn xem danh sách");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        if (departmentList.stream().noneMatch(t -> t.getId() == id)) {
            System.err.println("id không tồn tại");
            return;
        }
        // tìm thấy
        List<Employee> filterList = employeeList.stream().filter(e -> e.getDepartment().getId() == id).toList();
        if (filterList.isEmpty()) {
            System.err.println("Phòng ban này ko có nhân viên");
        } else {
            filterList.forEach(Employee::displayData);
        }

    }

    @Override
    public void sortEmployeeNameAscending() {
        List<Employee> sortList = employeeList.stream().sorted().toList();
        sortList.forEach(Employee::displayData);

    }

    @Override
    public void displayAll() {
        if (employeeList.isEmpty()) {
            System.err.println("Danh sach trống");
        } else {
            employeeList.forEach(Employee::displayData);
        }

    }

    @Override
    public void addNew() {
        if (departmentList.isEmpty()) {
            System.err.println("chưa có phòng ban nào, mời thêm phòng ban trước");
            return;
        }
        System.out.println("Nhập số lượng nhân viên muốn thêm: ");
        byte count = new Scanner(System.in).nextByte();
        for (int i = 1; i <= count; i++) {
            System.out.println("Nhập thông tin của nhân viên thứ:  " + i);
            Employee employee = new Employee();
            employee.inputData(departmentList, employeeList);
            employeeList.add(employee);
        }
        System.out.println("Đã thêm!");

    }

    @Override
    public void update() {
        System.out.println("Hãy chọn phòng ban  muốn update");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        Employee edit = findbyId(id);
        if (edit == null) {
            System.err.println("id không tim thấy");
            return;
        } else {
            System.out.println("Thông tin cũ là: ");
            edit.displayData();
        }
        Department old = edit.getDepartment();
        old.setNumberEmployee(old.getNumberEmployee() - 1);
        System.out.println("Nhập thông tin mới");
        edit.inputData(departmentList, employeeList);
        System.out.println("cập nhật thành công");


    }

    @Override
    public Employee findbyId(Integer id) {
        for (Employee d : employeeList) {
            if (d.getId() == (id))
                return d;
        }
        return null;

    }




    @Override
    public Employee changeStatusById(Integer id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                employeeList.get(i).setStatus(!employeeList.get(i).getStatus());
                return employeeList.get(i);
            }
        }
        return null;
    }
}
