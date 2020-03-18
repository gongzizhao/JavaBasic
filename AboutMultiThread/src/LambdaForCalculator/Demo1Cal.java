package LambdaForCalculator;

/**
 * @author gongzizhao
 * @date 2019/11/25 9:23
 * Lambda有参数有返回值
 * 需求：
 *    给定1个计算器Calculator接口，内含抽象方法cal可以将两个int数字相加得到和
 *    使用Lambda标准格式调用invokeCal方法，完成2数相加
 */
public class Demo1Cal {
    public static void main(String[] args) {
        /*Calculator c=new Calculator() {
            @Override
            public int cal(int a, int b) {
                return a+b;
            }
        };
        invokeCal(10,20,c);*/
        /*invokeCal(10, 20, new Calculator() {
            @Override
            public int cal(int a, int b) {
                return a+b;
            }
        });*/
        invokeCal(10,20,(a,b)->a+b);
    }

    public static void invokeCal(int a, int b, Calculator calculator) {
        int sum = calculator.cal(a, b);
        System.out.println(sum);
    }
}
