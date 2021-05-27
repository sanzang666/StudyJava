package 跟着老杨学java.继承.继承案例;

public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("成就每一位学员");
    }
}
