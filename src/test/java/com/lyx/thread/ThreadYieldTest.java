package com.lyx.thread;

/**
 * @author LYX
 * @create 2018-10-04 15:31
 */
public class ThreadYieldTest {
    public static void main(String[] args) {
        Thread myThread1 = new MyThread();
        Thread myThread2 = new Thread(new MyRunnable());
        myThread1.setPriority(Thread.MAX_PRIORITY);
        myThread2.setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
            if (i == 20) {
                myThread1.start();
                myThread2.start();
                Thread.yield();
            }
        }
    }
}
