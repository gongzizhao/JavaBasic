public class Sort {

    private void bubbleSort(int[] array) {
        int temp;

        //记录是否发生了置换
        int isChange;

        //记录执行了多少趟
        int num = 0;
        for (int i = 0; i < array.length; i++) {

            //每比较一趟就重新初始化为0
            isChange = 0;

            //内层循环时当前趟需要比较的次数
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    //如果进到此处，说明发生置换
                    isChange = 1;
                }
            }

            //如果比较一趟没有发生置换，那么说明排序已经成功，不需要再次执行
            if (isChange == 0) {
                break;
            }
            num++;
        }
        System.out.println("执行了" + num + "次");
    }

    private void selectSort(int[] array) {
        //记录当前趟最大值的角标
        int pos;

        int temp;
        for (int i = 0; i < array.length - 1; i++) {

            //新的趟数，将角标重新赋值为0
            pos = 0;

            //内层循环控制遍历数组的个数并得到最大数的角标
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[pos]) {
                    pos = j;
                }
            }
            if (pos != array.length - 1 - i) {
                temp = array[pos];
                array[pos] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
    }

    private void insertSort(int[] array) {
        int temp;

        //外层循环控制需要排序的趟数
        for (int i = 0; i < array.length; i++) {
            temp = array[i];

            //如果前一位比当前数据要大，那么就进入循环比较
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {

                //往后退，让当前数据与之前前位进行比较
                array[j + 1] = array[j];

                //不断往前直至退出循环
                j--;
            }

            //退出循环代表已经找到了合适的位置，将其插入进来
            array[j + 1] = temp;
        }
    }

    private void quickSort(int[] array, int l, int r) {
        int i = l;
        int j = r;

        //支点
        int pivot = array[(l + r) / 2];
        //左右两端进行扫描，只要两端还没有交替，就一直扫描
        while (i <= j) {
            //寻找比支点大的数
            while (pivot > array[i]) {
                i++;
            }
            while (pivot < array[j]) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        //上面while保证了第一趟排序支点的左边比支点小，右边比支点大

        //左边再做排序，直到剩下1个数（递归出口）
        if (l < j) {
            quickSort(array, l, j);
        }

        //右边再做排序，直到剩下1个数
        if (i < r) {
            quickSort(array, i, r);
        }

    }

    public static void shellSort(int[] array) {
        //增量每次都/2
        for (int step = array.length / 2; step > 0; step /= 2) {
            //从增量那组开始进行插入排序，直至完毕
            for (int i = step; i < array.length; i++) {
                int j = i;
                int temp = array[j];

                //j-step就是代表与他同组隔壁的元素
                while (j - step >= 0 && array[j - step] > temp) {
                    array[j] = array[j - step];
                    j = j - step;
                }
                array[j] = temp;
            }
        }
    }

}
