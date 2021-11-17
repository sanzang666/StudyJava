package 跟着老杨学java.异常;

public class 运行异常 {
    public static void main(String[] args) {
        System.out.println("start");
        method();
        System.out.println("end");
    }

    public static void method() {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            throw new CheckScoreException("分数错了");
        }
    }
}
