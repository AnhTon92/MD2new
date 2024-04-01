package baitap;

import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        // Nhập chuỗi từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String input = scanner.nextLine();

        // Tìm và in ra chuỗi tăng dần lớn nhất
        String longestSubsequence = findLongestIncreasingSubsequence(input);
        System.out.println("Chuỗi tăng dần lớn nhất là: " + longestSubsequence);
    }

    private static String findLongestIncreasingSubsequence(String input) {
        String longest = "";
        String current = "";

        for (char c : input.toCharArray()) {
            if (current.length() == 0 || c > current.charAt(current.length() - 1)) {
                current += c;
                if (current.length() > longest.length()) {
                    longest = current;
                }
            } else {
                current = "" + c;
            }
        }

        return longest;
    }
}

