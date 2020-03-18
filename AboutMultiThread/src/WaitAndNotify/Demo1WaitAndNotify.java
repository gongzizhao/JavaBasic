package WaitAndNotify;

/**
 * @author gongzizhao
 * @date 2019/11/24 16:08
 */
public class Demo1WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象且保证唯一
        Object obj = new Object();
        //创建1个消费者线程
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    //保证等待和唤醒的进程只有1个能执行，需要使用同步技术
                    synchronized (obj) {
                        System.out.println("i want several baozi");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("thanks");
                        System.out.println("----------------");
                    }
                }
            }
        }.start();
        //创建1个生产者进程
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    //花5s生产
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("ok");
                        obj.notify();
                    }
                }
            }
        }.start();
    }

}
