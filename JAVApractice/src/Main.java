import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        //khai báo mảng số nguyên gồm 5 pần tử ,
//        // nhập giá trị các phần tử từ bàn phím và in ra giá trị các
//        // phần tử của mảng
//        Integer [] arr = new Integer[5]; // khai báo mảng số nguyên arr gồm 5 ptu
//        // nhập giá trị
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("nhập giá trị cho phần tử thứ "+ (i+1) + ":");
//            arr[i] = scanner.nextInt();
//        }
//        //In ra
//        System.out.println("giá trị phần tử của mảng là: ");
//        for (int j : arr) {
//            System.out.println(j);
//        }
//
//    }

    //    public static void main2(String[] args) {
//// nhập vào số phần tử n của mảng 1 chiều ,
//// khai báo và nhập giá trị của mảng 1 chiều số thực gồm n phần tử.
//// In ra giá trị trung bình cộng của các phần tử trong mảng
//Scanner scanner =new Scanner(System.in);
//        System.out.println("nhập vào số phần tử n của mảng");
//        int n = Integer.parseInt(scanner.nextLine());
//        // khai báo mảng số thực
//        double[] array = new double[n];
//        // nhập giá trị
//        double sum =0;
//        for (int i = 0; i < n; i++) {
//            System.out.println("nhập giá trị của phần tử thứ "+ (i+1) + ":");
//            array[i] = Double.parseDouble(scanner.nextLine());
//            sum += array[i];
//        }
//// tính giá trị trung bình
//        double average = sum / n;
//        // in ra giá trị trung bình cộng của mảng
//        System.out.println("giá trị trung bình cộng của các phần tử trong mảng là: "+ average);
//    }
//public static void main3(String[] args) {
//// nhập vào số dòng và cột của mảng 2 chiều (row* col), khai báo và nhập
//// giá trị các phần tử của các phần tử mảng số nguyên 2 chiều. In giá trị các phần tử mảng theo ma trận
//Scanner scanner = new Scanner(System.in);
//    System.out.println("nhập vào số hàng: ");
//    int rows = Integer.parseInt(scanner.nextLine());
//    System.out.println("nhập vào số cột: ");
//    int cols = Integer.parseInt(scanner.nextLine());
//    // khai báo mảng 2 chiều
//    int [][] matrix = new int[rows][cols];
//    // nhập giá trị cho các phần tử của mảng
//    for (int i = 0; i < rows; i++) {
//        for (int j = 0; j < cols; j++) {
//            System.out.println("nhập giá trị cho phần tử ["+i+"]"+j+"]: ");
//            matrix[i][j] = Integer.parseInt(scanner.nextLine());
//        }
//    }
//    // In giá trị các phần tử mảng theo ma trận
//    System.out.println("ma trận vừa nhập:");
//    for (int i = 0; i < rows; i++) {
//        for (int j = 0; j < cols; j++) {
//            System.out.print(matrix[i][j]+" ");
//
//        }
//        //xuống dòng khi hết hàng
//        System.out.println();
//    }
//
//}
//public static void main4(String[] args) {
////nhập số phần tử và giá trị các phần tử của mảng 1 chiều số nguyên
//// tìm giá trị lớn nhất và nhỏ nhất trong mảng
//    // nhập độ dài mảng
//Scanner scanner = new Scanner(System.in);
//    System.out.println("nhập vào độ dài của mảng: ");
//    int n = Integer.parseInt(scanner.nextLine());
//    //khai báo mảng
//    int[] array = new int[n];
//    // nhập giá trị
//    System.out.println("nhập giá trị cho các phần tử mảng: ");
//    for (int i = 0; i < n; i++) {
//        System.out.println("phần tử thứ "+ (i+1)+":");
//        array[i] = Integer. parseInt(scanner.nextLine());
//    }
//    // tìm giá trị lớn nhất và nhỏ nhất
//    int max = array[0];
//    int min = array[0];
//    for (int j: array){
//        if (j > max){
//            max =j;
//        }
//        if (j<min){
//            min = j;
//        }
//    }
//    //in ra min và max
//    System.out.println("giá trị lớn nhất trong mảng là: " +max);
//    System.out.println("giá trị nhỏ nhất trong mảng là: "+min);
//}
//public static void main5(String[] args) {
//// nhập số phần tử của mảng số thực 2 chiều (row*col), khai báo và nhập giá
//// trị các phần tử của mảng 2 chiều đó, in ra các phần tử có giá trị chẵn và tính tổng các phần tử đó
//   Scanner scanner = new Scanner(System.in);
//    System.out.println("nhập vào số hàng: ");
//    int rows = Integer.parseInt(scanner.nextLine());
//    System.out.println("nhập vào số cột: ");
//    int cols = Integer.parseInt(scanner.nextLine());
//    // khai báo mảng 2 chiều số thực
//    double [][] matrix = new double[rows][cols];
//    // nhập giá trị cho các phần tử của mảng và tính tổng các ptu chẵn
//    double sumChan = 0;
//    for (int i = 0; i < rows; i++) {
//        for (int j = 0; j < cols; j++) {
//            System.out.println("nhập giá trị cho phần tử ["+i+"]"+j+"]: ");
//            matrix[i][j] = Double.parseDouble(scanner.nextLine());
//            // kiểm tra phần tử chẵn
//            if (matrix[i][j] % 2 == 0){
//                sumChan += matrix[i][j];
//            }
//        }
//    }
//    //in ra các phần tử chẵn và tổng
//    System.out.println("các phần tử chẵn trong mảng là: ");
//    for (double[] rowArr : matrix){
//        for (double element : rowArr) {
//            if (element % 2 == 0) {
//                System.out.print(element +" ");
//            }
//        }
//    }
//    System.out.println("\n tổng các phần tử chẵn trong mảng là: " + sumChan);
//
//
//}
//public static void main6(String[] args) {
////// nhập vào số phần tử mảng n, khai báo và nhập giá trị các phần tử của mảng
////// 1 chiều số nguyên. Nhập vào giá trị findNumber, in ra chỉ số các phần tử và
////// tổng các phần tử bằng với giá trị findNumber
////    Scanner scanner = new Scanner(System.in);
////    System.out.println("nhập vào độ dài của mảng: ");
////    int n = Integer.parseInt(scanner.nextLine());
////    //khai báo mảng
////    int[] array = new int[n];
////    // nhập giá trị
////    System.out.println("nhập giá trị cho các phần tử mảng: ");
////    for (int i = 0; i < n; i++) {
////        System.out.println("phần tử thứ "+ (i+1)+":");
////        array[i] = Integer. parseInt(scanner.nextLine());
////    }
////    System.out.println(" nhập vào giá trị findNumber: ");
////    int findNumber = Integer.parseInt(scanner.nextLine());
////    // in ra chỉ số các phần tử và tổng của các phần tử bằng với findNumber
////    int sum = 0 ;
////    System.out.println("chỉ số các phần tử bằng với "+findNumber +"là:" );
////    for (int i = 0; i < n; i++) {
////        if (array[i] ==  findNumber) {
////            System.out.printf(i+" ");
////            sum += array[i];
////        }
////    }
////    System.out.println("\n Tổng các phần tử bằng với "+findNumber+" là: " + sum);
////}
//    public static void main(String[] args) {
//// nhập số phần tử của mảng n , khai báo và nhập giá trị các phần tử của mảng
//// 1 chiều số nguyên . Nhập giá trị addValue và chỉ số chèn phần tử vào mảng
//// addIndex, thực hiện thêm chèn giá trị addValue và chỉ số các phần tử addIndex của mảng
//        Scanner scanner = new Scanner(System.in);
//// 1.nhập số phần tử của mảng
//        System.out.println("nhập số phần tử của mảng: ");
//        int n = Integer.parseInt(scanner.nextLine());
//        //2. khai báo arraylist để lưu trữ các phần tử số nguyên
//        ArrayList<Integer> array = new ArrayList<>();
//        //3. nhập giá trị cho mảng
//        int temp = 0;
//        System.out.println("nhập giá trị các phần tử mảng: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println("phần tử thứ " + (i + 1) + ": ");
//            temp = Integer.parseInt(scanner.nextLine());
//            array.add(temp);
//        }
//        //4. nhập giá trị addValue và chỉ số addIndex
//        System.out.println("nhập giá trị addValue để chèn vào mảng: ");
//        int addValue = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập giá trị addIndex để chèn vào mảng: ");
//        int addIndex = Integer.parseInt(scanner.nextLine());
//        //5.thêm chèn giá trị addValue và chỉ số addIndex của mảng
//        while (addIndex < 0 || addIndex > n) {
//            System.out.println("chỉ số addIndex không hợp lệ. mời nhập lại");
//            addIndex = Integer.parseInt(scanner.nextLine());
//        }
//        array.add(addIndex, addValue);
//
//        //6. in mảng sau khi chèn
//        System.out.println("mảng sau khi chèn là:");
//        for (int value : array) {
//            System.out.println(value + " ");
//        }
//    }
//    public static void main(String[] args) {
//        //Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
//        //tử của mảng 1 chiều số nguyên. Nhập giá trị (updateValue) và chỉ số phần
//        //tử cần cập nhật (updateIndex), thực hiện cập nhật giá trị updateValue vào
//        //phần tử có chỉ số updateIndex
//        Scanner scanner = new Scanner(System.in);
//// 1.nhập số phần tử của mảng
//        System.out.println("nhập số phần tử của mảng: ");
//        int n = Integer.parseInt(scanner.nextLine());
//        //2. khai báo mảng số nguyên
//        int[] array = new int[n];
//        //3. nhập giá trị cho mảng
//        int temp = 0;
//        System.out.println("nhập giá trị các phần tử mảng: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println("phần tử thứ " + (i + 1) + ": ");
//            temp = Integer.parseInt(scanner.nextLine());
//            array[i] = temp;
//        }
//        //4. nhập giá trị updateValue và chỉ số updateIndex
//        System.out.println("nhập giá trị updateValue để chèn vào mảng: ");
//        int updateValue = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập giá trị updateIndex để chèn vào mảng: ");
//        int updateIndex = Integer.parseInt(scanner.nextLine());
//        //5.thêm chèn giá trị addValue và chỉ số addIndex của mảng
//        while (updateIndex < 0 || updateIndex >= n) {
//            System.out.println("chỉ số updateIndex không hợp lệ. mời nhập lại");
//            updateIndex = Integer.parseInt(scanner.nextLine());
//        }
//        array[updateIndex] = updateValue;
//
//        //6. in mảng sau khi chèn
//        System.out.println("mảng sau khi update là:");
//        for (int value : array) {
//            System.out.println(value + " ");
//        }
//    }
    public static void main(String[] args) {
// Nhập số phần tử của mảng (n), khai báo và nhập giá trị các phần
//tử của mảng 1 chiều số nguyên. Nhập chỉ số phần tử cần xóa (deleteIndex)
//và thực hiện xóa phần tử trong mảng theo deleteIndex
// cách 1: thông thường
//        //1. khai báo biến n số phần tử của mảng
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập số phần tử của mảng: " );
//        int n = Integer.parseInt(scanner.nextLine());
//        //2. khai báo mảng
//        int[] array = new int[n];
//        //3. nhập giá trị cho mảng
//        int temp = 0;
//        System.out.println("nhập giá trị các phần tử mảng: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println("phần tử thứ " + (i + 1) + ": ");
//            temp = Integer.parseInt(scanner.nextLine());
//            array[i] = temp;
//        }
//        //4. nhập chỉ số phần tử cần xóa
//        System.out.println("nhập chỉ số phần tử cần xóa: ");
//        int deleteIndex = Integer.parseInt(scanner.nextLine());
//        // xóa phần tử tại chỉ số deleteIndex
//        while (deleteIndex < 0 || deleteIndex >= n) {
//            System.out.println("chỉ số deleteIndex không hợp lệ. mời nhập lại");
//            deleteIndex = Integer.parseInt(scanner.nextLine());
//        }
//        for (int i = deleteIndex; i < n -1; i++) {
//            array[i] = array[i +1];
//
//        }n--; // giảm kích thước mảng sau khi xóa

//        //in mảng sau khi xóa
//        System.out.println("mảng sau khi xóa:");
//        for (int i = 0; i < n; i++) {
//            System.out.println(array[i] + " ");
//        }
//    }
// cách 2: dùng arraylist
//        1. khai báo biến n số phần tử của mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng: " );
        int n = Integer.parseInt(scanner.nextLine());
        //2. khai báo arrayList
        ArrayList<Integer> array = new ArrayList<>();
        //3. nhập giá trị cho mảng
        int temp = 0;
        System.out.println("nhập giá trị các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.println("phần tử thứ " + (i + 1) + ": ");
            temp = Integer.parseInt(scanner.nextLine());
            array.add(temp);
        }
        //4. nhập chỉ số phần tử cần xóa
        System.out.println("nhập chỉ số phần tử cần xóa: ");
        int deleteIndex = Integer.parseInt(scanner.nextLine());
        // xóa phần tử tại chỉ số deleteIndex
        while (deleteIndex < 0 || deleteIndex >= n) {
            System.out.println("chỉ số deleteIndex không hợp lệ. mời nhập lại");
            deleteIndex = Integer.parseInt(scanner.nextLine());
        }
        array.remove(deleteIndex);
        System.out.println("phần tử tại chỉ số "+ deleteIndex+"đã được xóa!");
        //in mảng sau khi xóa
        System.out.println("mảng sau khi xóa:");
       for (int value : array) {
           System.out.println(value + " ");
    }
    }
}

