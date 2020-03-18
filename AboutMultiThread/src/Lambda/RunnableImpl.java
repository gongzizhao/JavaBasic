package Lambda;

/**
 * @author gongzizhao
 * @date 2019/11/24 17:13
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "new thread builded");
    }
}
