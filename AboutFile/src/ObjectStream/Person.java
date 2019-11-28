package ObjectStream;

import java.io.Serializable;

/**
 * @author gongzizhao
 * @date 2019/11/27 16:19
 * 序列化和反序列化 需要启动java.io.Serializable接口：标记型接口
 *
 * static:静态优先于非静态加载到内存中，不能被序列化，因为不是对象
 * transient:瞬态  不能被序列化，但没有static的功能
 */
public class Person implements Serializable {
    /*
    * 手动添加可序列化类的序列号，
    * 保证类的修改不会导致person.txt和Person.class的序列号冲突
    * */
    static final long serialVersionUID = 1L;
    private String name;
    private /*static*/ int age;
    /*private transient int age;*/

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
