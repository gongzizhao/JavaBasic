package uploadDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author gongzizhao
 * @date 2019/11/25 14:45
 */
public class TCPClient {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("f:\\picture.jpg");
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes,0,len);
        }//不会上传-1，故而当服务器读取不到-1的时候会阻塞

        /*
        * 解决：上传完文件，给服务器写一个结束标记
        * void shutdownOutput()禁用此套接字的输出流
        * 对于TCP套接字，任何以前写入的数据都将被发送，并且后跟TCP的正常连接中止序列
        * */
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }

        fis.close();
        socket.close();

    }
}
