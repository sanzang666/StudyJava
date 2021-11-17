package 跟着老杨学java.集合.Set;

import java.util.HashSet;

public class HashSetDome {

    public static void main(String[] args) {
        // 保证对象属性相同 只能添加一个的时候  需要重写Student中的equals、hashCode两个方法
        HashSet<Student> hs = new HashSet<>();
        Student s1 = new Student("张曼玉", 18);
        Student s2 = new Student("林青霞", 28);
        Student s3 = new Student("王祖贤", 38);
        Student s4 = new Student("王祖贤", 38);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        for (Student s : hs) {
            System.out.println(s.getName() + "," + s.getAge());
        }

    }

}
