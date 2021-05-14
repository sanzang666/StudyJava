package 跟着老杨学java;

public class for循环 {
    /**
     * 学习循环
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        格式：
        for (初始化语句; 条件判断语句; 条件控制语句) {
            循环体语句
        }
        初始化语句 和 条件控制语句 可以不写
         */
        /*
        需求： 1-100 之和
         */
        int sumNum = 0;
        for (int i = 0; i <= 100; i++) {
            sumNum += i;
        }
        System.out.println(sumNum);

        /*
        需求： 1-100 偶数之和
         */
        sumNum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumNum += i;
            }
        }
        System.out.println(sumNum);
    }
}
