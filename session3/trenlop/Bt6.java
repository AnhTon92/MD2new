import java.util.Scanner;

public class Bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng của mảng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số cột của mảng: ");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("nhập vào giá trị của phần tử arr[%d][%d] là: ",i,j);
                arr[i][j] =  Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("nhập cột muốn tính: ");
        int choice = Integer.parseInt(scanner.nextLine());
        int sumCol = 0;
        for (int i = 0; i < row; i++) {
            sumCol += arr[i][choice - 1];
        }
        System.out.printf("tổng các phần tử trong cột %d là %d",choice,sumCol );
    }

}
