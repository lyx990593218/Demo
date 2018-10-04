package com.lyx.thread;

/**
 * @author LYX
 * @create 2018-10-04 15:09
 */
public class ThreadDaemonTest {
    public static void main(String[] args) {
        Thread myThread = new MyThread1();
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
            if (i == 20) {
                myThread.setDaemon(true);
                myThread.start();
            }
        }
    }
}


class MyThread1 extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
