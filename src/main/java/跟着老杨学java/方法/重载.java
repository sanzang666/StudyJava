package 跟着老杨学java.方法;

/**
 * 定义：一个类中含两个以上同名的方法，他们之间就构成重载
 * <p>
 * 特点：
 * 1、必须是两个以上同名的方法
 * 2、方法之间的参数组合必须不同（参数的数目不同或者参数的类型不同）
 * 3、方法的返回值不能作为判断方法之间是否构成重载的依据
 * <p>
 * 好处：
 * 大大简化啦的类调用者的代码，让我们感觉类有一种自动化调用的功能，而没有增加类创建的代码
 */
public class 重载 {
    public static void main(String[] args) {
        System.out.println(compare(1, 2));
        System.out.println(compare(100000000, 20000000));
        System.out.println(compare(4.123, 4.123));
    }

    // 需求：重载思想定义一个方法 实现不同类型数据对比是否相等
    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }

    public static boolean compare(double a, double b) {
        return a == b;
    }
}
