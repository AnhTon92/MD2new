package baitap.bai5;

public class Run {
    public static void main(String[] args) {
        // tạo 2 đối tượng
        Odd oddThread = new Odd();
        Thread evenThread = new Thread(new Even());

        oddThread.start();
        try {
            oddThread.join();  // Đảm bảo rằng oddThread hoàn thành trước
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        evenThread.start();
    }
}
