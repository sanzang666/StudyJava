package 跟着老杨学java.集合.增强for;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Dome {
    public static void main(String[] args) {
        /*
        三种遍历方式遍历
         */
        List<Student> s = new ArrayList<>();
        Student s1 = new Student("张三丰", 90);
        Student s2 = new Student("张无忌", 80);
        Student s3 = new Student("扫地僧", 90);
        s.add(s1);
        s.add(s2);
        s.add(s3);

        // for 循环
        for (int i = 0; i < s.size(); i++) {
            Student student = s.get(i);
            System.out.println(student.getName() + "," + student.getAge());
        }
        System.out.println("------------------");

        // 迭代器
        ListIterator<Student> lit = s.listIterator();
        while (lit.hasNext()) {
            Student next = lit.next();
            System.out.println(next.getName() + "," + next.getAge());
        }
        System.out.println("------------------");


        // 增强for
        for (Student ss : s) {
            System.out.println(ss.getName() + "," + ss.getAge());
        }
        System.out.println("------------------");

        LinkedList<Student> ls = new LinkedList<>();
        ls.add(new Student("大娃", 13));
        ls.add(new Student("二娃", 12));
        ls.add(new Student("三娃", 11));

        for (Student lss : ls) {
            System.out.println(lss.getName() + "," + lss.getAge());
        }
    }
}
