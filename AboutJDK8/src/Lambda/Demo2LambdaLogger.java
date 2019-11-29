package Lambda;

/**
 * @author gongzizhao
 * @date 2019/11/28 10:58
 * 优化日志案例
 * Lambda：延迟加载
 * 前提：存在函数式接口
 */
public class Demo2LambdaLogger {
    //定义一个显示日志的方法，方法参数传递日志等级和MessageBuilder接口
    public static void showLog(int level, MessageBuilder messageBuilder) {
        //对日志的等级进行判断，如果1级，则调用MessageBuilder接口中的buildMessage方法
        if (level == 1) {
            System.out.println(messageBuilder.builderMessage());
        }
    }
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "world";
        String msg3 = "java";

        showLog(1,()->{
            System.out.println("不满足条件不执行");//若level！=1，则此句不会执行
            return msg1 + msg2 + msg3;
        });

        /*
        *使用Lambda表达式作为参数传递，仅仅把参数传递到showLog方法中
        * 只有level=1时，才会调用MessageBuilder接口中的buildMessage方法
        * 从而进行字符串的拼接
        * 不会存在性能浪费
        * */

    }
}
