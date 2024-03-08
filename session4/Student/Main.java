package Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[30];
        int studentCount = 0 ;
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=======menu=========");
            System.out.println("1. XEM chi tiết");
            System.out.println("2. thêm sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    for (int i = 0; i < studentCount; i++) {
                        students[i].displayData();
                    }
                    break;
                case 2:
                    System.out.println("Nhập số lượng sinh viên cần nhập thông tin");
                    int number = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < number; i++) {
                        students[studentCount] = new Student();
                        students[studentCount].inputData(scanner);
                        studentCount++;
                    }

                    break;
                case 3:
                    System.out.println("Nhập id sửa");
                    int id =Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < studentCount; i++) {
                        if(students[i].getId()==id){
                            students[i].inputData(scanner);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập id xóa");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    int index = -1;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getId() == id1) {
                            index = i;
                            break;
                        }
                    }
                    if (index != -1) {
                        for (int i = index; i < studentCount - 1; i++) {
                            students[i] = students[i + 1];
                        }
                        studentCount--;
                        System.out.println("Đã xóa sinh viên có id = " + id1);
                    } else {
                        System.out.println("Không tìm thấy sinh viên có id = " + id1);
                    }
                    break;
                case 5:
                    System.exit(0);

            }
        }while (true);
    }
}
