package 跟着老杨学java.日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dome {
    /*
    日期的基本操作
     */
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        // 获取当前时间  毫秒
        System.out.println(date.getTime());

        date.setTime(System.currentTimeMillis());
        System.out.println(date);

        // 格式化输出
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));

        // String —> Date
        String time = "2021-05-28 15:16:02";
        System.out.println(sdf.parse(time));
    }
}
