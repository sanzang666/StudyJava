package 跟着老杨学java.类;


public class TestPhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        Phone p1 = new Phone(10);
        System.out.println(p.getPrice());
        System.out.println(p1.getPrice());
    }
}
