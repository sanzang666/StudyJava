package 跟着老杨学java.基础;

import java.util.Random;
import java.util.Scanner;

public class Random随机数 {
    /**
     * 学习 random 随机数模块
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        使用步骤
        1、导包
        2、新建对象
        3、使用
         */
        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int num = ran.nextInt(11);
            System.out.println(num);
        }
        /*
        需求： 实现猜数字游戏
         */
        Scanner sc = new Scanner(System.in);
        int ranNum = ran.nextInt(6);
        while (true) {
            System.out.println("请输入你猜的数字");
            int num = sc.nextInt();
            if (num > ranNum) {
                System.out.println("大了");
            } else if (num < ranNum) {
                System.out.println("小了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
