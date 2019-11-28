package ObjectStream;

import java.io.*;
import java.util.ArrayList;

/**
 * @author gongzizhao
 * @date 2019/11/27 19:52
 * 序列化集合
 * 若要在文件中保存多个对象，可以把这些对象存储到1个集合中，对集合进行序列化反序列化
 */
public class Demo3Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("zhangsan", 18));
        list.add(new Person("里斯", 32));
        list.add(new Person("王五", 15));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("AboutFile\\src\\ObjectStream\\list.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("AboutFile\\src\\ObjectStream\\list.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list1 = (ArrayList<Person>)o;
        for (Person p : list1) {
            System.out.println(p);
        }
        ois.close();
        oos.close();
    }
}
