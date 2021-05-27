package 跟着老杨学java.学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生管理类
 */
public class StudentManager {
    /*
    1、用输出语句完成主界面的编写
    2、用Scanner 实现键盘录入数据
    3、用switch语句实现操作选择
    4、用循环语句回到主界面
     */
    public static void main(String[] args) {


        //2、用Scanner 实现键盘录入数据
        Scanner sc = new Scanner(System.in);

        //创建存储容器
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            // 1、用输出语句完成主界面的编写
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看学生");
            System.out.println("5.退出");
            String model = sc.nextLine();

            //3、用switch语句实现操作选择
            switch (model) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(students);
                    break;
                case "2":
                    System.out.println("删除学生");
                    delStudent(students);
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent(students);
                    break;
                case "4":
                    System.out.println("查看学生");
                    findAllStudent(students);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
                default:
                    System.out.println("输入有误");
            }
        }
    }

    /**
     * 新增学生信息
     *
     * @param array
     */
    public static void addStudent(ArrayList<Student> array) {
        // 1.提示输入信息 并获取
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生编号：");
        String studentSid = sc.nextLine();

        if (isUser(array, studentSid)) {
            System.out.println("该学生编号已经存在");
            return;
        }

        System.out.println("请输入学生姓名：");
        String studentName = sc.nextLine();

        System.out.println("请输入学生年龄：");
        String studentAge = sc.nextLine();

        System.out.println("请输入学生地址：");
        String studentAddress = sc.nextLine();

        Student student = new Student();
        student.setSid(studentSid);
        student.setName(studentName);
        student.setAge(studentAge);
        student.setAddress(studentAddress);
        array.add(student);
        System.out.println("添加成功");
    }

    /**
     * 查看所有学生信息
     *
     * @param array
     */
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() < 1) {
            System.out.println("请先添加学生信息");
            return;
        }
        System.out.println("学生编号\t学生姓名\t学生年龄\t学生地址");
        for (Student s : array) {
            System.out.println(s.getSid() + "\t\t\t" + s.getName() + "\t\t\t" + s.getAge() + "\t\t\t" + s.getAddress());
        }
    }

    /**
     * 删除学生信息
     *
     * @param array
     */
    public static void delStudent(ArrayList<Student> array) {
        // 1.提示输入信息 并获取
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生编号：");
        String studentSid = sc.nextLine();

        for (Student s : array) {
            if (s.getSid().equals(studentSid)) {
                array.remove(s);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("未找到学生编号，删除失败！");

    }

    /**
     * 更改学生信息
     *
     * @param array
     */
    public static void updateStudent(ArrayList<Student> array) {
        // 1.提示输入信息 并获取
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要更改学生信息的编号：");
        String studentSid = sc.nextLine();

        Student student = new Student();

        for (Student s : array) {
            if (s.getSid().equals(studentSid)) {
                System.out.println("请输入学生姓名：");
                String name = sc.nextLine();
                System.out.println("请输入学生年龄：");
                String age = sc.nextLine();
                System.out.println("请输入学生地址：");
                String address = sc.nextLine();
                student.setSid(studentSid);
                student.setName(name);
                student.setAge(age);
                student.setAddress(address);
                array.set(array.indexOf(s), student);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("未找到学生编号，修改失败！");
    }

    /**
     * 验证sid是否已经存在
     *
     * @param array
     * @param sid
     * @return
     */
    public static Boolean isUser(ArrayList<Student> array, String sid) {
        boolean flag = false;
        for (Student s : array) {
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
