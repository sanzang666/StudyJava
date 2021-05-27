package 跟着老杨学java.权限修饰符;

public class 修饰符static {
    public static void main(String[] args) {
        /*
        static 修饰符的特点
        被类的所有对象共享

        静态成员方法 只能访问静态成员。
         */

        Student.teacher = "如来佛";

        Student s1 = new Student();
        s1.name = "张三丰";
        s1.age = 90;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(Student.teacher);

        Student s2 = new Student();
        s2.name = "张无忌";
        s2.age = 30;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(Student.teacher);
    }
}
