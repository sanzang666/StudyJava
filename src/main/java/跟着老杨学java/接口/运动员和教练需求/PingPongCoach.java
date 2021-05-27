package 跟着老杨学java.接口.运动员和教练需求;

public class PingPongCoach extends Coach {

    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃烤全羊");
    }

    @Override
    public void teach(String name) {
        System.out.println("我叫" + name + "我负责教打乒乓球");
    }
}
