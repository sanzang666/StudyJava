package 跟着老杨学java.抽象类;

public class AnimalDome {
    /*
    需求:请采用抽象类的思想实现猫和狗的案例,并在测试类中进行测试
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("加菲猫");
        cat.setAge(1);
        System.out.println(cat.getName() + "," + cat.getAge());
        cat.eat();
    }
}
