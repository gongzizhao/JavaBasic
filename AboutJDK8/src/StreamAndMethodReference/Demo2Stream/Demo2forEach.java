package StreamAndMethodReference.Demo2Stream;

import java.util.stream.Stream;

/**
 * @author gongzizhao
 * @date 2019/11/29 11:09
 * Stream流中的常用方法
 * void forEach(Consumer<? super T> action)
 * 把每一个流元素交给Consumer（消费型函数式接口）接口函数进行处理
 */
public class Demo2forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("zhangsan", "lisi", "wangwu");
        //使用forEach对Stream流中的数据进行遍历
        stream.forEach(name -> System.out.println(name));
    }
}
