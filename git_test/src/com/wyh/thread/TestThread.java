package com.wyh.thread;
/**
 * 继承thread类
 */
public class TestThread {
    public static void main(String[] args) {
        //创建线程
        ThreadDemo1 t1 = new ThreadDemo1("t1");
        //启动线程
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程 : "+i);
        }
    }
}
class ThreadDemo1 extends Thread{
    //传入有参构造
    public ThreadDemo1(String name) {
        super(name);
    }
    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+" : "+i);
        }
    }
}
