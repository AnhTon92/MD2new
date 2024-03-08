package Student;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    public Student() {
    }

    public Student(int id, String name, int age, String gender, String address, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    public void inputData(Scanner scanner){

        System.out.println("Nhap id");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter student name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter student age: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter student gender: ");
        this.gender = scanner.nextLine();
        System.out.print("Enter student address: ");
        this.address = scanner.nextLine();
        System.out.print("Enter student phone: ");
        this.phone = scanner.nextLine();
    }
    public void displayData() {
        System.out.println("Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}');

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
