package 跟着老杨学java.多态转型;

public class TestDome {

    public static void main(String[] args) {
        /*
        向上转型
            从子到父
            父类型引用指向子类型
        向下转型
            从父到子
            父类引用转换为子类对象
         */

        // 向上转型
        Animal a = new Cat();
        a.eat();

        // 向下转型
        Cat c = (Cat) a;
        c.eat();
        c.show();
    }
}
