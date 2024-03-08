import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        // khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        //khai báo biến String lưu tên người nhập từ bàn phím
        String fullName;
        int age;
        String address;
        boolean sex;
        System.out.println("mời bạn nhập họ và tên");
        fullName = scanner.nextLine();
        System.out.println("mời bạn nhập vào tuổi");
//        age = scanner.nextInt();

        System.out.println("mời bạn nhập vào địa chỉ");
        address = scanner.nextLine();
        System.out.println("mời bạn nhập vào giới tính (true(Nam)/false(Nữ))");
        sex = scanner.hasNextBoolean();
        System.out.println("====Thông tin của bạn====");
        System.out.println("Họ và tên: "+fullName);
        System.out.println("Năm sinh: "+(2024));
        System.out.println("Giới tính: "+(sex ? "Nam" : "Nữ"));
    }
}
