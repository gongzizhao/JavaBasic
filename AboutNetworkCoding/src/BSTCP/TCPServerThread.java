package BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gongzizhao
 * @date 2019/11/26 16:04
 * 在浏览器中访问http://127.0.0.1:8088/Net/html/index.html即可
 * 控制台会输出 找不到一些文件，可忽略
 */
public class TCPServerThread {
    public static void main(String[] args) throws IOException {
        //1.创建1个服务器ServerSocket和系统指定的端口号
        ServerSocket server = new ServerSocket(8080);
        /*
        * 浏览器解析服务器回写的html页面，页面中如果有图片，那么浏览器就会单独的开启一个线程，读取服务器的图片
        * 我们让服务器一直处于监听状态
        *
        * */

        while (true) {
            //2.使用accept方法获取到请求的客户端对象（浏览器）
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //3.使用Socket对象中的方法getInputStream获取到网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
                        //使用网络字节输入流InputStream对象中的方法read读取客户端中的请求信息
                        //把is网络自己输入流对象，转换为字符缓冲输入流
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        //把客户端请求信息的第一行读取出来
                        String line = br.readLine();
                        //把读取的信息进行切割，只要中间部分
                        String[] arr = line.split(" ");
                        //把路径前边的/去掉进行截取
                        String htmlpath = arr[1].substring(1);
                        //创建一个本地字节输入流，构造方法中绑定要读取的html路径
                        FileInputStream fis = new FileInputStream(htmlpath);
                        //使用Socket中的方法getOutputStream获取网络字节输出流OutputStream对象
                        OutputStream os = socket.getOutputStream();
                        //写入HTTP协议响应头
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        //必须写入空行，否则浏览器不解析
                        os.write("\r\n".getBytes());
                        //一读一写复制文件，把服务读取的html文件回写到客户端
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }
                        //释放资源
                        fis.close();
                        socket.close();
                        //server.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }


    }

}
