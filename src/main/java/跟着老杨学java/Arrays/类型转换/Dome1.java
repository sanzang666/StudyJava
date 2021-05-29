package 跟着老杨学java.Arrays.类型转换;

public class Dome1 {
    public static void main(String[] args) {
        // string -> integer
        String str = "123";
        Integer in = Integer.valueOf(str);
        System.out.println(in);

        // string -> int
        int i = Integer.parseInt(str);
        System.out.println(i);

        // integer -> int
        int j = in;
        System.out.println(j);
    }
}
