public class HeapSort {

    public static void main(String[] args) {
        int[] array = {3, 2, 4, 7, 52423443, 4, 453, -34, 412};

        maxHeapify(array, array.length - 1);
        int size = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            //交换
            int temp = array[0];
            array[0] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

            //调整位置
            heapify(array, 0, size);
            size--;
        }
        for (int a : array) {
            System.out.println(a);
        }
    }

    /*
    * 完成一次建堆，最大值在堆的顶部
     */
    private static void maxHeapify(int[] array, int size) {
        for (int i = size - 1; i >= 0; i--) {
            heapify(array, i, size);
        }
    }

/**
  * @Author: gongzi
  * @Description: 建堆
  * @Date: 2020/3/24
  * @Param array: 要排序的数组，看作是完全二叉树
 * @Param currentRootNode: 当前父节点位置
 * @Param size: 结点总数
  * @return: void
  **/
    private static void heapify(int[] array, int currentRootNode, int size) {
        if (currentRootNode < size) {
            //左子树和右子树的位置
            int left = 2 * currentRootNode + 1;
            int right = 2 * currentRootNode + 2;

            //把当前父节点位置看成是最大的
            int max = currentRootNode;

            if (left < size) {
                //如果比当前根元素要大，记录位置
                if (array[max] < array[left]) {
                    max = left;
                }
            }
            if (right < size) {
                //如果比当前根元素大，则记录位置
                if (array[max] < array[right]) {
                    max = right;
                }
            }
            //如果最大的不是根元素位置，则交换
            if (max != currentRootNode) {
                int temp = array[max];
                array[max] = array[currentRootNode];
                array[currentRootNode] = temp;

                //继续比较，知道完成一次建堆
                heapify(array, max, size);
            }
        }
    }
}
