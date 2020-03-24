package singleton;

//使用枚举，可以实现单例, 推荐
enum EnumSingleton {
    INSTANCE; //属性
    public void sayOK() {
        System.out.println("ok~");
    }
}
/*
* 优缺点说明：

这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
这种方式是Effective Java作者Josh Bloch 提倡的方式
结论：推荐使用
*/