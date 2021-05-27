package 跟着老杨学java.类;

public class Phone {
    private int price;

    public Phone() {
        System.out.println("这是一个无参构造方法");
    }

    public Phone(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
