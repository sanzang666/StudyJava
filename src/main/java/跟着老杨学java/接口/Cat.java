package 跟着老杨学java.接口;

public class Cat extends Animal implements JumppingService {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump(String name) {
        System.out.println(name + "学会了跳高");
    }
}
