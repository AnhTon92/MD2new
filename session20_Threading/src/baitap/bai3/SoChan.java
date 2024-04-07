package baitap.bai3;

public class SoChan extends Thread{
    public void run() {
        for (int i = 2; i <=100 ; i+=2) {// in ra các số chẵn từ 1 đến 100
            System.out.println("Số chẵn" + i);
        }
    }
}
