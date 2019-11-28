package Recursion;

import java.io.File;

/**
 * @author gongzizhao
 * @date 2019/11/27 10:11
 * 遍历文件夹的子文件夹和子文件
 */
public class Demo1Recursion {
    public static void main(String[] args) {
        File file = new File("F:\\books");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        //System.out.println(dir);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                /*
                只要.java结尾的文件
                1.要把File对象转为字符串对象
                */
                /*String s = file.toString();
                //2.调用String类中的endsWith判断字符串是否以.java结尾
                boolean b = s.endsWith(".java");
                if (b) {
                    System.out.println(file);
                }*/
                if (file.getName().toLowerCase().endsWith(".java")) {
                    System.out.println(file);
                }

            }
        }
    }
}
