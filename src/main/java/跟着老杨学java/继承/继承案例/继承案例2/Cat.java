package 跟着老杨学java.继承.继承案例.继承案例2;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void seizeMouse() {
        System.out.println("好好抓老鼠");
    }
}
