package LambdaForArray;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author gongzizhao
 * @date 2019/11/24 17:37
 * Lambda表达式有参数有返回值的情况
 *
 * 需求：
 *     使用数组存储多个Person对象
 *     对数组中的Person对象使用Array的sort方法通过年龄进行升序排序
 */
public class Demo1Arrays {
    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] arr = {
                new Person("angle", 55),
                new Person("bange", 59),
                new Person("comin", 22)
        };
        //对数组中的Person对象使用Array的sort方法通过年龄进行升序排序
        Arrays.sort(arr,new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        /*//使用Lambda表达式简化匿名内部类
        Arrays.sort(arr,(Person o1,Person o2)->{
            return  o1.getAge()-o2.getAge();
        });*/

        //遍历数组
        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
