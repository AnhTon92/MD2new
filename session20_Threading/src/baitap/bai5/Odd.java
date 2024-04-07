package baitap.bai5;

public class Odd extends Thread{// kế thừa thread
    public void run() {
        for (int i = 1; i <= 10; i += 2) {// in ra số lẻ
            System.out.println("Số lẻ: " + i);
            try {
                Thread.sleep(1000);// dừng 1s mỗi lần lặp
            } catch (InterruptedException e) {// bắt ngoại lệ
                e.printStackTrace();
            }
        }
    }
}
