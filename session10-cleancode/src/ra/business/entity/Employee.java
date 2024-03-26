package ra.business.entity;

import ra.business.config.InputMethods;
import ra.business.design.Alert;

import java.util.Date;
import java.util.Scanner;

public class Employee {
    public static int autocount = 0;
    public int employeeId;
    private String employeeName;
    private Date dob;
    private String address;
    private int phoneNumber;
    private int salary;
    private double rate;

    public Employee() {
        //id tự tăng
        this.employeeId = ++autocount;
    }

    public Employee(int employeeId, String employeeName, String bod, String address, int phoneNumber, int salary, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.dob = dob;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.rate = rate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Alert.GET_ID);
        employeeId = Integer.parseInt(scanner.nextLine());
        System.out.println(Alert.GET_NAME);
        employeeName = scanner.nextLine();
        System.out.println(Alert.GET_DOB);
        dob = InputMethods.getDate();
        System.out.println(Alert.GET_ADDRESS);
        address = scanner.nextLine();
        System.out.println(Alert.GET_PHONE);
        phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(Alert.GET_SALARY);
        salary = Integer.parseInt(scanner.nextLine());
        System.out.println(Alert.GET_RATE);
        rate = Double.parseDouble(scanner.nextLine());
        System.out.println("--------------------------------");
    }

    public void displayData() {
        System.out.println(Alert.DISPLAY_ID + employeeId + Alert.DISPLAY_NAME + employeeName + Alert.DISPLAY_DOB + dob + Alert.DISPLAY_ADDRESS + address + Alert.DISPLAY_PHONE + phoneNumber + Alert.DISPLAY_SALARY + salary + Alert.DISPLAY_RATE + rate);
    }
}
