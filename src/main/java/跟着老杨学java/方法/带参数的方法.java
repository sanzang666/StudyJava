package 跟着老杨学java.方法;

public class 带参数的方法 {
    /**
     * 学习带有参数的方法
     *
     * @param args
     */
    public static void main(String[] args) {
        getMax(101, 20);
    }

    //需求：给出两个数  对比大小  数据来源方法的形参
    public static void getMax(int num1, int num2) {
        //使用三元表达式
        System.out.println(num1 > num2 ? num1 : num2);
        // 使用Math模块的max方法
        System.out.println(Math.max(num1, num2));
    }
}
