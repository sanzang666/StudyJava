package 跟着老杨学java.方法;


import java.util.Scanner;

public class 评委打分需求 {
    /**
     * 1、案例需求
     * 在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
     * 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。
     *
     * @param args
     */
    public static void main(String[] args) {
        //1.获取6位评委的分数
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的分数");
            arr[i] = sc.nextInt();
        }
        //2.获取总分数
        int sum = getArrSum(arr);
        //3.获取最大分
        int max = getArrMax(arr);
        //4.获取最小分
        int min = getArrMin(arr);
        //5.获取去除最大最小后的平均分
        int result = (sum - max - min) / (arr.length - 2);
        System.out.println(result);
    }

    //数组求和
    public static int getArrSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    //数组获取最小值
    public static int getArrMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    //数组获取最大值
    public static int getArrMax(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
