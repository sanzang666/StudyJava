package 跟着老杨学java.接口;

public class Dog extends Animal implements JumppingService {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump(String name) {
        System.out.println(name + "可以跳高了");
    }

}
