package 跟着老杨学java.基础;

import java.util.Scanner;


public class 三元表达式 {
    /**
     * 学习三元表达式
     *
     * @param args
     */
    public static void main(String[] args) {
        /*格式：关系表达式?表达式1:表达式2
         * 如果满足关系表达式  则返回表达式1  否则返回表达式2
         */
        //需求：如果分数为60分及以上及格  否则不及格
        int score = 60;
        String result = score >= 60 ? result = "及格" : "不及格";
        System.out.println(result);
        /*
         升级版需求：如果分数为60分及以上及格  否则不及格
         */
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接受数据
        int score2 = sc.nextInt();
        boolean res = score2 >= 60 ? true : false;
        // 以上代码等价于 boolean res = score2 >= 60;
        System.out.println(res);
    }
}
