package baitap;

public class Bai_1 extends Thread {// thừa kế thread để chạy luồng
    @Override
    public void run() {
        for (int i = 10; i >0 ;i--) {// vòng lặp đếm ngược từ 10 về 1
            System.out.println("Thời gian : " + i );
            try {// dùng try-catch bắt ngoại lệ trong vòng lặp tạm dừng 1s
                //Nếu luồng bị gián đoạn trong khi đang ngủ, một ngoại lệ InterruptedException sẽ được ném ra và bắt trong khối catch.
                // Ngoại lệ này sau đó được bọc trong một RuntimeException và ném ra ngoài.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Kết thúc");// thông báo kết thúc vòng lặp
    }

    public static void main(String[] args) {
        Bai_1 bai1 = new Bai_1();
        bai1.start();
    }
}
