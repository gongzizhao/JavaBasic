package StreamAndMethodReference.Demo1Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongzizhao
 * @date 2019/11/29 9:59
 * 使用流的方式遍历集合，对集合中的数据进行过滤
 * 关注做什么而不是怎么做
 */
public class Demo2Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("moyan");

        list.stream()
                .filter(name -> name.startsWith("z"))
                .forEach(name->System.out.println(name));

    }
}
