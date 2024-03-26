package ra.business.implement;

import ra.business.design.CRUD;
import ra.business.entity.Student;

import java.util.Scanner;

public class StudentImplement implements CRUD {
    private static Student[] students = new Student[100];
    private int size = 0;

    @Override
    public void create() {
        if (size == 100) {
            System.err.println("mảng đầy");
        } else {
            // logic thêm mới
            // ta 1 đối tượng student
            Student newStudent = new Student();
            newStudent.inputData();
            // thêm vào mang
            students[size] = newStudent;
            size++; // tăng số lương
        }
    }

    @Override
    public void display() {
        if (size == 0) {
            System.err.println("mảng ko co ptu");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(students[i]);
            }
        }
    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ID muốn sửa");
        int IDchange = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            if (IDchange == students[i].getStudentId()) {
                students[i].inputData();
            }
        }
    }

    @Override
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ID muốn xoa");
        int IdDel = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            if (IdDel == students[i].getStudentId()) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[size - 1] = null;
                size--;
                break;
            }
        }
    }
}
