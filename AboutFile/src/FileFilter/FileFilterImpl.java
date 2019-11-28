package FileFilter;

import java.io.File;
import java.io.FileFilter;

/**
 * @author gongzizhao
 * @date 2019/11/27 14:20
 * 创建过滤器FileFilter的实现类，重写过滤方法accept，定义过滤规则
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        /*
        * 过滤规则：
        * 判断File对象是否以.java结尾
        * 是就返回true，否则false
        * */
        if (pathname.isDirectory()) {  //使文件夹也能传递到调用此方法的files数组中
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".db");
    }
}
