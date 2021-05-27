package 跟着老杨学java.接口.运动员和教练需求;

public class BasketballCoach extends Coach {

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃小龙虾");
    }

    @Override
    public void teach(String name) {
        System.out.println("我叫" + name + "我负责教打篮球");
    }
}
