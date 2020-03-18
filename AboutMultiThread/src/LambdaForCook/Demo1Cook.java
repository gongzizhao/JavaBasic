package LambdaForCook;

/**
 * @author gongzizhao
 * @date 2019/11/24 17:30
 * 需求：
 *     给定一个Cook接口，内涵唯一的抽象方法makeFood，且无参数，无返回值
 *     使用Lambda的标准格式调用invokeCook方法，打印输出“eating”
 */
public class Demo1Cook {
    public static void main(String[] args) {
        invokeCook(()->{
            System.out.println("eating");
        });

    }
    //定义1个方法，参数传递Cook接口，方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
