package Lambda;

/**
 * @author gongzizhao
 * @date 2019/11/28 10:55
 * 日志案例
 * 存在性能浪费的问题：
 * 先拼接了字符串，如果给showlog传递的level！=1，则此调用是浪费的
 */
public class Demo1Logger {
    public static void showLog(int level, String message) {
        //对日志的等级进行判断，如果1级，则调用MessageBuilder接口中的buildMessage方法
        if (level == 1) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "world";
        String msg3 = "java";

        showLog(1, msg1 + msg2 + msg3);
    }
}