package safety;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author gongzizhao
 * @date 2019/11/24 14:41
 */
public class RunnableImpl implements Runnable{
    private int ticket = 100;
    private static int tic = 100;
    Object obj = new Object();
    Lock l = new ReentrantLock();
    @Override
    public void run() {
        System.out.println("this:"+this);
       /* l.lock();
        while (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在卖"+ticket);
                ticket--;
        }
        l.unlock();*/
            //同步代码块
            /*synchronized (obj){
                while (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在卖"+ticket);
                    ticket--;
                }
            }*/
            //payTicket();//同步方法
            //payTicketStatic();//静态同步方法

           while (true) {
               l.lock();
               if(ticket>0) {
                   try {
                       Thread.sleep(100);
                       System.out.println(Thread.currentThread().getName() + "正在卖" + ticket);
                       ticket--;
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   } finally {
                       l.unlock();
                   }
               }else return;
            }
    }

   /* public synchronized void payTicket() {
         while (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在卖"+ticket);
            ticket--;
        }
    }
    public static synchronized void payTicketStatic() {
        while (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在卖"+tic);
            tic--;
        }
    }*/
}
