package baitap.bai7;

import java.util.Random;

public class RandomNumber extends Thread{
    public void run() {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        System.out.println("Random : " + randomNumber);
    }
}
