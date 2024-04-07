package baitap;

public class Bai_8 {
    private int sharedVariable = 0;

    public synchronized void increase() {
        sharedVariable++;
        System.out.println("Increased: " + sharedVariable);
    }

    public synchronized void decrease() {
        sharedVariable--;
        System.out.println("Decreased: " + sharedVariable);
    }

    public static void main(String[] args) {
        Bai_8 variableUpdater = new Bai_8();

        Thread increaseThread = new Thread(() -> {
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
}
