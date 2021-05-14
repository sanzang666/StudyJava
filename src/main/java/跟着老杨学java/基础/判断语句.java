package 跟着老杨学java.基础;

import java.util.Scanner;

public class 判断语句 {
    /**
     * 学习判断语句
     *
     * @param args
     */
    public static void main(String[] args) {
        //创建一个对象
        Scanner sc = new Scanner(System.in);
        System.out.println("单判断分支--请输入分数：");
        int score = sc.nextInt();
        /*
        单判断分支
        需求： 如果分数为60分及以上及格  否则不及格
         */
        if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        /*
        需求：给出一个数字 判断是奇数还是偶数
         */
        System.out.println("判断是奇数还是偶数：");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }

        /*
        多判断分支
        需求： 如果分数为60分及以上小于80分以下的为及格  大于等于80分优秀 否则为不及格
         */
        System.out.println("多分支判断--请输入分数：");
        int score2 = sc.nextInt();
        if (score2 >= 80) {
            System.out.println("优秀");
        } else if (score2 >= 60) { //如果分数为80则属于优秀，这里不用判断 score2 < 80
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
