package 跟着老杨学java.多态;

public class AnimalOperator {

    public void useAnimal(Animal obj) {
        obj.eat();

        //多态不能共享子类特有的方法
//        obj.lookDoor();
    }
}
