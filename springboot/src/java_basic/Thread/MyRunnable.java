package java_basic.Thread;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("实现Runnable接口的线程：" + i);
        }
    }
}
