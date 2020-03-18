package Lambda;

/**
 * @author gongzizhao
 * @date 2019/11/24 17:13
 */
public class Demo1Runnable {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t = new Thread(run);
        t.start();

        //简化代码，使用匿名内部类实现多线程程序
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "new thread builded");

            }
        };
        new Thread(r).start();

        //更加简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "new thread builded");

            }
        }).start();
    }
}
