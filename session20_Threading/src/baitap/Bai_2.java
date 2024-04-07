package baitap;

public class Bai_2 extends Thread{ // kế thừa thread
    private long sum = 0; // khai báo biến sum lưu tổng
    public void run() {
        for (int i = 1; i <= 1000; i++) {// vòng lặp cộng dồn vào biến sum từ 1 đến 1000
            sum += i;
            try {//sau mỗi vòng lặp tạm dừng 1s
                Thread.sleep(1);
            } catch (InterruptedException e) {// nếu bị gián đoạn khi đang sleep thì bắt ngoại lệ và ném ra lỗi
                throw new RuntimeException(e);
            }
        }
    }

    public long getSum() { // trả về giá trị sum khi hết vòng lặp
        return sum;
    }

    public static void main(String[] args) {
        Bai_2 Bai2 = new Bai_2();
        Bai2.start();
        // Chờ tất cả các thread hoàn thành
        try {
            Bai2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Tổng các số từ 1 đến 1000 là: " + Bai2.getSum());
    }
}
