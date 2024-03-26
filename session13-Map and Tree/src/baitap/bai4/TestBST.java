package baitap.bai4;


public class TestBST {
    public static void main(String[] args) {
        BinaryST bst = new BinaryST();
        Node root = new Node(60);
        bst.root = root;
        root.left = new Node(55);
        root.left.left=new Node(56);
        root.left.right=new Node(57);
        root.right= new Node(78);
        root.right.right = new Node(107);
        root.right.left = new Node(101);
    }
}
