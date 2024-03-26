package ontapbuoi1;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        // nhập vào số dòng và cột của mảng 2 chiều (row* col), khai báo và nhập
// giá trị các phần tử của các phần tử mảng số nguyên 2 chiều. In giá trị các phần tử mảng theo ma trận
Scanner scanner = new Scanner(System.in);
    System.out.println("nhập vào số hàng: ");
    int rows = Integer.parseInt(scanner.nextLine());
    System.out.println("nhập vào số cột: ");
    int cols = Integer.parseInt(scanner.nextLine());
    // khai báo mảng 2 chiều
    int [][] matrix = new int[rows][cols];
    // nhập giá trị cho các phần tử của mảng
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.println("nhập giá trị cho phần tử ["+i+"]"+j+"]: ");
            matrix[i][j] = Integer.parseInt(scanner.nextLine());
        }
    }
    // In giá trị các phần tử mảng theo ma trận
    System.out.println("ma trận vừa nhập:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[i][j]+" ");

        }
        //xuống dòng khi hết hàng
        System.out.println();
    }
    }
}
