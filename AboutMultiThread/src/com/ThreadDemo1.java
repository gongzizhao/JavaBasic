package com;

/**
 * @author gongzizhao
 * @date 2019/11/24 12:51
 * 创建多线程方法1：创建Thread类的子类
 * java程序属于抢占式调度
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        //mt.run();//若这样写，则是单线程即main
        mt.start();//会为run方法新开栈空间
        for (int i = 0; i < 20; i++) {
            System.out.println("main..."+i);
        }
    }
}
/*
* JVM执行main方法，找OS开辟一条main方法通向cpu路径，这个路径叫main线程（主线程）
* cpu通过这个路径执行main方法
* 多条线程执行的时候，cpu有了选择的权利，随机性打印
* 程序都是压栈执行的，多线程之间互不影响，因为在不同的栈空间
* */