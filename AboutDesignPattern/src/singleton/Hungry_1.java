package singleton;

//饿汉式(静态变量)
public class Hungry_1 {
    //1. 构造器私有化, 外部不能new
    private Hungry_1() {

    }

    //2.本类内部创建对象实例
    private final static Hungry_1 instance = new Hungry_1();

    //3. 提供一个公有的静态方法，返回实例对象
    public static Hungry_1 getInstance() {
        return instance;
    }
}
/*
* 优缺点说明：
优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费

这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，在单例模式中大多数都是调用getInstance方法， 但是导致类装载的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance就没有达到lazy loading的效果

结论：这种单例模式可用，可能造成内存浪费

* */