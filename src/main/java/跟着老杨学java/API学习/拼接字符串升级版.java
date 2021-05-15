package 跟着老杨学java.API学习;

public class 拼接字符串升级版 {
    public static void main(String[] args) {
        //需求：定义一个方法  实现给一个int数组  返回指定格式的字符串: [1,3,4,5]
        StringBuilder sb = new StringBuilder();
        int[] arr = {1, 4, 2, 3};
        sb.append('[');
        for (int i : arr) {
            if (i == arr[arr.length -1]) {
                sb.append(i).append(']');
            } else {
                sb.append(i).append(", ");
            }
        }
        System.out.println(sb);
    }
}
