package baitap.baitonghopdemo.manage;

import baitap.baitonghop.entity.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeManagement {
    private List<Employee> employees;
    public EmployeeManagement(){
        this.employees = new ArrayList<>();
    }
    //hiển thị danh sách thông tin tất cả nhân viên
    public void displayAllEmployees(){
        employees.forEach(employee -> System.out.println(employee.getEmployeeId() + " - " + employee.getEmployeeName()));
    }
    //xem chi tiết theo mã
    public void displayEmployeeDetails(String employeeId) {
        employees.stream()
                .filter(employee -> employee.getEmployeeId().equals(employeeId))
                .findFirst()
                .ifPresent(employee -> {
                    System.out.println("Mã nhân viên: " + employee.getEmployeeId());
                    System.out.println("Tên nhân viên: " + employee.getEmployeeName());
                    System.out.println("Ngày sinh: " + employee.getBirthday());
                    System.out.println("Giới tính: " + (employee.isSex() ? "Nam" : "Nữ"));
                    System.out.println("Lương cơ bản: " + employee.getSalary());
                    System.out.println("Người quản lí: " + (employee.getManager() != null ? employee.getManager().getEmployeeName() : "Không có"));
                });
    }
    //thêm mới nhân viên
    public void addEmployee (Employee employee) {
        employees.add(employee);
    }
    //chỉnh sửa thông tin nhân viên
    public void editEmployee(Employee employee) {
        Employee existingEmployee = employees.stream()
                .filter(e -> e.getEmployeeId().equals(employee.getEmployeeId()))
                .findFirst()
                .orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setEmployeeName(employee.getEmployeeName());
            existingEmployee.setBirthday(employee.getBirthday());
            existingEmployee.setSex(employee.isSex());
            existingEmployee.setSalary(employee.getSalary());
            existingEmployee.setManager(employee.getManager());
        }
    }
    //xóa nhân viên
    public void deleteEmployee(String employeeId) {
        employees.removeIf(employee -> employee.getEmployeeId().equals(employeeId));
    }
    // thống kê số lượng nhân viên trung bình mỗi phòng
    public void averageNumberOfEmployeesByDepartment () {
        Map<String, Double> averageByDepartment = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getManager().getDepartment().getDepartmentName(),
                        Collectors.averagingInt(employee -> 1)));
        averageByDepartment.forEach((departmentName, average) -> System.out.println(departmentName + ": "+ average));
    }
    //tìm ra 5 phòng có số lượng nhân viên đông nhất
    public void top5DepartmentsByNumberOfEmployess () {
        Map<String, Long> departmentCount = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getManager().getDepartment().getDepartmentName(),
                        Collectors.counting()));
        List<String> top5Departments = departmentCount.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .map(Map.Entry::getKey)
                .toList();
        top5Departments.forEach(System.out::println);

    }
    //tìm ra người quản lý nhiều nhân viên nhất
    public void managerWithMostEmployees() {

        Map<Employee, Long> managerCount = employees.stream()
                .collect(Collectors.groupingBy(Employee :: getManager, Collectors.counting()));
        Employee manager = managerCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry :: getKey)
                .orElse(null);
        if (manager != null) {
            System.out.println(manager.getEmployeeName());
        }
    }
    // Tìm ra 5 nhân viên có tuổi cao nhất công ty
    public void top5OldestEmployees() {
        List<Employee> oldestEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getBirthday).reversed())
                .limit(5)
                .toList();

        oldestEmployees.forEach(employee -> System.out.println(employee.getEmployeeName() + " - " + employee.getBirthday()));
    }

    // Tìm ra 5 nhân viên hưởng lương cao nhất
    public void top5HighestPaidEmployees() {
        List<Employee> highestPaidEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(5)
                .toList();

        highestPaidEmployees.forEach(employee -> System.out.println(employee.getEmployeeName() + " - " + employee.getSalary()));
    }

}
