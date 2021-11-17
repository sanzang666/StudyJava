package 跟着老杨学java.集合.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestUpdate {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("!");

        // 并发修改异常
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String s = it.next();
//            if ("world".equals(s)) {
//                list.add("javaee");
//            }
//        }
//        System.out.println(list);

//        for (String s : list) {
//            if ("world".equals(s)) {
//                list.add("javaee");
//            }
//        }
//        System.out.println(list);
        // for 循环解决并发修改报错。增强for不行。
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ("world".equals(s)) {
                list.add("javaee");
            }
        }
        System.out.println(list);

    }

}
