package java_basic.sync;

class SynchronizedComplexExample {
    private static int value = 0;
    private static final Object lock = new Object();
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    if (value == i) {
                        value = i + 1;
                        System.out.println("Thread 1 updated value from " + i + " to " + (i + 1));
                    }
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    if (value == i) {
                        value = i + 1;
                        System.out.println("Thread 2 updated value from " + i + " to " + (i + 1));
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}