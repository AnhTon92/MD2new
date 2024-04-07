package baitap.bai5;

public class Even implements Runnable{ // thục thi interface runnable
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) { // in ra số chẵn từ 1 đến 10
            System.out.println("Số chẵn: " + i);
            try {
                Thread.sleep(1500);// mỗi lần lặp dừng 1,5s
            } catch (InterruptedException e) {// bắt ngoại lệ nếu gián đoạn
                e.printStackTrace();
            }
        }
    }
}
