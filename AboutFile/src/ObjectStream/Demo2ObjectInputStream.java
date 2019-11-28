package ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author gongzizhao
 * @date 2019/11/27 16:26
 */
public class Demo2ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("AboutFile\\src\\ObjectStream\\person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Person p = (Person)o;
        System.out.println(p.getAge());

    }

}
