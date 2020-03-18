package safety;

/**
 * @author gongzizhao
 * @date 2019/11/24 14:43
 */
public class Demo1Ticket {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        System.out.println("run:"+run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
    }
}
