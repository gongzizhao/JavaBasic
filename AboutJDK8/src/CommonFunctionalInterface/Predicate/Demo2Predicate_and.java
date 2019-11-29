package CommonFunctionalInterface.Predicate;

import java.util.function.Predicate;

/**
 * @author gongzizhao
 * @date 2019/11/28 21:31
 */
public class Demo2Predicate_and {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        //return pre1.test(s) && pre2.test(s);
        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "abcded";
        boolean a = checkString(s, (message) -> {
            return message.length() > 5;
        }, (message) -> {
            return message.contains("a");
        });
        System.out.println(a);
    }
}
