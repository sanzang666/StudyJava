package 跟着老杨学java.接口.运动员和教练需求;

public class Dome {
    public static void main(String[] args) {
        BasketballAthlete ba = new BasketballAthlete();
        ba.eat();
        ba.study();
        System.out.println("----------------------");
        BasketballCoach bc = new BasketballCoach("托尼", 28);
        bc.eat();
        bc.teach(bc.getName());
        System.out.println("----------------------");
        PingPongAthlete pa = new PingPongAthlete();
        pa.eat();
        pa.study();
        pa.studyEnglish();
        System.out.println("----------------------");
        PingPongCoach pc = new PingPongCoach("安尼", 32);
        pc.eat();
        pc.teach(pc.getName());

    }
}
