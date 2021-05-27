package 跟着老杨学java.多态转型;

public class Cat extends Animal {
    int age = 20;
    String a = "asd";

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void show() {
        System.out.println("这是猫的show方法");
    }
}
