package 跟着老杨学java.继承.方法重写;

public class NewPhone extends Phone {

    @Override
    public void call(String name) {
        System.out.println("开启视频");
        super.call(name);
    }
}
