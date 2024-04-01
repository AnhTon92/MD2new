package baitap.bai14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách học viên
        Student[] students = {
                new Student(1, "Alice", 8.5),
                new Student(2, "Bob", 7.2),
                new Student(3, "Charlie", 9.5),
                // Thêm các học viên khác vào đây
        };

        // Sắp xếp và in ra danh sách học viên theo điểm số giảm dần
        SortingStudent.insertionSort(students);
        System.out.println("Sau khi sắp xếp chèn: " + Arrays.toString(students));

        SortingStudent.selectionSort(students);
        System.out.println("Sau khi sắp xếp chọn: " + Arrays.toString(students));

        SortingStudent.bubbleSort(students);
        System.out.println("Sau khi sắp xếp nổi bọt: " + Arrays.toString(students));
    }
}
