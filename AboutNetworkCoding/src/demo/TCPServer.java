package demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gongzizhao
 * @date 2019/11/25 11:37
 * TCP通信的服务器端
 * java.net.ServerSocket实现服务器套接字
 * 构造方法：ServerSocket(int port):创建绑定到特定端口的服务器套接字
 * 使用accept方法获取到请求的客户端对象Socket
 * 成员方法：
 *     Socket accpet():侦听并接受到此套接字的连接
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建服务器ServerSocket对象和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        //2.使用ServerSocket对象中的方法accept获取到请求的客户端对象Socket
        Socket socket = server.accept();
        //3.使用Socket对象中的方法getInputStream获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //4.使用网络字节输入流InputStream对象中的方法read，读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //5.获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //6.给客户端回写数据
        os.write("roger".getBytes());
        //7.释放资源
        socket.close();
        server.close();
    }


}
