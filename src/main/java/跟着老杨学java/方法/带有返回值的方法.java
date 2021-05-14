package 跟着老杨学java.方法;

public class 带有返回值的方法 {
    /**
     * 学习带有返回值的方法
     *
     * @param args
     */
    public static void main(String[] args) {
        int result = getMax(101, 20);
        System.out.println(result);
    }

    //需求：给出两个数  对比大小  数据来源方法的形参
    public static int getMax(int num1, int num2) {
        return Math.max(num1, num2);
    }
}
