package com.reflect;

import com.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo2 {

    /*
    *
    */
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {

        Class personClass = Person.class;
        /*Field[] fields = personClass.getFields();//获取public类型的成员变量
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("===========");
        Field age = personClass.getField("age");
        Person p = new Person();
        Object v = age.get(p);
        System.out.println(v);
        age.set(p,13);
        System.out.println(p);

        System.out.println("----------------");
        Field[] dFields = personClass.getDeclaredFields();
        for (Field field : dFields) {
            System.out.println(field);
        }

        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        Object n = name.get(p);
        System.out.println(n);
        name.set(p,"---");
        System.out.println(p);

        Constructor constructor = personClass.getConstructor();
        System.out.println(constructor);

        Object person = constructor.newInstance();
        System.out.println(person);

        Object o = personClass.newInstance();*/
        Method eatMethod = personClass.getMethod("eat");
        Person p = new Person();
        eatMethod.invoke(p);

        Method eat = personClass.getMethod("eat", int.class);
        eat.invoke(p,11);

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            System.out.println(method);
            String name=method.getName();
            System.out.println(name);
        }

        String className=personClass.getName();
        System.out.println(className);
    }
}
