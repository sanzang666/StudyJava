package 跟着老杨学java.集合.Iterator的常用方法;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Dome {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        // 添加元素
        c.add("hello");
        c.add("world");
        c.add("!");
        System.out.println(c);

        // 创建迭代器对象
        Iterator<String> it = c.iterator();
        /*
        System.out.println(it);
        System.out.println(it.next()); // 获取下个元素
        System.out.println(it.hasNext()); // 判断迭代器中是否还有元素
         */
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
