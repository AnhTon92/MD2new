package baitap.entitty;

import java.util.Scanner;

public class Bai_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi: ");
        String input = scanner.nextLine();

        String longestSubsequence = findLongestConsecutiveSubsequence(input);
        System.out.println("Chuỗi liên tiếp có độ dài lớn nhất là: " + longestSubsequence);
    }

    private static String findLongestConsecutiveSubsequence(String input) {
        String longest = "";
        String current = "";

        for (int i = 0; i < input.length(); i++) {
            if (current.length() == 0 || input.charAt(i) == input.charAt(i - 1) + 1) {
                current += input.charAt(i);
                if (current.length() > longest.length()) {
                    longest = current;
                }
            } else {
                current = "" + input.charAt(i);
            }
        }

        return longest;
    }
}
