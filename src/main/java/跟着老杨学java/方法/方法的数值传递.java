package 跟着老杨学java.方法;


import java.util.Arrays;

public class 方法的数值传递 {
    /**
     * 基本参数类型传递 形参的改变不影响实际参数的值
     * 引用类型参数传递  形参的改变影响实际参数的值
     *
     * @param args
     */
    public static void main(String[] args) {
        //test1
        int num = 100;
        int[] arr = {1, 2, 3, 4};
        System.out.println(num);
        chang(num);
        System.out.println(num);
        System.out.println("*********************");
        System.out.println(Arrays.toString(arr));
        chang(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void chang(int num) {
        num = 200;
    }

    public static void chang(int[] num) {
        num[1] = 100;
    }
}
