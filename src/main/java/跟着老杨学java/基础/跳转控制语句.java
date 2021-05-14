package 跟着老杨学java.基础;

public class 跳转控制语句 {
    /**
     * 学习跳转控制语句 break 和 continue
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        break 基于条件控制 当满足条件 跳出循环
        continue 基于条件控制 当满足条件 跳出本次循环
         */
        /*
        需求：使用while 循环和continue 实现输出  1-10所有的偶数
         */
        int i = 1;
        while (i < 11) {
            if (i % 2 != 0) {
                i += 1;
                continue;
            }
            System.out.println(i);
            i += 1;
        }
    }
}
