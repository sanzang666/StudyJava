package 跟着老杨学java.内部类;

public class OuterDome {

    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.method();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + "毫秒");
    }
}
