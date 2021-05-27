package 跟着老杨学java.接口.运动员和教练需求;

public class PingPongAthlete extends Athlete implements StudyEnglishService {

    public PingPongAthlete() {
    }

    public PingPongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃白菜");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学打乒乓球");
    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员需要学英语");
    }
}
