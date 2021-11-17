package 跟着老杨学java.集合.Set;

import java.util.TreeSet;

public class TreeSetDome {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("hello");
        ts.add("world");
        ts.add("!");

        for (String s : ts) {
            System.out.println(s);
        }
    }
}
