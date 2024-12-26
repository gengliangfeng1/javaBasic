package java_basic.sync;

import java.util.concurrent.atomic.AtomicInteger;
class AtomicExample {
    // if use int instead of AtomicInteger, the issue will happen
    private static AtomicInteger counter = new AtomicInteger(0);
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.getAndIncrement();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.getAndIncrement();
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter value: " + counter.get());
    }
}