package sort;

/**
 * @author NiDingbo
 * @date 2020/1/8
 * @des 冒泡排序
 *
 * 冒泡排序解释：
 *
 * 　　冒泡排序是由两个for循环构成，第一个for循环的变量 i 表示总共需要多少轮比较，
 * 第二个for循环的变量 j 表示每轮参与比较的元素下标【0,1，......，length-i】，因为每轮比较都会出现一个最大值放在最右边，所以每轮比较后的元素个数都会少一个，这也是为什么 j 的范围是逐渐减小的。相信大家理解之后快速写出一个冒泡排序并不难。
 *
 * 　　冒泡排序性能分析：
 *
 * 　　假设参与比较的数组元素个数为 N，则第一轮排序有 N-1 次比较，第二轮有 N-2 次，如此类推，这种序列的求和公式为：
 *
 * 　　（N-1）+（N-2）+...+1 = N*（N-1）/2
 *
 * 　　当 N 的值很大时，算法比较次数约为 N2/2次比较，忽略减1。
 *
 * 　　假设数据是随机的，那么每次比较可能要交换位置，可能不会交换，假设概率为50%，那么交换次数为 N2/4。不过如果是最坏的情况，初始数据是逆序的，那么每次比较都要交换位置。
 *
 * 　　交换和比较次数都和N2 成正比。由于常数不算大 O 表示法中，忽略 2 和 4，那么冒泡排序运行都需要 O(N2) 时间级别。
 *
 * 　　其实无论何时，只要看见一个循环嵌套在另一个循环中，我们都可以怀疑这个算法的运行时间为 O(N2)级，
 *     外层循环执行 N 次，内层循环对每一次外层循环都执行N次（或者几分之N次）。这就意味着大约需要执行N2次某个基本操作。
 */

public class BubbleSort {
    /**
     *  参考冒泡
     *  最先冒泡的最小
     *  最后冒泡最大
     * @param temp
     * @return
     */
    public static int[] bubblesort(int[] temp){
        int t;
        for (int i = 0; i<temp.length-1; i++){
            for (int j = i+1; j<temp.length; j++){
                if (temp[i] > temp[j]){
                    t = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }
        }
        return temp;
    }

    public static void main(String [] args){
        int[] a = new int[]{1,243,23,45,123,34};
        a = bubblesort(a);
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

}
