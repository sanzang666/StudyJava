package 跟着老杨学java.类;

public class Student {
    private String _name;
    private int _age;

    public void setName(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public void setAge(int age) {
        _age = age;
    }

    public int getAge() {
        return _age;
    }

    public void show() {
        System.out.println(_name + "," + _age);
    }
}
