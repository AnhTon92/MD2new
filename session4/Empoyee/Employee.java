package Empoyee;
import java.util.Scanner;
public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private float rate;
    private float salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, String gen, float rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = calSalary();
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        employeeId = sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        employeeName = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính: ");
        gen = sc.nextLine();
        System.out.print("Nhập hệ số lương: ");
        rate = Float.parseFloat(sc.nextLine());
    }

    public void displayData() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employeeName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gen);
        System.out.println("Hệ số lương: " + rate);
        System.out.println("Lương: " + salary);
    }

    private float calSalary() {
        return rate * 1300000;
    }
}

