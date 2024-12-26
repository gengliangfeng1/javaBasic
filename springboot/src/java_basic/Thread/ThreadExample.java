package java_basic.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExample {
    public static void main(String[] args) {
        // create thread by extends Thread
        MyThread myThread = new MyThread();
        myThread.start();

        // create thread by implement Runable
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        // create thread by Callable
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        MyCallable myCallable = new MyCallable();
        Future<Integer> future = executorService.submit(myCallable);
        try {
            System.out.println("Callable线程的返回结果：" + future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();


        // create thread by threadpool
        ExecutorService executorServicePool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            MyRunnable mytask = new MyRunnable();
            executorServicePool.execute(mytask);
        }
        executorServicePool.shutdown();
    }
}