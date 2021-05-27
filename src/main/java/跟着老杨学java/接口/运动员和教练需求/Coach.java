package 跟着老杨学java.接口.运动员和教练需求;

public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }


    public abstract void teach(String name);
}
