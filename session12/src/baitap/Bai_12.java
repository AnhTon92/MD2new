package baitap;

import java.util.ArrayDeque;
import java.util.Queue;

public class Bai_12 {
    public static void main(String[] args) {
        int[] objs = {2,5,6,7,4,8,12,21,15};
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < objs.length; i++) {
            queue.offer(objs[i]);
        }
        System.out.println("cac phân tu trong queue là: " + queue);
        int min = queue.poll();
        while(!queue.isEmpty()){
            int element = queue.poll();
            if(min>element){
                queue.add(element);
                min = element;
            } else {
                queue.add(min);
                break;
            }
        }
        System.out.println("số bé nhất là min:" + min);
    }
}
