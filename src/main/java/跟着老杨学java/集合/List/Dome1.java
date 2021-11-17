package 跟着老杨学java.集合.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dome1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("!");
        list.add("world");
        list.add(null);
        System.out.println(list);

        /*
        for (String s : list) {
            System.out.println(s);
        }
         */
        /*for (String s : list) {
            if(null == s){
                list.remove(s);
            }
        }*/
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (null == next) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
