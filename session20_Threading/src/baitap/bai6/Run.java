package baitap.bai6;

public class Run {
    public static void main(String[] args) {
        LazyPrime lazyPrime = new LazyPrime();
        RealPrime realPrime = new RealPrime();
        Thread lazyThread = new Thread(lazyPrime);
        Thread realThread = new Thread(realPrime);
        lazyThread.start();
        realThread.start();
    }
}
