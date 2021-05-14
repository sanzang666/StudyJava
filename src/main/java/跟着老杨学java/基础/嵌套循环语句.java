package 跟着老杨学java.基础;

public class 嵌套循环语句 {
    /**
     * 循环嵌套语句
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        需求：for循环实现99乘法表的输出
         */
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "  ");
            }
            System.out.println();
        }
    }
}
