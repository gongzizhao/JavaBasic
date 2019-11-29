package LambdaTest;

/**
 * @author gongzizhao
 * @date 2019/11/28 11:22
 * 函数式接口作为方法的参数案例
 */
public class Demo1Runnable {
    public static void startThread(Runnable runnable) {
        new Thread(runnable).start();
    }
    public static void main(String[] args) {
        startThread(() -> System.out.println(Thread.currentThread().getName() + "started"));

    }
}
