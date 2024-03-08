import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 11 ; i++) {

            for (int j = 1; j < 11 ; j++) {
                System.out.printf("%d x %d = %d \n",i,j, (i * j));
            }
        }
    }
}
