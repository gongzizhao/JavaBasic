package FunctionalInterface;

/**
 * @author gongzizhao
 * @date 2019/11/28 10:46
 * 函数式接口的使用：一般可以作为方法的参数和返回值类型
 */
public class Demo1 {
    public static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        //方法的参数是一个接口，所以可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());
        //可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });
       /* 可以使用Lambda表达式,
         1.可以当作匿名内部类的语法糖
         2.没有加载匿名内部类的class文件
        */
        show(()->System.out.println("使用Lambda重写接口中的抽象方法"));
    }
}
