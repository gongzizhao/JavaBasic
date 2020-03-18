package com;

/**
 * @author gongzizhao
 * @date 2019/11/24 12:55
 */
public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    //run 重写，设置线程任务
    @Override
    public void run() {
        /*String name = getName();
        System.out.println(name);*/

       /* Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println(name);*/

        System.out.println(Thread.currentThread().getName());
    }
}
