package StreamAndMethodReference.Demo2Stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author gongzizhao
 * @date 2019/11/29 10:27
 */
public class Demo1GetStream {
    public static void main(String[] args) {
        //1.把集合转换为Stream流 用stream方法
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String, String> map = new HashMap<>();
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        //把数组转换为Stream流
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
        //可变参数传递数组
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> stream7 = Stream.of(arr);
        String[] arr1 = {"aaa", "bb", "c"};
        Stream<String> stream8 = Stream.of(arr1);
        System.out.println(stream8);

    }
}
