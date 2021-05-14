package 跟着老杨学java.类;

public class StudentDome {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(12);
        s.setName("马云");
        int age = s.getAge();
        String name = s.getName();
        s.show();
        System.out.println(name + ',' + age);
    }
}
