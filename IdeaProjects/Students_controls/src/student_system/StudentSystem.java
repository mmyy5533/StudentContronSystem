package student_system;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:while (true) {
            System.out.println("---------------欢迎来到黑马程序员---------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.print("请输入您的选择:");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1" -> addStudent(list);
                case "2" -> delStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
//                    break loop;
                    System.exit(0);
                }
                default -> System.out.println("输入错误");
            }
        }
    }


    // 1.添加学生
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String student_id = null;
        Student s = new Student();
        while (true) {
            System.out.println("请输入学生的id");
            student_id = sc.next();

            boolean flag = contains(list,student_id);
            if(flag){
                System.out.println("该id已存在，请重新输入");
            }else{
                s.setId(student_id);
                break;
            }
        }
        System.out.println("请输入学生的姓名");
        String student_name = sc.next();
        s.setName(student_name);
        System.out.println("请输入学生的年龄");
        int student_age = sc.nextInt();
        s.setAge(student_age);
        System.out.println("请输入学生的地址");
        String student_address = sc.next();
        s.setAddress(student_address);
        // 有参构造
//        Student stu = new Student(student_id,student_name,student_age,student_address);
        list.add(s);
        System.out.println("添加成功");
    }
    // 2.删除学生
    public static void delStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String student_id = sc.next();
        int index = getIndex(list,student_id);
        if(index >= 0){
            list.remove(index);
            System.out.println("id为："+student_id+"的学生删除成功");
        }else{
            System.out.println("id不存在");
        }


    }
    // 3.修改学生
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String student_id = sc.next();
        int index = getIndex(list,student_id);
        if(index >= 0){
            Student stu = list.get(index);
            System.out.println("请输入新的姓名");
            String student_name = sc.next();
            stu.setName(student_name);
            System.out.println("请输入新的年龄");
            int student_age = sc.nextInt();
            stu.setAge(student_age);
            System.out.println("请输入新的地址");
            String student_address = sc.next();
            stu.setAddress(student_address);
            System.out.println("修改成功");
        }else{
            System.out.println("id不存在");
        }
    }
    // 4.查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.isEmpty()){
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t地址");
        for (Student stu : list) {
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }

    }
    public static boolean contains(ArrayList<Student> list,String id) {
//        for(Student stu:list){
//            String sid = stu.getId();
//            if (sid.equals(id)){
//                return true;
//            }
//        }
//        return false;
        return getIndex(list,id) >= 0;
    }
    public static int getIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if(sid.equals(id)){
                return i;
            }
        }
        return -1;
    }
}
