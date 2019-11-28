package ReverseStream;

import java.io.*;

/**
 * @author gongzizhao
 * @date 2019/11/27 15:46
 * 转换流
 * 需求：转换文件编码：
 *     把GBK编码的文本文件，转换为UTF-8编码的文本文件
 */
public class Demo4Test {
    public static void main(String[] args) throws Exception {
        //创建InputStream对象，构造方法中传递字节输入流和指定的编码表名称GBK
        InputStreamReader isr = new InputStreamReader(new FileInputStream("AboutFile\\src\\ReverseStream\\GBK文本.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("AboutFile\\src\\ReverseStream\\utf-8文件.txt"), "utf-8");
        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }
        osw.close();
        isr.close();

    }
}
