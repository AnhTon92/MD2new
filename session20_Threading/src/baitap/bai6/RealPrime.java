package baitap.bai6;

import java.util.stream.IntStream;

public class RealPrime implements Runnable{
    // cách chuẩn
    private static final int LIMIT = 100; // Giới hạn số lượng số nguyên tố được in ra
    private int count = 0; // Đếm số lượng số nguyên tố đã tìm thấy

    @Override
    public void run() {
        IntStream.iterate(2, i -> i + 1).forEach(i -> {
            if (isPrime(i)) {
                System.out.println("LazyPrime: " + i);
                count++;
                if (count == LIMIT) {
                    System.out.println("Đã đạt đến giới hạn của " + LIMIT + " số nguyên tố.");
                    return;
                }
            }
        });
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(number)).allMatch(i -> number % i != 0);
    }
}
