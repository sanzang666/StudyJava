package 跟着老杨学java.API学习;

public class 拼接字符串 {
    public static void main(String[] args) {
        /*
        需求：定义一个方法  实现给一个int数组  返回指定格式的字符串: [1,3,4,5]
         */
        int[] arr = {1, 2, 3, 4};
        String s = joinStr(arr);
        System.out.println(s);
    }

    public static String joinStr(int[] arr) {
        String str = "";
        str += '[';

        for (int i : arr) {
            if (i == arr[arr.length - 1]) {
                str += i;
                str += ']';
            } else {
                str += i + ", ";
            }
        }
        return str;
    }
}
