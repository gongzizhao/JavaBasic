package ThreadPool;

/**
 * @author gongzizhao
 * @date 2019/11/24 17:03
 */
//2.创建类实现Runnable接口，重写run方法，设置线程任务
public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("a new thread");
    }
}
