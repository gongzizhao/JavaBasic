package uploadDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @author gongzizhao
 * @date 2019/11/25 14:53
 *
 * 数据源：客户端上传的文件
 * 目的地：服务器的硬盘 d:\\upload\\1.jpg
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        /*
        让服务器一直处于监听状态（死循环accept方法）
        有一个客户端上传文件，就保存一个文件
        * */
        while (true) {
            Socket socket = server.accept();

            /*
            * 使用多线程技术，提高程序效率
            * 有一个客户端上传文件，就开启一个线程，完成文件上传
            * */
            new Thread(new Runnable() {
                //完成文件上传
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();

                        File file = new File("d:\\upload");
                        if (!file.exists()) {
                            file.mkdir();
                        }
                        /*
                        自定义一个文件的命名规则：防止同名的文件被覆盖
                        规则：域名+毫秒值+随机数
                        * */

                        String fileName = "com" + System.currentTimeMillis() + new Random().nextInt(99999) + ".jpg";

                        FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes,0,len);
                        }

                        socket.getOutputStream().write("success".getBytes());
                        fos.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }

        //server.close();

    }
}
