package 跟着老杨学java.API学习;

import java.util.Scanner;

public class 翻转字符串 {
    public static void main(String[] args) {
        //接收键盘输入的字符串  翻转后输出
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
//        StringBuilder sb = new StringBuilder(line);
//        String result = sb.reverse().toString();
//        System.out.println(result);
        System.out.println(myReverse(line));
    }

    public static String myReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
