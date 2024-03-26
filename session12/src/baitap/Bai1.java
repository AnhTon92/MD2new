package baitap;

import java.util.ArrayDeque;
import java.util.Queue;

public class Bai1 {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("hùng");
        queue.offer("đạt");
        queue.offer("quynh anh shyn");
        queue.offer("giang rồng");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
