package com.lyx.thread;

/**
 * @author LYX
 * @create 2018-10-04 15:27
 */
public class ThreadPriorityTest {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
            if (i == 20) {
                myThread.setPriority(Thread.MAX_PRIORITY);
                myThread.start();
            }
        }
    }
}
