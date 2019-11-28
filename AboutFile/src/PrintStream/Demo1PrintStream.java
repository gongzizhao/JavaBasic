package PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author gongzizhao
 * @date 2019/11/28 10:04
 * 打印流：
 * 1.只负责数据的输出
 * 2.永远不会抛出IOException
 * 3.有特有的方法：print，println
 */
public class Demo1PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("AboutFile\\src\\PrintStream\\print.txt");
        ps.write(97);//使用继承自父类的write方法写数据，那么查看数据的时候会查看编码表
        ps.println(97);//使用自己特有的方法print/println，写的数据原样输出
        ps.close();

    }
}
