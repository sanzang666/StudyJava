package 跟着老杨学java.Map;

import com.sun.javafx.collections.MappingChange;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDome1 {
    public static void main(String[] args) {
        // 定义map
        Map<String, String> map = new HashMap<String, String>();
        System.out.println(map);

        // 添加值
        map.put("s001", "三藏");
        map.put("s002", "八戒");
        map.put("s003", "悟空");
        System.out.println(map);

        // 删除指定值
        System.out.println(map.remove("s003"));
        System.out.println(map.remove("s004"));

        // 获取map中元素的个数
        System.out.println(map.size());

        // 清空map中的元素
//        map.clear();
//        System.out.println(map);
        // 判断map 是否为空
        System.out.println(map.isEmpty());


        System.out.println("****************");
        System.out.println(map);

        // 根据key 获取value
        System.out.println(map.get("s001"));
        System.out.println(map.get("s005"));

        // 获取map中所有的key
        Set<String> items = map.keySet();
        System.out.println(items);

        // 获取map 中所有的value
        Collection<String> values = map.values();
        System.out.println(values);

        // 判断集合中是否包含某个key
        System.out.println(map.containsKey("s001"));
        System.out.println(map.containsKey("s005"));

        // 判断集合中是否包含某个值
        System.out.println(map.containsValue("三藏"));
        System.out.println(map.containsValue("沙僧"));

        for (String item : items) {
            System.out.println(map.get(item));
        }
    }
}
