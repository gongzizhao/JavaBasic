package com;

/**
 * @author gongzizhao
 * @date 2019/11/24 13:17
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("Thread11111");
        mt.start();
        new MyThread("Thread22222").start();

        System.out.println(Thread.currentThread().getName());
    }
}
