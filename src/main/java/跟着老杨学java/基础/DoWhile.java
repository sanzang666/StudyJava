package 跟着老杨学java.基础;

public class DoWhile {
    /**
     * 学习 do while
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        do while 格式：
        初始化语句;
        do {
            循环体语句;
            条件控制语句;
        } while (条件判断语句);
        执行顺序：
        1、初始化语句
        2、循环体语句
        3、条件控制语句
        4、条件判断语句  如果为true则返回到2，如果为false 则结束
         */
        /*
        do while 实现需求：一张纸 连续对折  当纸张折叠厚度达到珠峰高度的时候(小于等于珠峰高度)  输出折叠了多少次
         */
        //初始化珠峰高度
        int zf = 8844430;
        //初始化纸张厚度
        double paper = 0.1;
        //初始化折叠次数
        int count = 0;
        do {
            paper *= 2;
            count += 1;
        } while (paper <= zf);
        System.out.println("一张厚度为0.1的纸 通过对折达到珠峰高度需要折叠：" + count + "次");
    }
}
