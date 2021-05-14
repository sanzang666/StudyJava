package 跟着老杨学java.数组;

public class 遍历数组 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int j : arr) {
            System.out.println(j);
        }

        /*
        需求： 找出数组中最大的值
         */
        int[] arr1 = {1, 3, 9, 5, 7, 8};
        int num = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (num < arr1[i]) {
                num = arr1[i];
            }
        }
        System.out.println("数组中最大值为：" + num);
    }
}
