package com.wyh.thread;

public class TestRunnable {
    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread t1 = new Thread(runnableDemo);
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程 : "+i);
        }
    }
}

class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
