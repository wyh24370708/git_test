package com.wyh.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestRunnable3 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Ticket implements Runnable{

    private int ticket =100;
    //设置锁
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            lock.lock();//加锁
            if (ticket>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 正在卖 "+ticket--);
            }
            lock.unlock();//解锁
        }
    }
}




