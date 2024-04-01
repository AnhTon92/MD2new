package baitap;

import java.util.Scanner;

public class Bai_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        if (size <= 0) {
            System.out.println("Lỗi: Mảng phải có ít nhất 1 phần tử");
            scanner.close();
            return;
        }
        int[] array = new int[size];
        int sum = 0;
        System.out.println("Nhập phần tử cho mảng: ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
            sum += array[i];
        }
        try {
            double average = calculateAverage(array, size);
            System.out.println("giá trị trung bình của mảng là: "+ average);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi khi tính trung bình: "+ e.getMessage());
        }
        scanner.close();

    }

    private static double calculateAverage(int[] array, int size) {
        if (size == 0) {
            throw new ArithmeticException("Mảng không có phần tử nào, không thể tính trung bình.");
        }
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (double) sum/size;
    }
}
