package com.example.lib;

import java.util.Arrays;

/**
 * Created by Glory on 2018/5/9.
 */

public class MianClasssss {
    public static int original[] = {10, 6, 12, 7, 1, 5, 3, 8, 9, 21, -4, -9, 3, 4, 17, 12};

    public static void main(String[] args) {
        System.out.println("faesssssssss");
        System.out.println("main" + Arrays.toString(qsort(original, 0, original.length - 1)));
    }

    public static int[] qsort(int[] original, int start, int end) {
        int count = original.length;
        int low = start;
        int high = end;
        int povit = original[low];//选一个作为初始值original[0]
        if (high - low <= 1) return original;
        while (low < high) {
            while (low < high && original[high] >= povit) {
                high--;//这步操作---从后往前找,找到第一个小于轴的数
            }
            //交换操作
            if (low < high) {
                int temp = original[high];
                original[high] = original[low];
                original[low] = temp;
                low++;
            }
            //以上是从后往前找的
            //-----------------------------------------------------
            while (low < high && original[low] <= povit)
                low++;
            if (low < high) {
                int temp = original[high];
                original[high] = original[low];
                original[low] = temp;
                high--;
            }
        }
        //外部循环一轮后 low==higt了

        System.out.println("high=" + high + "/low=" + low + "/" + Arrays.toString(original));
        //递归--继续排序
        if (low > start) {
            qsort(original, start, low - 1);
        }
        if (end > high) qsort(original, high + 1, end);
        return original;
    }

    public static String printArray(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
        }
        return new String(builder);
    }
}

class Quick {
    public void sort(int arr[], int low, int high) {
        int l = low;
        int h = high;
        int povit = arr[low];

        while (l < h) {
            while (l < h && arr[h] >= povit)
                h--;
            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                l++;
            }

            while (l < h && arr[l] <= povit)
                l++;

            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                h--;
            }
        }
        System.out.print(arr);
        System.out.print("l=" + (l + 1) + "h=" + (h + 1) + "povit=" + povit + "\n");
        if (l > low) sort(arr, low, l - 1);//l位置是上一轮的轴,不用再进行排序
        if (h < high) sort(arr, l + 1, high);
    }
}