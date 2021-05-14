package 跟着老杨学java.基础;

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

        /*
        水仙花需求：查找 100 - 1000 内所有的水仙花数值
        水仙花数即 每个位数值的立方之和  等于原数值 的即为水仙花数值
         */
        int count = 0;
        for (int i = 100; i < 1001; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                count += 1;
                System.out.println(i);
            }
        }
        System.out.println("水仙花数个数为：" + count + "个");
    }
}
