package 跟着老杨学java.集合.Iterator的常用方法;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentDome {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();

        Student s1 = new Student("张三丰", 99);
        Student s2 = new Student("张无忌", 22);
        Student s3 = new Student("扫地僧", 88);

        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();

        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
