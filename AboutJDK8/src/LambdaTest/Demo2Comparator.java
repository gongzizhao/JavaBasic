package LambdaTest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author gongzizhao
 * @date 2019/11/28 16:18\
 * 函数式接口作为方法的返回值类
 *
 */
public class Demo2Comparator {
    //获取一个java.util.Comparator接口类型的对象作为排序器
    public static Comparator<String> getComparator() {
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按字符串的降序排序
                return o2.length()-o1.length();
            }
        };*/
        //方法的返回值类型是函数式接口，故可以返回一个Lambda表达式
        /*return (String o1,String o2)->{
            return o2.length()-o1.length();
        };*/
        //优化
        return (o1,o2)->o2.length()-o1.length();
    }
    public static void main(String[] args) {
        String[] arr = {"aaa", "b", "cccccc", "dd"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, getComparator());
        System.out.println(Arrays.toString(arr));

    }
}
