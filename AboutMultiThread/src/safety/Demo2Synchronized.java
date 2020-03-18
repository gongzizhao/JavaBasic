package safety;

/**
 * @author gongzizhao
 * @date 2019/11/24 15:20
 * 1.同步代码块解决线程安全问题
 *  synchronized (锁对象){}
 *  当线程发现synchronized代码块中没有锁对象，则阻塞
 * 2.同步方法解决线程安全问题
 *  把访问了共享数据的代码抽取到一个方法中，在方法上添加synchronized修饰符
 *  同步方法的锁对象就是this
 * 3.静态同步方法：锁对象时本类的class文件对象
 */
public class Demo2Synchronized {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
    }
}
