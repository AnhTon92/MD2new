package baitap.bai4;


public class BinaryST
{
    Node root;
    // Thêm mới đệ quy
    private Node addRecursive(Node current, int value) {
        //Duyet loai bo truong hop null
        if (current == null) { // node gốc
            return new Node(value); // tr về node về thêm mơi
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }
    public void add(int value) {
        this.root = addRecursive(root, value);
    }

}
