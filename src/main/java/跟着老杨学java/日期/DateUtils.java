package 跟着老杨学java.日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils() {
    }


    /**
     * 时间转换指定字符串
     *
     * @param date    时间
     * @param pattern 格式
     * @return 指定格式时间的字符串
     */
    public static String dateToString(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    public static Date stringToDate(String str, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(str);
    }
}
