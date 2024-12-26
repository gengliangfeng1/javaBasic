package java_basic.sync;

class VolatileVisibility {
    private static volatile boolean flag = false;
    public static void main(String[] args) {
        // 线程1，用于修改flag的值
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("Thread 1 has set flag to true.");
        });
        // 线程2，用于读取flag的值
        Thread thread2 = new Thread(() -> {
            while (!flag) {
                // 不断检查flag的值，直到它变为true
            }
            System.out.println("Thread 2 has detected flag is true.");
        });
        thread2.start();
        thread1.start();
    }
}