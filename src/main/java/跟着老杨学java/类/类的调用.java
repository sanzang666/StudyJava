package 跟着老杨学java.类;

public class 类的调用 {
    public static void main(String[] args) {
        类的定义 phone = new 类的定义();
        System.out.println(phone.brand);
        System.out.println(phone.price);

        phone.brand = "小米";
        phone.price = 2999;

        System.out.println(phone.brand);
        System.out.println(phone.price);
    }
}
