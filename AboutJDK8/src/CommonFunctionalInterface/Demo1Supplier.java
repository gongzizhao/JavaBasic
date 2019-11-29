package CommonFunctionalInterface;

import java.util.function.Supplier;

/**
 * @author gongzizhao
 * @date 2019/11/28 16:48
 * java.util.function.Supplier<T>接口仅包含1个无参的方法：T get().
 * 用来获取一个泛型参数指定类型的对象数据
 * 生产型接口
 */
public class Demo1Supplier {
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        String s = getString(() -> "huge");
        System.out.println(s);

        int[] arr = {100, 2, 50, 56, 23};
        int max1 = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中元素的最大值是："+max1);
    }
}
