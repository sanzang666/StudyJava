package 跟着老杨学java.Arrays.字符串中数据排序;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Dome {
    public static void main(String[] args) {
        /*
        需求:有一个字符串:“91 27 46 38 50″,请写程序实现最终输出结果是:“27 38 46 50 91,
        ①定义一个字符串,
        ②把字符串中的数字数据存储到一个int类型的数组中,得到字符串中每一个数字数据?,public String[] split(String regex),
        定义一个int数组,把 String数组中的每一个元素存储到int数组中,public static int parseInt(String s),
        ③对int数组进行排序,
        ④把排序后的int数组中的元素进行拼接得到一个字符串,这里拼接采用 StringBuilder来实现,
        ⑤输出结果
         */
        String str = "91 27 46 38 50";
        System.out.println(Arrays.toString(str.split(" ")));

        String[] strArrays = str.split(" ");
        int[] intArrays = new int[strArrays.length];
        for (int i = 0; i < strArrays.length; i++) {
            intArrays[i] = Integer.parseInt(strArrays[i]);
        }
        Arrays.sort(intArrays);
        StringBuilder sb = new StringBuilder();
        for (int i : intArrays) {
            if (i != intArrays[intArrays.length - 1]) {
                sb.append(i).append(" ");
            } else {
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}
