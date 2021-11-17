package 跟着老杨学java.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDome2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        map.put("张无忌", "赵敏");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> me : entries) {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "," + value);
        }
    }
}
