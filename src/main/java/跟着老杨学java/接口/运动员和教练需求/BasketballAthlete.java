package 跟着老杨学java.接口.运动员和教练需求;

public class BasketballAthlete extends Athlete {
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃萝卜");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学打篮球");
    }
}
