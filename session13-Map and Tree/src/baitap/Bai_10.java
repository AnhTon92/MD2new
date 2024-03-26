package baitap;

import java.util.Scanner;

//tạo lớp ảo node để khai báo
class Node {
    int element;
    Node left;
    Node right;

    public Node(int element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }
}
// tạo lớp
public class Bai_10 {
// tạo phương thức search
    public static Node search(Node root, int element) {// phương thức search
        Node current = root; // tạo biến current gán = root
        while (current != null && current.element != element) {// khi current ko null và element của current khác element đã cho
            if (element < current.element) {// nếu element đã cho < element của current
                current = current.left; // thì current đổi sang trái
            } else { //còn không current sang phải
                current = current.right;
            }
        }
        return current; // phương thức trả về current
    }

    public static void main(String[] args) {
        //tạo 1 cây nhị phân
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        // Tìm kiếm phần tử n
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào phần tử n để tìm kiếm: ");
        int n = Integer.parseInt(scanner.nextLine());
        Node foundNode = search(root, n); // đặt 1 biến foundNode kiểu dữ liệu là Node đã khai báo, gán thành phương thức search

        if (foundNode != null) {// nếu biến foundNode không rỗng thì in ra đã tìm thấy
            System.out.println("Tìm thấy phần tử " +n);
        } else {// nếu rỗng thì báo là không tồn tại
            System.out.println("Phần tử n không tồn tại trong cây");
        }
    }
}

