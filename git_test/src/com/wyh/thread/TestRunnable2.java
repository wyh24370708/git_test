package com.wyh.thread;

public class TestRunnable2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
            }
        };
        new Thread(runnable).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程 : "+i);
        }
    }
}




