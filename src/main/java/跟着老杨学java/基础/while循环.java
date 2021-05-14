package 跟着老杨学java.基础;

public class while循环 {
    /**
     * 学习 while 循环
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        while 基本格式：
        初始化语句;
        while (条件语句) {  //当满足条件语句一直循环执行循环体语句
            循环体语句;
            条件控制语句;
        }
         */
        /*
        需求：一张纸 连续对折  当纸张折叠厚度达到珠峰高度的时候(小于等于珠峰高度)  输出折叠了多少次
         */
        int zf = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper <= zf) {
            paper *= 2;
            count += 1;
        }
        System.out.println("一张厚度为0.1的纸 通过对折达到珠峰高度需要折叠：" + count + "次");
    }
}
