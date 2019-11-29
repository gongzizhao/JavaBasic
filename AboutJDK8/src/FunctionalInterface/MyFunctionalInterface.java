package FunctionalInterface;
/*
* 函数式接口：有且只有1个抽象方法
* 可以有其他的方法（静态，私有，默认）
* FunctionalInterface 检测接口是否是一个函数式接口
* */
@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract void method();

}
