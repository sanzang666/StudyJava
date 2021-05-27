package 跟着老杨学java.继承.继承案例.继承案例2;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void seeDoor(){
        System.out.println("好好看门");
    }
}
