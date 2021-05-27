package 跟着老杨学java.内部类;

public class Outer {
    private class Inner {
        public void show() {
            System.out.println("这是Inner的show方法");
        }
    }

    public void method() {
        Inner inner = new Inner();
        inner.show();
    }
}
