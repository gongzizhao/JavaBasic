package demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author gongzizhao
 * @date 2019/11/25 11:24
 * TCP通信的客户端：向服务器段发送连接请求，给服务器发送数据，读取服务器回写的数据
 * java.net.Socket:此类实现客户端套接字
 * 构造方法：Socket(String host,int port)
 * 成员方法：OutputStream getOutputStream()  InputStream getInputStream()  void close();
 * 注意：
 *     1.客户端与服务器进行交互，必须使用Socket种提供的网络流，不能使用自己创建的流对象
 *     2.服务器必须先启动，否则抛异常
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建1个客户端对象Socket
        Socket socket = new Socket("127.0.0.1", 8888);
        //2.使用Socket对象种的方法，获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();
        //3.给服务器发送数据
        os.write("hello,server".getBytes());
        //4.获取网络字节对象
        InputStream is = socket.getInputStream();
        //5.使用网络字节输入流InputStream对象中的方法read读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //6.释放资源
        socket.close();
    }

}
