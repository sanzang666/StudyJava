package 跟着老杨学java.继承.继承案例.继承案例2;

public class Dome {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("ton");
        dog.setAge(18);
        System.out.println(dog.getName() + "," + dog.getAge());
        dog.seeDoor();

        Dog dog1 = new Dog("jon", 20);
        System.out.println(dog1.getName() + "," + dog1.getAge());
        dog1.seeDoor();

        Cat cat = new Cat();
        cat.setName("tom");
        cat.setAge(33);
        System.out.println(cat.getName() + "," + cat.getAge());
        cat.seizeMouse();

        Cat cat2 = new Cat("tom2", 40);
        System.out.println(cat2.getName() + "," + cat2.getAge());
        cat2.seizeMouse();
    }
}
