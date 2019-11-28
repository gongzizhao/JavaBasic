package FileFilter;

import java.io.File;

/**
 * @author gongzizhao
 * @date 2019/11/27 10:27
 * java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器
 * boolean accept(File pathName) 测试指定抽象路径名是否应该包含再某个路径名列表中
 *     参数：使用listFiles方法遍历目录得到的每一个文件对象
 *     File[] listFiles(FilenameFilter filter)
 *     java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
 *     boolean accept(File dir,String name) 测试指定文件是否应该包含在某一文件列表中。
 *         参数：dir:构造方法中传递的被遍历的目录
 *              String name：使用listFiles方法遍历目录获取每一个文件/文件夹的名称
 *              两个接口没有实现类，需要自己写实现类，重写过滤的方法，accept，在方法中自己定义过滤的规则
 */
public class Demo1Filter {
    public static void main(String[] args) {
        File file = new File("F:\\books");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        //System.out.println(dir);
        File[] files = dir.listFiles(new FileFilterImpl());//传递过滤器对象
        /*
        * listFiles方法的作用
        * 1.对构造方法中传递的目录进行遍历，获取目录中的每一个文件/文件夹，封装为File对象
        * 2.调用参数传递的过滤器中的accept方法
        * 3.把遍历得到的每一个File对象传递给accept中的pathname
        * */

        /*
        accept方法返回true时，传过去的File对象会存到files数组中
        * */
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {

                    System.out.println(file);

            }
        }
    }

}
