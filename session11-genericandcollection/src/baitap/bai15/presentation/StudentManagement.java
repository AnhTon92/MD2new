package baitap.bai15.presentation;

import baitap.bai15.business.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    Scanner scanner = new Scanner(System.in);

    private List<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public void showAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        students.removeIf(student -> student.getStudentId() == studentId);
    }

    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
        return null;
    }

    public double getAverageScore() {
        System.out.println("nhập các điểm cho sinh viên");
        System.out.println("số lượng điểm cần nhập cho sinh viên:");
        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("nhập điểm thứ  " + (i+1));
            double t = Double.parseDouble(scanner.nextLine());

            sum +=t;
        }
        return sum / n;
    }

    public void sortByScore() {
        students.sort(Comparator.comparingDouble(Student::getAverageScore));
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();

        // Thêm một số sinh viên
        studentManagement.addStudent(new Student(1, "Nguyễn Văn A", 8.5));
        studentManagement.addStudent(new Student(2, "Trần Thị B", 9.0));
        studentManagement.addStudent(new Student(3, "Lê Văn C", 7.5));

        // Hiển thị danh sách sinh viên
        studentManagement.showAll();

        // Tìm kiếm sinh viên theo mã số
        Student student = studentManagement.findStudentById(2);
        System.out.println("Sinh viên có mã số 2: " + student);

        // Tính điểm trung bình
        double averageScore = studentManagement.getAverageScore();
        System.out.println("Điểm trung bình của tất cả sinh viên: " + averageScore);

        // Sắp xếp sinh viên theo điểm
        studentManagement.sortByScore();
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:");
        studentManagement.showAll();
    }
}

