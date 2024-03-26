package example;

public class Main {
    public static void main(String[] args) {
        String string = "Nguyễn Văn A"; // khởi tạo trực tiếp
        System.out.println(System.identityHashCode(string));
        String old = string;
        string += "class L001";
        System.out.println(old);
        // in địa chỉ tham chiếu của old
        System.out.println(System.identityHashCode(old));
        System.out.println(string);
        // in ra sau khi thay đổi
        System.out.println(System.identityHashCode(string));
        String stringCopy = "Nguyễn Văn A";
        System.out.println(System.identityHashCode(string));
    }
}