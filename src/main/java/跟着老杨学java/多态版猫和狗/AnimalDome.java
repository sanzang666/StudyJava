package 跟着老杨学java.多态版猫和狗;

public class AnimalDome {
    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.setName("加菲猫");
        cat.setAge(1);
        System.out.println(cat.getName() + "," + cat.getAge());
        cat.eat();

        Animal cat1 = new Cat("加菲", 3);
        System.out.println(cat1.getName() + "," + cat1.getAge());
        cat1.eat();

        Animal dog = new Dog();
        dog.setName("旺财");
        dog.setAge(2);
        System.out.println(dog.getName() + "," + dog.getAge());
        dog.eat();

        Animal dog1 = new Dog("皮皮", 5);
        System.out.println(dog1.getName() + "," + dog1.getAge());
        dog1.eat();


    }
}
