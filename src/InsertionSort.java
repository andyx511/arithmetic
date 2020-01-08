/**
 * @author NiDingbo
 * @date 2020/1/8
 * @des
 * 插入排序
 *  每一步都将待排序的元素插入到已经排序好了的序列中去
 *  　在第一轮排序中，它最多比较一次，第二轮最多比较两次，一次类推，第N轮，最多比较N-1次。因此有 1+2+3+...+N-1 = N*（N-1）/2。
 *
 * 　　假设在每一轮排序发现插入点时，平均只有全体数据项的一半真的进行了比较，我们除以2得到：N*（N-1）/4。用大O表示法大致需要需要 O(N2) 时间级别。
 *
 * 　　复制的次数大致等于比较的次数，但是一次复制与一次交换的时间耗时不同，所以相对于随机数据，插入排序比冒泡快一倍，比选择排序略快。
 *
 * 　　这里需要注意的是，如果要进行逆序排列，那么每次比较和移动都会进行，这时候并不会比冒泡排序快。
 *
 *
 */
public class InsertionSort {
    public static int[] insertionSort(int[] temp){
        int j;
        for (int i = 1; i < temp.length; i++ ){
            int t = temp[i];
            j = i;
            while (j>0 && t < temp[j-1]){
                temp[j] = temp[j-1];
                j--;
            }
            temp[j] = t;
        }
        return temp;
    }

    public static void main(String [] args){
        int[] a = new int[]{1,3,2,4};
        a = insertionSort(a);
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
