package sort;

/**
 * @author NiDingbo
 * @date 2020/1/8
 * @des 选择排序
 *
 *  第一次选择第一小的值放到第一位
 *  第二次选择第二小的值放在第二位
 *  以此类推
 *
 *  　选择排序和冒泡排序执行了相同次数的比较：N*（N-1）/2，但是至多只进行了N次交换。
 *
 * 　　当 N 值很大时，比较次数是主要的，所以和冒泡排序一样，用大O表示是O(N2) 时间级别。
 * 但是由于选择排序交换的次数少，所以选择排序无疑是比冒泡排序快的。当 N 值较小时，如果交换时间比选择时间大的多，那么选择排序是相当快的。
 *
 *
 */
public class SelectionSort {

    public static int[] selectionSort(int[] temp){
        int t;
        for (int i = 0; i < temp.length - 1; i++){
            for (int j = i + 1; j < temp.length - 1; j++){
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
        int[] a = new int[]{1,3,2,4};
        a = selectionSort(a);
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
