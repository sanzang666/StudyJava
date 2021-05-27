package 跟着老杨学java.继承.方法重写;

public class PhoneDome {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("张三丰 ");
        System.out.println("-------");
        NewPhone np = new NewPhone();
        np.call("林青霞");
    }
}
