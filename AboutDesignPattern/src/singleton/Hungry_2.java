package singleton;

//饿汉式(静态变量)
public class Hungry_2 {
    //1. 构造器私有化, 外部不能new
    private Hungry_2() {

    }


    //2.本类内部创建对象实例
    private  static Hungry_2 instance;

    static { // 在静态代码块中，创建单例对象
        instance = new Hungry_2();
    }

    //3. 提供一个公有的静态方法，返回实例对象
    public static Hungry_2 getInstance() {
        return instance;
    }
}
/*
* 优缺点说明：

这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
结论：这种单例模式可用，但是可能造成内存浪费
*/