package singleton;

public class Lazy_doubleCheck {
    private static volatile Lazy_doubleCheck instance;

    private Lazy_doubleCheck() {}

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率,避免反复进行方法同步, 推荐使用

    public static synchronized Lazy_doubleCheck getInstance() {
        if(instance == null) {
            synchronized (Lazy_doubleCheck.class) {
                if(instance == null) {
                    instance = new Lazy_doubleCheck();
                }
            }

        }
        return instance;
    }
}
/*
优缺点说明：

Double-Check概念是多线程开发中常使用到的，如代码中所示，我们进行了两次if (singleton == null)检查，这样就可以保证线程安全了。
这样，实例化代码只用执行一次，后面再次访问时，判断if (singleton == null)，直接return实例化对象，也避免的反复进行方法同步.
线程安全；延迟加载；效率较高
结论：在实际开发中，推荐使用这种单例设计模式

* */
