import java.util.Scanner;

public class btsw {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn nhập vào ký tự kiểm tra: ");
            String kyTu = scanner.nextLine();
            if (kyTu.length() != 1) {
                System.out.println("chỉ nhập 1 ký tự");
            } else {
                switch (kyTu) {
                    case "u":

                    case "e":

                    case "o":

                    case "a":

                    case "i":

                        System.out.println("là nguyên âm");
                        break;
                    default:
                        System.out.println("Là phụ âm");

                }
            }
        }
    }
}
