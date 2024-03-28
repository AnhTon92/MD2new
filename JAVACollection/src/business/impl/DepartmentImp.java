package business.impl;

import business.design.IDepartment;
import business.entity.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentImp implements IDepartment {
    static List<Department> departmentList = new ArrayList<>();

    @Override
    public void displayAll() {
        if (departmentList.isEmpty()) {
            System.err.println("Danh sách trống");
        } else {
            departmentList.forEach(Department::displayData);
        }

    }

    @Override
    public void addNew() {
        System.out.println("Nhập số lượng phòng muốn thêm: ");
        byte count = new Scanner(System.in).nextByte();
        for (int i = 1; i <= count; i++) {
            System.out.println("NHẬP THÔNG TIN CHO PHÒNG BAN THỨ " + i);
            Department department = new Department();
            department.inputData(departmentList);
            departmentList.add(department);
        }
        System.out.println("Đã thêm mới! ");

    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn ID phòng ban muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        Department update = findbyId(id);
        if (update == null) {
            System.err.println("không tìm thấy");
            return;
        }
        System.out.println("thông tin cũ là:");
        update.displayData();
        System.out.println("Hãy nhap thong tin mơi ");
        update.inputData(departmentList);
        System.out.println("Cập nhật thành công");

    }

    @Override
    public Department findbyId(Integer id) {
        for (Department d : departmentList) {
            if (d.getId() == (id))
                return d;
        }
        return null;
    }

    @Override
    public Department changeStatusById(Integer id) {
        for (int i = 0; i < departmentList.size(); i++) {
            if (departmentList.get(i).getId() == id) {
                departmentList.get(i).setStatus(!departmentList.get(i).getStatus());
                return departmentList.get(i);
            }
        }
        return null;
    }

    @Override
    public void searchDepartmentByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tên phòng ban muốn tìm: ");
        String findName = scanner.nextLine();
        for (int i = 0; i < departmentList.size(); i++) {
            if (departmentList.get(i).getName().toLowerCase().contains(findName.toLowerCase())) {
                departmentList.get(i).displayData();
            }

        }
    }
}
