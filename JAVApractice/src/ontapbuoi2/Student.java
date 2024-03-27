package ontapbuoi2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    /*
    * 1. Đặc điểm:
    * mã sv
    * tên sv
    * ngày sinh
    * địa chỉ
    * giới tính
    * số điện thoại
    * email
    * trạng thái
    * 2. Có 3 hàm tạo
    * ko tham số
    * 2 tham số khởi tạo mã và tên sv
    * khởi tạo tất cả thông tin
    * 3. Có các phương thức getter/setter
    * 4. Có các phương thức:
    * xin chào
    * chào giảng viên
    * tính tổng 2 số
    * cho phép nhập thông tin
    * cho phép hiển thị thông tin đối tượng
    * */
    //1. khai báo các đặc điểm
    //syntax: Access Modifier + datatype + FieldName
    private String studentId;
    private String studentName;
    private Date bỉrthDate;
    private String address;
    private boolean sex;
    private String phone;
    private String email;
    private byte status;
    //2. khai báo các hàm tạo
    //Syntax: Access Modifier + ClassName(params)
    //2.1 Default constructor
    public Student() {
    }
    //2.2 khởi tạo mã sv và tên sv

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    //2.3 khởi tạo thông tin sv

    public Student(String studentId, String studentName, Date bỉrthDate, String address, boolean sex, String phone, String email, byte status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.bỉrthDate = bỉrthDate;
        this.address = address;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.status = status;
    }
    //3. Syntax: Access Modifier + returnData + methodName(param)

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getBỉrthDate() {
        return bỉrthDate;
    }

    public void setBỉrthDate(Date bỉrthDate) {
        this.bỉrthDate = bỉrthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
    //3.2 methods - hành vi đối tượng
    //no param
    public void hello(){
        System.out.println("Xin chào");
    }
    //1 param
    public void helloTeacher (String teacherName) {
        System.out.println("Xin chào" + teacherName);
    }
    //2 Params
    public int sumTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    // nhập thông tin sv
    public void inputData(Scanner scanner){
        System.out.println("nhập mã sinh viên: ");
        this.studentId = scanner.nextLine();
        System.out.println("nhập tên sinh viên: ");
        this.studentName = scanner.nextLine();
        System.out.println("nhập ngày sinh sinh viên: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.bỉrthDate = sdf.parse(scanner.nextLine());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("nhập vào địa chỉ sinh viên: ");
        this.address =scanner.nextLine();
        System.out.println("nhập vào giới tính sinh viên: ");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("nhập vào số điện thoại sinh viên: ");
        this.phone = scanner.nextLine();
        System.out.println("nhập vào email sinh viên: ");
        this.email = scanner.nextLine();
        System.out.println("nhập vào trạng thái sinh viên: ");
        this.status = Byte.parseByte(scanner.nextLine());
    }
    //Hiển thị thông tin sinh viên
    public void displayData() {
        System.out.printf("Student ID: %s - Student Name: %s - Ngày sinh: %s\n",
                this.studentId, this.studentName, this.bỉrthDate.toString());
        System.out.printf("Address: %s - Giới tính: %s\n",
                this.address, this.sex ? "Nam" : "Nữ");
        System.out.printf("Phone: %s - Email: %s - Status: %s\n",
                this.phone, this.email, this.status == 0 ? "Đang học" : (this.status == 1 ? "Bảo lưu": (this.status == 2 ? "Đình chỉ" : "Tốt nghiệp")));
    }
}
