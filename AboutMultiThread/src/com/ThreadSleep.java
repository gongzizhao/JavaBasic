package com;

/**
 * @author gongzizhao
 * @date 2019/11/24 14:08
 */
public class ThreadSleep {
    public static void main(String[] args) {
        for (int i = 1; i < 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);//毫秒结束后继续执行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
