package java_basic.Thread;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("继承Thread类的线程：" + i);
        }
    }
}