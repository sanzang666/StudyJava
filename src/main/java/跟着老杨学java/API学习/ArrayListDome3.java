package 跟着老杨学java.API学习;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDome3 {
    public static void main(String[] args) {
        /* 存储对象
         * 需求升级： 集合存储个学生类 遍历输出学生类的类属性  学生类属性来源于键盘输入
         */
        ArrayList<Student> array = new ArrayList<Student>();
        addStudent(array);
        addStudent(array);
        addStudent(array);

        for (Student student : array) {
            System.out.println(student.getName() + ", " + student.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        Student studentObj = new Student();
        studentObj.setAge(age);
        studentObj.setName(name);
        student.add(studentObj);
    }

}
