package 跟着老杨学java.方法;

//import org.jetbrains.annotations.NotNull;

import java.util.Arrays;


public class 练习 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 54, 32, 2};
        int num = 2;
        System.out.println(getNumIndex(arr, num));
        System.out.println(Arrays.toString(overturn(arr)));
    }

    //需求 给出一个数组 一个数字  获取该数字在数组中的索引值  如果未找到则返回-1
    public static int getNumIndex(int[] arr, int num) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
            }
        }
        return index;
    }

    //需求 给出一个数组 将数组翻转
    public static int[] overturn(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        return arr;
    }
}
