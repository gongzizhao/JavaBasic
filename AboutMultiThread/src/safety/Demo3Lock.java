package safety;

/**
 * @author gongzizhao
 * @date 2019/11/24 15:42
 * 3.Lock锁解决线程安全问题
 * java.util.concurrent.Locks.Lock接口
 * 实现了比synchronized方法和语句更广泛的锁定操作
 * 在成员位置床架一个ReentrantLock对象；在可能会出现安全问题的代码前后分别调用Lock和unLock方法
 */
public class Demo3Lock {
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
