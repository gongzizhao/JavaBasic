public class Recursive {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 5, 8, 13};
        hanoi(3, 'A', 'B', 'C');
    }
/**
  * @Author: gongzi
  * @Description: 汉诺塔问题
  * @Date: 2020/3/24
  * @Param n: n个盘子
 * @Param start: 起始柱子
 * @Param transfer: 中转柱子
 * @Param target: 目标柱子
  * @return: void
  **/
    private static void hanoi(int n, char start, char transfer, char target) {

        //只有1个盘子，直接搬到目标柱子
        if (n == 1) {
            System.out.println(start + "------>" + target);
        } else {
            //起始柱子借助目标柱子将盘子都移动到中转柱子中（除了最大的盘子）
            hanoi(n - 1, start, target, transfer);
            System.out.println(start + "------>" + target);

            //中转柱子借助起始柱子将盘子都移动到目标柱子中
            hanoi(n - 1, transfer, start, target);
        }
    }
}
