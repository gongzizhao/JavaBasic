package CommonFunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * @author gongzizhao
 * @date 2019/11/28 21:25
 * 作用：对某种数据类型的数据进行判断，结果返回boolean值
 * boolean test(T t);
 */
public class Demo1Predicate {
    public static boolean checkString(String s, Predicate<String> predicate) {
        return predicate.test(s);
    }

    public static void main(String[] args) {
        String s = "abcde";
        boolean b = checkString(s, str-> str.length() > 5);
        System.out.println(b);
    }
}
