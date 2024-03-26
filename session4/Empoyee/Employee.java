package Empoyee;
import java.util.Date;
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

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
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



    public Date getBirthday() {
    }

    public int getId() {
    }

    public Comparable<Object> getFullName() {
    }
}

