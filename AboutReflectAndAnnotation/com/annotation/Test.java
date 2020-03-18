package com.annotation;

import java.lang.reflect.Method;

@Pro(className = "com.annotation.Demo1",methodName = "show")
public class Test {

    public static void main(String[] args) throws Exception {

        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<Test> testClass = Test.class;
        //2.获取上面的注解对象
        //其实就是内存中生成了1个该注解接口的子类实现对象


        Pro an = testClass.getAnnotation(Pro.class);
        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        //4.加载该类进内存
        Class cls = Class.forName(className);
        //5.创建实例对象
        Object obj = cls.newInstance();
        //6.获取方法对象
        Method method = cls.getMethod(methodName);
        //7.执行方法
        method.invoke(obj);
    }
}
