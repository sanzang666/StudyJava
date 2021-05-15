package 跟着老杨学java.API学习;

import java.util.Scanner;

public class 统计字符出现的次数 {
    public static void main(String[] args) {
        /*
        需求：实现获取用户输入的字符串  统计 大写字母 小写字母  数字出现的次数，不考虑别的
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();

        int big = 0;
        int min = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                big += 1;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                min += 1;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num += 1;
            }
        }
        System.out.println(big);
        System.out.println(min);
        System.out.println(num);
    }
}
