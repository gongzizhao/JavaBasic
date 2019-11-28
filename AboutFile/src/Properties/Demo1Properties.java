package Properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @author gongzizhao
 * @date 2019/11/27 14:57
 * java.util.Properties集合extends Hashtable<k,v> implements Map<k,v>
 * Properties集合是一个唯一和IO流相结合的集合
 *     store把集合中的临时数据 持久化写入硬盘中存储
 *     load把硬盘中保存的文件 读取到集合中使用
 */
public class Demo1Properties {
    public static void main(String[] args) throws IOException {
         show3();
    }

    private static void show3() throws IOException {
        Properties prop = new Properties();
        //prop.load(new FileReader("AboutFile\\prop.txt"));
        prop.load(new FileInputStream("AboutFile\\prop.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"..."+value);
        }
    }

    private static void show2() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("zhangsan", "123");
        prop.setProperty("李四", "456");
        prop.setProperty("wangwu", "999");

        //字符流可以写中文
       /* FileWriter fw = new FileWriter("AboutFile\\prop.txt");
        prop.store(fw,"save data");
        fw.close();*/

       //字节流不能写中文
        prop.store(new FileOutputStream("AboutFile\\prop2.txt")," ");

    }

    private static void show1() {
        Properties prop = new Properties();
        prop.setProperty("zhangsan", "123");
        prop.setProperty("lisi", "456");
        prop.setProperty("wangwu", "999");

        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+".."+value);
        }
    }
}
