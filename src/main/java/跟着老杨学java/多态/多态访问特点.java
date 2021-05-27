package 跟着老杨学java.多态;

public class 多态访问特点 {
    public static void main(String[] args) {
        /*
        成员变量：
            1、编译看左边
            2、执行看左边
        成员方法：
            1、编译看左边
            2、执行看右边
        因为成员方法有重写，成员变量没有
         */
        Animal cat = new Cat();

        System.out.println(cat.age);
//        System.out.println(cat.a);
        cat.eat();
//        cat.show();
    }
}
