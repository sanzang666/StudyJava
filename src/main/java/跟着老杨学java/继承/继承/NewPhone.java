package 跟着老杨学java.继承.继承;

public class NewPhone extends Phone {

    public static void call(String name) {
        System.out.println("开启视频");
        Phone.call(name);
    }
}
