package ontapbuoi2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //Syntax: ClassName objectName = new Constructor(agruments)
        //Agruments: tham chiếu và tham trị
        //1. khởi tạo đối tượng sinh viên 1 mà không khởi tạo thông tin nào
        Student student1 = new Student();
        //2. khởi tạo đối tượng sinh viên và khởi tạo mã sinh viên và tên sinh viên
        Student student2 = new Student("SV002", "Nguyễn Văn B" );
        //3. khởi tạo đối tượng sinh viên và khởi tạo tất cả thông tin sinh viên
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate;
        try {
            birthDate = sdf.parse("09/09/2000");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        Student student3 = new Student("SV003", "Nguyễn Văn C", birthDate, "Hà Nội", true, "098745454", "scac@gmail.com", (byte) 0);
        //4. nhập tất cả thông tin sinh viên 1
        Scanner scanner = new Scanner(System.in);
        student1.inputData(scanner);
        // 5. nhập email và phone của sinh viên 2
        System.out.println("nhập vào email sinh viên 2: ");
        student2.setEmail(scanner.nextLine());
        System.out.println("nhập vào số điện thoại của sinh viên 3: ");
        student2.setPhone(scanner.nextLine());
        //6. In ra id và tên của sinh viên 3
        System.out.println("In ra id và tên của sinh viên 3"+ student3.getStudentId() + "-" + student3.getStudentName());

        //n. In thông tin
        System.out.println("In ra thông tin sinh viên 1: ");
        student1.displayData();
        System.out.println("In ra thông tin sinh viên 2: ");
        student2.displayData();
        System.out.println("In ra thông tin sinh viên 3: ");
        student3.displayData();
    }
}
