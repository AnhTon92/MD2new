import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều dài");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập vào chiều rộng");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println("Chu vi của hình chữ nhật đó là " + (length+width)*2);
        System.out.println("Diện tích của hình chữ nhật đó là " +length*width);
    }
}
