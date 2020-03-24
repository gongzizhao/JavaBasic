public class RadixSort {

    public static void radixSort(int[] array) {
        int max = findMax(array, 0, array.length - 1);

        //需要遍历的次数由数组最大值的位数来决定
        for (int i = 1; max / i > 0; i = i * 10) {
            int[][] buckets = new int[array.length][10];

            //获取每一位数字（个十百千......分配到桶里）
            for (int j = 0; j < array.length; j++) {
                int num = (array[j] / i) % 10;
                //将其放到桶里
                buckets[j][num] = array[j];
            }
            //回收桶里的元素
            int k = 0;
            //有10个桶
            for (int j = 0; j < 10; j++) {
                //对每个桶里的元素进行回收
                for (int l = 0; l < array.length; l++) {
                    //如果桶里有元素就回收（数据初始化为0）
                    if (buckets[l][j] != 0) {
                        array[k++] = buckets[l][j];
                    }
                }
            }
        }
    }

    private static int findMax(int[] array, int l, int r) {
        //如果数组只有一个数，那么最大的就是该数组第一个值了
        if (l == r) {
            return array[l];
        } else {
            int a = array[l];
            int b = findMax(array, l + 1, r);

            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
    }
}
