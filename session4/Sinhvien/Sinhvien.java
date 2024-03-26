package Sinhvien;

import java.util.Scanner;

//khai báo các trường cho lớp Sinhvien
public class Sinhvien {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private int phonenumber;
    // khai báo constructor Sinhvien không tham số
public Sinhvien () {

}
//khai báo constructor có tham số
    public Sinhvien (int id, String name, int age, String gender, String address, int phonenumber) {
    this. id =id;
    this. name = name;
    this. age = age;
    this.gender = gender;
    this. address = address;
    this. phonenumber = phonenumber;
    }
    public void inpputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào id của sinh viên: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào tên của sinh viên: ");
        this.name = sc.nextLine();
        System.out.println("nhập vào tuổi của sinh viên: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào giới tính của sinh viên: ");
        this.gender = sc.nextLine();
        System.out.println("nhập vào địa chỉ của sinh viên: ");
        this.address = sc.nextLine();
        System.out.println("nhập số điện thoai của sinh viên: ");
        this.phonenumber = Integer.parseInt(sc.nextLine());
    }
    public void displayData() {
        System.out.println("Sinhvien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
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

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
}
