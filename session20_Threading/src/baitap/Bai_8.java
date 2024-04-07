package baitap;

public class Bai_8 {
    private int sharedVariable = 0; // khai báo biến để lưu giá trị chung giữa các luồng

    public synchronized void increase() {// phương thức đồng bộ hóa tăng
        //Tăng giá trị của sharedVariable lên 1.
        //In ra thông báo “Increased” cùng với giá trị mới của sharedVariable.
        sharedVariable++;
        System.out.println("Increased: " + sharedVariable);
    }

    public synchronized void decrease() {// phương thức đồng bộ hóa giảm
        //Giảm giá trị của sharedVariable đi 1.
        //In ra thông báo “Decreased” cùng với giá trị mới của sharedVariable.
        sharedVariable--;
        System.out.println("Decreased: " + sharedVariable);
    }

    public static void main(String[] args) {
        Bai_8 variableUpdater = new Bai_8();//Tạo một đối tượng Bai_8 tên là variableUpdater.

        Thread increaseThread = new Thread(() -> {// tạo và khởi động 2 luồng tăng và giảm

            //Mỗi luồng chạy một vòng lặp vô hạn, trong đó increaseThread gọi phương thức increase() và decreaseThread gọi phương thức decrease().
            //Mỗi lần sau khi gọi phương thức, luồng sẽ ngủ (sleep) trong 1 giây.
            while (true) {
                variableUpdater.increase();
                try {
                    Thread.sleep(1000); // Ngủ 1 s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread decreaseThread = new Thread(() -> {
            while (true) {
                variableUpdater.decrease();
                try {
                    Thread.sleep(1000); // Ngủ 1 giây
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        increaseThread.start();
        decreaseThread.start();
    }
    //Vì cả hai phương thức increase() và decrease() đều được đồng bộ hóa,
    // nên không có hai luồng nào có thể thay đổi sharedVariable cùng một lúc.
}
