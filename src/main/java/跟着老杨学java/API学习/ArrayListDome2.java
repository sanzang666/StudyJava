package 跟着老杨学java.API学习;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDome2 {
    /* 存储对象
     * 需求： 集合存储个学生类 遍历输出学生类的类属性
     */
    public static void main(String[] args) {
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("李四", 18);
        Student s3 = new Student("王二", 28);

        ArrayList<Student> array = new ArrayList<Student>();
        array.add(s1);
        array.add(s2);
        array.add(s3);
        for (Student j : array) {
            System.out.println(j.getName() + "," + j.getAge());
        }
    }
}
