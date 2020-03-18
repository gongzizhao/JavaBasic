package com;

/**
 * @author gongzizhao
 * @date 2019/11/24 14:14
 */
public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
