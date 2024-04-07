package baitap;

public class Bai_4 implements Runnable{// thực thi interface runnable

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {// in ra số từ 1 đến 10 và mã hash
            System.out.println(i + " HashCode: " + this.hashCode());
            try {// sau mỗi lần in cho tạm dừng nửa giây
                Thread.sleep(500);
            } catch (InterruptedException e) {// bắt ngoại lệ nếu bị gián đoạn khi ngủ
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // ạo hai đối tượng của Bai_4.
        //Tạo hai luồng (thread1 và thread2) và gán mỗi đối tượng Bai_4 vào một luồng.
        //Đặt độ ưu tiên cho hai luồng: thread1 có độ ưu tiên cao nhất và thread2 có độ ưu tiên thấp nhất.
        Bai_4 numberGenerator1 = new Bai_4();
        Bai_4 numberGenerator2 = new Bai_4();

        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
