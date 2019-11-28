package PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author gongzizhao
 * @date 2019/11/28 10:11
 *
 * System.setOut方法可以改变输出语句的目的地改为参数中传递的打印流的目的地
 */
public class DemocracyPrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("console output...");
        PrintStream ps = new PrintStream("AboutFile\\src\\PrintStream\\print1.txt");
        System.setOut(ps);
        System.out.println("printStream output...");
        ps.close();

    }

}
