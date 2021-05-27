package 跟着老杨学java.API;

public class StringApi {

    public static void main(String[] args) {
        /*String 是引用类型
        定义方式:
            1、String str = "abc";  直接赋值
            2、String str = new String();
            3、String str = new String(char数组 或者 byte数组);
            ...
            推荐使用1
        */
        String str1 = "abc";
        String str2 = "abc";
        // 值相同 名不同 内存相同
        System.out.println(str1 == str2);

        // ==号比较引用类型的时候 比较的是内存地址，而不是值
        char[] chs = {'a', 'b', 'c'};
        String str3 = new String(chs);
        String str4 = new String(chs);
        System.out.println(str3 == str4);

        //字符串比较使用equals
        System.out.println(str3.equals(str4));
        System.out.println(str1.equals(str2));
    }
}
