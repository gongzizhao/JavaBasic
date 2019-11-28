package FileFilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * @author gongzizhao
 * @date 2019/11/27 14:40
 */
public class Demo2InnerFilter {
    public static void main(String[] args) {
        File file = new File("F:\\books");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        //System.out.println(dir);
        //优化：使用匿名内部类
       /* File[] files = dir.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                //过滤规则：pathname是文件夹或者.java结尾的文件返回true
                return pathname.getName().toLowerCase().endsWith(".java")||pathname.isDirectory();
            }
        });//传递过滤器对象*/
        File[] files =dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith(".java");
            }
        });
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
