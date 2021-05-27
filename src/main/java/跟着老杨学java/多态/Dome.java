package 跟着老杨学java.多态;

public class Dome {
    public static void main(String[] args) {
        /*
        多态：
            同一对象 在不同时刻 表现出不同的形态。

         具体提现为：定义方法的时候  使用父类型作为参数，在使用的时候使用具体的子类型参与操作。
         */
        Animal cat = new Cat();
        cat.eat();

        Animal dog = new Dog();
        dog.eat();

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();


        AnimalOperator animalOperator = new AnimalOperator();
        animalOperator.useAnimal(cat);
        animalOperator.useAnimal(cat1);
        animalOperator.useAnimal(dog);
        animalOperator.useAnimal(dog1);
    }
}
