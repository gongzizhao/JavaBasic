package com;

/**
 * @author gongzizhao
 * @date 2019/11/24 14:12
 */
public class RunnableDemo1 {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread thread = new Thread(run);
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
/*
* 好处：1.避免了单继承的局限性；增强了程序的扩展性，降低了程序的耦合性
* */
