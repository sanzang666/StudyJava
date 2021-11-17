package 跟着老杨学java.集合.List;

import java.util.ArrayList;
import java.util.List;

public class List的特有方法 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("!");

        /*
        // get  按索引取值
        System.out.println(list.get(2));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
         */

        /*
        // set 修改制定索引的值，返回被修改的值
        System.out.println(list.set(2, "。"));
        System.out.println(list);
         */

        /*
        // add  指定索引插入元素
        list.add(3, ".");
        System.out.println(list);
         */

        // remove 删除指定索引的元素，返回被删除的元素
        System.out.println(list.remove(2));
        System.out.println(list);

        boolean res = list.contains("!");
        System.out.println(res);

    }
}
