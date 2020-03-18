package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author gongzizhao
 * @date 2019/11/24 16:46
 * 线程池：容器->ArrayList，HashSet,LinkedList<Thread>,HashMap.
 * Thread t=list.remove(0);list.add(t);
 * Thread t=linked.removeFirst();linked.addLast(t);
 * JDK1.5后，JDK内置了线程池
 * java.util.concurrent.Executors:线程池的工厂类
 * 其中的静态方法：static ExecutorService newFixedThreadPool(int nThreads)
 *     创建1个可重用固定线程数的线程池
 * java.util.concurrent.ExecutorService:线程池接口
 *     用来从线程池中获取线程，调用start方法，执行线程任务
 *       submit(Runnable task)提交一个Runnable任务用于执行
 *       shutdown()：关闭/销毁线程池
 */
public class Demo1ThreadPool {
    public static void main(String[] args) {
        //1.获取线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        //3.调用submit，传递线程任务（实现类），开启线程，执行run方法
        es.submit(new RunnableImpl());
        //线程池会一直开启，并自动归还继续使用
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        //4.销毁线程池，不建议执行
        es.shutdown();
    }
}
