package com;

/**
 * @author gongzizhao
 * @date 2019/11/24 14:27
 */
public class ThreadInnerClass {
    public static void main(String[] args) {
        //线程的父类时Thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <20; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }.start();

        //线程的接口Runnable
       /* Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "111");
                }
            }
        };
        new Thread(r).start();*/

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "111");
                }
            }
        }).start();
    }
}
