package baitap.bai3;

public class SoLe implements Runnable{// thực thi runable
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i+=2) {// in ra các số lẻ từ 1 đến 100
            System.out.println("Số lẻ " + i);
        }
    }
}
