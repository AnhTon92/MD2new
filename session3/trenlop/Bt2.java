import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {       //   arrOld   123 456
        Scanner scanner = new Scanner(System.in);  //   arrNew   123i456
        //b1 khai báo và khởi tạo mảng số nguyên
        System.out.println("mời nhập độ dài mảng");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("array[%d] = ", i);
            arr[i] = scanner.nextInt(); // Nhập giá trị cho từng phần tử
        }
        //b2 nhập x là phần tử cần chèn
        System.out.println("nhập phần tử cần chèn");
        int x = scanner.nextInt();
        //b3 nhập y là vị trí cần chèn
        System.out.println("nhập vị trí cần chèn");
        int y = scanner.nextInt();
        if (y <= -1 || y >= arr.length - 1) {
            System.out.println("không chèn được");

        } else {
            // tạo 1 mang mới size +1
            int newArr[] = new int[n + 1];
            // 1 for gán ptu cho mang mới từ mảng cũ 0 - index(y) - 1
            for (int i = 0; i < y ; i++) {
                newArr[i] = arr[i];
            }
            // ptu cho mảng mới tại index = giá trị nhập vào
            newArr[y] = x;
            // 1 for gán ptu cho mang mới từ mảng cũ  index(y) + 1 đến newArray.length
            for (int i = y+1 ; i < newArr.length; i++) {
                newArr[i] = arr[i-1];
            }
            //b4 in ra mảng
            for (int i = 0; i < newArr.length; i++) {
                System.out.println(newArr[i] + " ");
            }
        }
    }
}

