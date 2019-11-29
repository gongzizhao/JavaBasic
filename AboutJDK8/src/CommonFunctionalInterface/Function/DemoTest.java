package CommonFunctionalInterface.Function;

import java.util.function.Function;

/**
 * @author gongzizhao
 * @date 2019/11/28 21:59
 */
public class DemoTest {
    public static int change(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        String str = "zhangsan,30";
        int number = change(str, (s) -> s.split(",")[1], (s) -> Integer.parseInt(s), (i) -> i + 100);

        System.out.println(number);
    }
}
