编程思想：  
1. 面向对象：做一件事情，找一个能解决这个事情的对象，调用对象的方法完成事情。  
2. 函数式编程：只要能获取到结果即可，who，how都不重要，重视结果，不重视过程。  

Lambda使用前提：  
1. 必须具有接口，且接口中只有1个抽象方法  
2. 必须具有上下文推断：也即方法的参数或者局部变量类型必须为Lambda对应的接口类型  
* 有且只有1个抽象方法的接口，成为“函数式接口”。