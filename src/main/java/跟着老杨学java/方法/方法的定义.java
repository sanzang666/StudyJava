package 跟着老杨学java.方法;

public class 方法的定义 {
    /**
     * 学习方法的定义及调用
     *
     * @param args
     */
    public static void main(String[] args) {
        studyFuc();
        getMax();
    }

    //定义一个方法
    public static void studyFuc() {
        System.out.println("这是一个静态方法，想要使用我直接在main方法里面调用就可以了。");
    }

    //需求：定义一个方法  用于打印两个值中最大的那个
    public static void getMax() {
        int num1 = 10;
        int num2 = 81;
        System.out.println(num1 > num2 ? num1 : num2);
    }
}
