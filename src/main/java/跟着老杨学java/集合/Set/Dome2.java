package 跟着老杨学java.集合.Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Dome2 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();

        Random r = new Random();

        while (s.size() < 10) {
            s.add(r.nextInt(20 + 1));
        }
        System.out.println(s);

    }
}
