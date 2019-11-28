必须明确2件事情：
1.过滤器中的accept方法是谁调用的？
2.accept方法的参数pathname是什么？

java.io.FileFilter接口：用于抽象路径名（File对象）的过滤器
 * boolean accept(File pathName) 测试指定抽象路径名是否应该包含再某个路径名列表中
 *     参数：使用listFiles方法遍历目录得到的每一个文件对象

 java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
  *     boolean accept(File dir,String name) 测试指定文件是否应该包含在某一文件列表中。
  *         参数：dir:构造方法中传递的被遍历的目录
  *              String name：使用listFiles方法遍历目录获取每一个文件/文件夹的名称
  *              两个接口没有实现类，需要自己写实现类，重写过滤的方法，accept，在方法中自己定义过滤的规则