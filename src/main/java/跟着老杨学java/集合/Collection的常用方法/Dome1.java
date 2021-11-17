package 跟着老杨学java.集合.Collection的常用方法;

import java.util.ArrayList;
import java.util.Collection;

public class Dome1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        // 添加元素
        c.add("hello");
        c.add("world");
        c.add("!");
        System.out.println(c);

        // 移除指定元素
        c.remove("!");
        System.out.println(c);

        // 判断是否为空
        System.out.println(c.isEmpty());

        // 获取集合长度
        System.out.println(c.size());

        // 清空集合元素
        c.clear();
        System.out.println(c);
        System.out.println(c.size());
    }
}
