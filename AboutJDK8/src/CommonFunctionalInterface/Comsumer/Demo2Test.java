package CommonFunctionalInterface.Comsumer;

import java.util.function.Consumer;

/**
 * @author gongzizhao
 * @date 2019/11/28 17:15
 */
public class Demo2Test {

    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }
    public static void main(String[] args) {
        String[] arr = {"zhangsan,男", "lisi,女"};
        printInfo(arr,(message)->{
            String name = message.split(",")[0];
            System.out.println("name:"+name);
        },(message)->{
            String age = message.split(",")[1];
            System.out.println("age:" + age);
        });
    }
}
