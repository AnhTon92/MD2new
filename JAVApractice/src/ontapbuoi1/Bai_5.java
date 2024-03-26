package ontapbuoi1;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        // nhập số phần tử của mảng số thực 2 chiều (row*col), khai báo và nhập giá
// trị các phần tử của mảng 2 chiều đó, in ra các phần tử có giá trị chẵn và tính tổng các phần tử đó
   Scanner scanner = new Scanner(System.in);
    System.out.println("nhập vào số hàng: ");
    int rows = Integer.parseInt(scanner.nextLine());
    System.out.println("nhập vào số cột: ");
    int cols = Integer.parseInt(scanner.nextLine());
    // khai báo mảng 2 chiều số thực
    double [][] matrix = new double[rows][cols];
    // nhập giá trị cho các phần tử của mảng và tính tổng các ptu chẵn
    double sumChan = 0;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.println("nhập giá trị cho phần tử ["+i+"]"+j+"]: ");
            matrix[i][j] = Double.parseDouble(scanner.nextLine());
            // kiểm tra phần tử chẵn
            if (matrix[i][j] % 2 == 0){
                sumChan += matrix[i][j];
            }
        }
    }
    //in ra các phần tử chẵn và tổng
    System.out.println("các phần tử chẵn trong mảng là: ");
    for (double[] rowArr : matrix){
        for (double element : rowArr) {
            if (element % 2 == 0) {
                System.out.print(element +" ");
            }
        }
    }
    System.out.println("\n tổng các phần tử chẵn trong mảng là: " + sumChan);
    }
}
