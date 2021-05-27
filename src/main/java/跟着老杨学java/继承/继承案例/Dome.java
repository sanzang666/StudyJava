package 跟着老杨学java.继承.继承案例;

public class Dome {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setName("李青");
        teacher1.setAge(33);
        System.out.println(teacher1.getName() + "," + teacher1.getAge());
        teacher1.teach();

        Teacher teacher2 = new Teacher("提莫", 22);
        System.out.println(teacher2.getName() + "," + teacher2.getAge());
        teacher2.teach();
    }
}
