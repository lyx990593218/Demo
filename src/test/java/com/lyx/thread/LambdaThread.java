package com.lyx.thread;

public class LambdaThread {

    public static void main(String[] args) {
        Runnable task = () -> {System.out.println("hello world1");};
        new Thread(task).start();

        new Thread(() -> System.out.println("Hello world")).start();
    }
}