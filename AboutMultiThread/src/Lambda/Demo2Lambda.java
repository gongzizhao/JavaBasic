package Lambda;

/**
 * @author gongzizhao
 * @date 2019/11/24 17:22
 * 标准格式：(参数列表)->{一些重写方法的代码}
 */
public class Demo2Lambda {
    public static void main(String[] args) {
        //使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "new thread builded");

            }
        }).start();

        //使用Lambda表达式
        new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "new thread builded");
            }
        ).start();
    }
}
