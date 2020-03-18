package com.reflect;

import com.domain.Person;

public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException {
        //多用于配置文件，将类名定义在配置文件中，读取文件加载类
        Class cls = Class.forName("com.domain.Person");
        //多用于参数的传递
        Class cls2 = Person.class;
        //多用于对象的获取字节码的方式
        Person p = new Person();
        Class cls3 = p.getClass();

        System.out.println(cls==cls2);
        System.out.println(cls3==cls2);

    }
}
