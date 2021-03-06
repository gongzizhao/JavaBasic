package StreamAndMethodReference.Demo1Stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gongzizhao
 * @date 2019/11/29 9:51
 */
public class Demo1List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("moyan");

        //对集合中的元素进行操作时，用循环是方式，而非目的
        List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("z")) {
                list1.add(s);
            }
        }
        System.out.println(list1);
    }
}
