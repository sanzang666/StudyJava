package 跟着老杨学java.API学习;

import java.util.Arrays;
import java.util.Scanner;

public class 遍历字符串 {
    public static void main(String[] args) {
        /*
        需求：实现获取用户输入的字符串  控制台遍历输出
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要遍历的字符串：");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
