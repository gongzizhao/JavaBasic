package CommonFunctionalInterface.Comsumer;

import java.util.function.Consumer;

/**
 * @author gongzizhao
 * @date 2019/11/28 17:06
 * 消费型接口
 * java.util.function.Consumer<T>
 *     void accept(T t)消费一个指定泛型的数据，且需要自定义
 */
public class Demo1Consumer {
    public static void method(String name, Consumer<String> consumer) {
        consumer.accept(name);
    }

    public static void main(String[] args) {
        method("zhangsan",(String name)->{
            //自定义消费传递的字符串
            System.out.println(name);

            //消费方式：字符串反转输出
            String newName = new StringBuffer(name).reverse().toString();
            System.out.println(newName);
        });
    }
}
