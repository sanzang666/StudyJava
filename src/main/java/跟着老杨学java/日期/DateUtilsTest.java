package 跟着老杨学java.日期;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class DateUtilsTest {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String pattern = "yyyy-MM-dd HH:mm:ss";
        String result = DateUtils.dateToString(date, pattern);
        System.out.println(result);

        String strTime = "2021-05-28 15:30:39";
        Date resultTime = DateUtils.stringToDate(strTime, pattern);
        System.out.println(resultTime);
        System.out.println(DateUtils.dateToString(resultTime, pattern));
    }
}
