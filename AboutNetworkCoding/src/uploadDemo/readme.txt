TCP通信的文件上传案例
原理：客户端读取本地的文件，把文件上传到服务器，服务器再把上传的文件保存到服务器的硬盘上

文件上传的原理，就是文件的复制

注意：
    客户端和服务器和本地硬盘进行读写，需要使用自己创建的字节流i对象（本地流）
    读写必须使用Socket中提供的字节流对象（网络流）

