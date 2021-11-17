package 跟着老杨学java.泛型;

public class Dome {
    public static void main(String[] args) {
        Emp1<String> emp1 = new Emp1<>();
        emp1.show("林青霞");

        Emp1<Integer> emp2 = new Emp1<>();
        emp2.show(123);

        Emp2 e21 = new Emp2();
        e21.show("你好");
        e21.show(123);
        e21.show(true);
        e21.show(1.213);
    }
}
