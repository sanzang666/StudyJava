package 跟着老杨学java.API学习;

import java.util.ArrayList;

public class ArrayListDome {
    public static void main(String[] args) {
        // ArrayList 是一个可变的集合容器

        // 创建一个ArrayList 对象  ArrayList<类型>
        ArrayList<String> strArray = new ArrayList<>();
        // 集合末尾新增值
        strArray.add("hello");
        strArray.add("hello");
        strArray.add("word");

        //指定索引位置添加值
        strArray.add(2, "!");

        // 删除指定元素  如果有多个  则删除第一个
        System.out.println(strArray.remove("hello"));

        // 修改集合中 指定位置的值
        System.out.println(strArray.set(1, ""));
        System.out.println(strArray);

        // 获取指定索引的值
        System.out.println(strArray.get(0));

        //获取集合长度
        System.out.println(strArray.size());

        for (String str : strArray) {
            System.out.println(str);
        }
    }
}
