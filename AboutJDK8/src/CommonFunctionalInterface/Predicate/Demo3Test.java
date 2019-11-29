package CommonFunctionalInterface.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author gongzizhao
 * @date 2019/11/28 21:44
 */
public class Demo3Test {
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if (b) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"zhangsan,男", "lisi,女"};
        ArrayList<String> filter = filter(arr, (String s) -> {
            return s.split(",")[1].equals("女");
        }, (String s) -> {
            return (s.split(",")[0].length() == 4);
        });
        for (String s : filter) {
            System.out.println(s);

        }
    }
}
