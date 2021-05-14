package 跟着老杨学java.基础;

import java.util.Scanner;

public class switch语句 {
    /**
     * 学习switch语句
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        格式：
        switch (表达式) {
            case 值1:        如果表达式为值1 则执行 语句体1
                语句体1
                break;       如果满足 则switch语句结束
            case 值2:        否则继续匹配case2
                语句体2
                break;
            ...
            default:         如果均没有命中 则执行default中的语句体
                语句体
        }
         */
        /*
        需求：判断春夏秋冬  12个月  4个季节
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
            default:
                System.out.println("请正确输入月份");
        }

    }
}
