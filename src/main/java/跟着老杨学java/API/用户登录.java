package 跟着老杨学java.API;

import java.util.Scanner;

public class 用户登录 {
    public static void main(String[] args) {
        /*
        需求：已知用户名密码 三次机会登录成功给提示
         */
        Scanner sc = new Scanner(System.in);
        for (int num = 0; num < 3; num++) {
            System.out.println("请输入用户名：");
            String username = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            if (login(username, password)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败，还剩" + (3 - (num + 1)) + "次机会！");
            }
        }
    }

    public static boolean login(String username, String password) {
        String user = "abc";
        String pwd = "123";
        return user.equals(username) && pwd.equals(password);
    }
}
