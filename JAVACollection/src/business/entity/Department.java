package business.entity;


import java.util.List;
import java.util.Scanner;

public class Department {
    private static int idCounter = 1;
    private int id;
    private String name;
    private int numberEmployee;
    private Boolean status = true;

    public Department() {
        this.id = idCounter++;
    }

    public Department(int id, String name, int numberEmployee, Boolean status) {
        this.id = id;
        this.name = name;
        this.numberEmployee = numberEmployee;
        this.status = status;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Department.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(int numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void inputData(List<Department> departmentList) {
        this.name = getInputName(departmentList);
    }

    private String getInputName(List<Department> departmentList) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào tên phòng ban");
            String departmentNameInput = sc.nextLine();
            if (!departmentNameInput.isBlank()) {
                // kiểm tra trùng lặp
                if (departmentList.stream().noneMatch(t -> t.getName().equals(departmentNameInput))) {
                    // trùng lặp
                    return departmentNameInput;
                }
                System.err.println("Tên đã tồn tại, hãy nhập lại");
            } else {
                System.err.println("Không được để trống");
            }
        }
    }

    public void displayData() {
        System.out.printf("| ID : %-5s | Name : %-15s | TotalMembers : %-3s | Trạng thái: %-8s \n",
                id, name, numberEmployee, status ? "Đang hoạt động" : "không hoạt động");
        System.out.println("------------------------------------------------------------------------");
    }
}




