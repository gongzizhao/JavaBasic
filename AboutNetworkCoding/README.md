服务器端必须明确2件事情：

1. 在服务器种有1个方法，叫accept客户端获取到请求的客户端对象
2. 多个客户端和服务器进行交互，需要使用多个IO流对象，字节流
   - 服务器没有IO流，使用客户端Socket种提供的IO流与客户端进行交互
   
===========uploadDemo   

C/S：客户端读取本地的文件，把文件上传到服务器，服务器再把上传的文件保存到服务器的硬盘上
![img](https://github.com/gongzizhao/NetworkCoding/raw/master/Net/images/CSTCP.png)

===========BSTCP    

B/S：服务器要给客户端回写一个信息，回写一个html页面（文件）
![img](https://github.com/gongzizhao/NetworkCoding/raw/master/Net/images/BSTCP.png)
