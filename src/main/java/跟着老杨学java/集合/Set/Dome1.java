package 跟着老杨学java.集合.Set;

import java.util.HashSet;
import java.util.Set;

public class Dome1 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("hello");
        s.add("hello");
        s.add("hello");
        System.out.println(s);
    }
}
