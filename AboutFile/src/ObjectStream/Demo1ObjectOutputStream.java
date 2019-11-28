package ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author gongzizhao
 * @date 2019/11/27 16:07
 * java.io.ObjectOutputStream extends OutputStream
 * ObjectOutputStream:对象的序列化流
 * 作用：把对象以流的方式写入文件中保存
 *
 */
public class Demo1ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("AboutFile\\src\\ObjectStream\\person.txt"));
        oos.writeObject(new Person("zhangsan", 18));
        oos.close();
    }

}
