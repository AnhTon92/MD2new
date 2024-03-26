package ra.stack;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        //khởi tạo stack
        Stack<String> stack = new Stack<>();
        // thêm các phần tử vào stack
        stack.push("Q Anh");
        stack.push("L Anh");
        stack.push("Ngọc Anh");

        //lấy nhưng không xóa ptu đầu
        System.out.println(stack.peek());

        // lấy và xóa
        System.out.println(stack.pop());
        System.out.println(stack);

        //kiểm tra stack có phần tử hay không
        //duyệt stack
        while (!stack.empty()) {
            String element = stack.pop();
            System.out.println("phần tử kế tiếp: " + element);
        }
        //tìm kiếm phần tử
        System.out.println(stack.search("Q Anh"));

        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());

        Queue<String> queue = new PriorityQueue<>();
        queue.add("Khánh");
        queue.add("Nam");
        queue.add("Sơn");
        queue.offer("Hùng");
        // Lấy nhưng ko xóa
        System.out.println(queue.peek());
//        System.out.println(queue.remove()); // ném ra lỗi neu hang đơi rỗng
//        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue);


        // Dequeue
//        Deque<String> deque = new ArrayDeque<>();
//        deque.addFirst("Quỳnh Anh");
//        deque.addFirst("Ngọc Anh");
//        deque.addFirst("Hồng Anh");
//        deque.addLast("Trung Hiếu");
//        deque.addLast("Văn Đạt");
//
//        while (!deque.isEmpty()){
//            System.out.println(deque.poll());
//        }



    }
    }

