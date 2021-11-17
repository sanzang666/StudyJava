package 跟着老杨学java.集合.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class 增强for循环 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("!");

        // for 循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 迭代器遍历
        ListIterator<String> sl = list.listIterator();
        while (sl.hasNext()) {
            System.out.println(sl.next());
        }

        // 增强for
        for (String s: list) {
            System.out.println(s);
        }
    }
}
