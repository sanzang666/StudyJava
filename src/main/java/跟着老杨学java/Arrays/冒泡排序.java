package 跟着老杨学java.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 5};
        System.out.println(Arrays.toString(arr));

        //循环数组长度-1次
        for (int i = 0; i < arr.length - 1; i++) {
            //每次循环对比长度-1
            for (int x = 0; x < arr.length - 1 - i; x++) {
                if (arr[x] > arr[x + 1]) {
                    int temp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
