package 跟着老杨学java.接口;

public class AnimalDome {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("加菲猫");
        cat.setAge(1);
        System.out.println(cat.getName() + "," + cat.getAge());
        cat.eat();
        cat.jump(cat.getName());
        System.out.println("------------------");

        Cat cat1 = new Cat("tom", 5);
        System.out.println(cat1.getName() + "," + cat1.getAge());
        cat1.eat();
        cat1.jump(cat1.getName());
        System.out.println("------------------");

        Dog dog = new Dog();
        dog.setName("皮皮");
        dog.setAge(3);
        System.out.println(dog.getName() + "," + dog.getAge());
        dog.eat();
        dog.jump(dog.getName());
        System.out.println("-------------------");

        Dog dog1 = new Dog("ton", 4);
        System.out.println(dog1.getName() + "," + dog1.getAge());
        dog1.eat();
        dog1.jump(dog1.getName());

    }
}
