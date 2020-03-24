public class MergeSort {

    public static void mergeSort(int[] array, int l, int r) {
        //如果只有1个元素，那就不用排序
        if (l == r) {
            return;
        } else {
            //取中间的数进行拆分
            int m = (l + r) / 2;

            //左右两边的数不断进行拆分
            mergeSort(array, l, m);
            mergeSort(array, m + 1, m);

            //合并
            merge(array, l, m + 1, r);
        }
    }


    private static void merge(int[] array, int l, int m, int r) {

        //左右两边数组的大小
        int[] leftArray = new int[m - l];
        int[] rightArray = new int[r - m + 1];

        //往这两个数组填充数据
        for (int i = l; i < m; i++) {
            leftArray[i - l] = array[i];
        }
        for (int i = m; i <= r; i++) {
            rightArray[l - m] = array[i];
        }

        int i = 0, j = 0;
        //array数组的第一个元素
        int k = l;

        //比较这两个数组的值，哪个小就往数组上放
        while (i < leftArray.length && j < rightArray.length) {
            //谁比较小，谁将元素放入大数组中，移动指针，继续比较下一个
            if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i];
                i++;
                k++;
            } else {
                array[k] = rightArray[j];
                j++;
                k++;
            }
        }

        //如果左边的数组还没比较完，右边已经完成，就把左边的数抄到大数组中（剩下的都是大数字）
        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        //如果右边的数组还没比较完，左边已经完成，就把右边的数抄到大数组中（剩下的都是大数字）
        while (j < rightArray.length) {
            array[k] = rightArray[j];
            k++;
            j++;
        }
    }

}
