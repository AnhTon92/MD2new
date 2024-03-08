import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        final int rate = 24000;
        Scanner note = new Scanner(System.in);
        System.out.println("mời nhập số tiền usd cần đổi");
        int usd = Integer.parseInt(note.nextLine());
        int vnd = usd * rate;
        System.out.println("số tiền vnd đổi được là là "+vnd);

    }
}
