package com.itheima.studentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class APP {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1.登录 2.注册 3.忘记密码");
            String choose = sc.next();
            switch (choose){
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("退出");
                    System.exit(0);
                }
                default -> System.out.println("输入错误");
            }
        }

    }

    private static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String nameUser = sc.next();
        boolean flag = contain(list,nameUser);
        if (!flag){
            System.out.println("用户名不存在");
            return;
        }
        System.out.println("请输入身份证号码：");
        String identity = sc.next();
        System.out.println("请输入手机号码：");
        String phoneNumber = sc.next();


        //需要把用户对象先获取出来
        int index = findIndex(list,nameUser);
        User user = list.get(index);
        //比较用户对象中的手机号码和身份证号码是否相同
        if (!(user.getPersonID().equals(identity) && user.getPhoneNumber().equals(phoneNumber))){
            System.out.println("输入的身份证号码伙手机号码输入有误，不能修改密码");
            return;
        }
        //代码执行到这里，所有数据全部验证成功，直接修改即可
        String password;
        while (true) {
            System.out.println("请输入新的密码：");
            password  = sc.next();
            System.out.println("请再次输入密码：");
            String againPassword = sc.next();
            if(password.equals(againPassword)){
                System.out.println("两次密码输入一致");
                break;
            }else{
                System.out.println("两次密码不一致，请重新输入");
            }
        }
        user.setPassword(password);
        System.out.println("密码修改成功");
    }

    //寻找用户名的索引
    private static int findIndex(ArrayList<User> list, String nameUser) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getUsername().equals(nameUser)){
                return i;
            }
        }
        return -1;
    }

    private static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();
            boolean flag = checkUsername(username);
            if(!flag){
                System.out.println("用户名格式错误，请重新输入");
                continue;
            }
            boolean flag1 = contain(list,username);
            if(flag1){
                System.out.println("用户名" + username + "已存在，请重新输入");
            }else{
                System.out.println("用户名" + username + "可用");
                break;

            }
        }
        //2.键盘录入密码
        //密码键盘输入两次，两次一致才可以进行注册
        String password;
        while (true) {
            System.out.println("请输入密码:");
            password = sc.next();
            System.out.println("请输入确认密码");
            String password1 = sc.next();
            if(!password.equals(password1)){
                System.out.println("两次密码不一致，请重新输入");
            }else{
                System.out.println("两次密码一致，继续录入其他数据");
                break;
            }
        }
        //3.输入身份证号码
        //长度18位，不能以0开头，最后一位可以是数字，也可以是大写X或者小写x
        String identity;
        while (true) {
            System.out.println("请输入身份证号码");
            identity = sc.next();
            boolean flag = checkIdentity(identity);
            if (flag){
                System.out.println("身份证号码满足要求");
                break;
            }else{
                System.out.println("身份证号码输入错误，请重新输入");
            }
        }
        //4.输入手机号码验证
        //长度为11位，不能以0为开头，必须都是数字
        String PersonNumber;
        while (true) {
            System.out.println("请输入手机号码");
            PersonNumber = sc.next();
            boolean flag = checkPersonNumber(PersonNumber);
            if (flag){
                System.out.println("手机号码输入正确");
                break;
            }else {
                System.out.println("手机号码输入错误，请重新输入");
            }
        }
        User user = new User(username,password,identity,PersonNumber);
        list.add(user);
        System.out.println("注册成功");

        //遍历集合
        printList(list);
    }

    //输出人员用户名、手机号码、密码
    private static void printList(ArrayList<User> list) {
        for (User user:list){
            System.out.println(user.getUsername() + ", "+user.getPassword() + ", "+user.getPersonID() + ", "+user.getPhoneNumber());
        }
    }

    //确认手机号码是否正确
    private static boolean checkPersonNumber(String personNumber) {
        boolean flag = personNumber.startsWith("0");
        int len = personNumber.length();
        if (flag){
            return false;
        }
        if (len != 11){
            return false;
        }
        for (int i = 0; i < personNumber.length(); i++) {
            char c = personNumber.charAt(i);
            if(!(c >= '0' && c <= '9')){
                return false;
            }
        }
        return true;
    }

    //确定身份证号码是否正确
    private static boolean checkIdentity(String identity) {
//            char c = identity.charAt(0);
//            if(c == 0){
//                System.out.println("输入错误，请重新输入");
//            }
            if(identity.startsWith("0")){
                System.out.println("输入错误，请重新输入");
                return false;
            }
            int len = identity.length();
            if (len != 18){
               return false;
            }
        for (int i = 0; i < identity.length() - 2; i++) {
            char c = identity.charAt(i);
            if(!(c >= '0' && c <= '9')){
                return false;
            }
        }
            char c1 = identity.charAt(len - 1);
            if(!(c1 >= '0' && c1 <= '9') && c1 != 'X' && c1 != 'x'){
                return false;
            }
        return true;
    }

    //确认注册时，用户名是否注册正确
    private static boolean checkUsername(String username) {
        //用户名长度必须在3~15位之间
        int len = username.length();
        if(len < 3 || len > 15){
            return false;

        }
        //当代码执行到这里，表示用户名的长度是符合要求的
        //继续校验：只能是字母加数字的组合
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }

        }
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                count++;
                break;
            }
        }
        return count > 0;
        //只能是字母加数字的组合，但是不能为纯数字
    }
    //登录
    //键盘录入用户名，键盘录入密码，键盘录入验证码

    //登录
    private static void login(ArrayList<User> list) {
//        getCode();
        Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名");
            String username = sc.next();
            boolean flag = contain(list,username);
            if(!flag){
                System.out.println("用户名不存在,请先进行注册");
                return;
            }
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码");
            String password = sc.next();
            while (true) {
                String rightCode = getCode();
                System.out.println("验证码为："+rightCode);
                System.out.println("请输入验证码");
                String code = sc.next();
                if(code.equalsIgnoreCase(rightCode)){
                    System.out.println("验证码正确");
                    break;
                }else{
                    System.out.println("验证码错误");
                }
            }
            //封装思想的应用：
            //我们可以吧一些零散的数据，封装成一个对象
            //以后传递参数的时候，只要传递整体就行，不需要管零散的数据
                User userInfo = new User(username,password,null,null);
                boolean flag1 = checkUserInfo(list,userInfo);
                if(flag1){
                    System.out.println("登录成功，可以开始使用学生管理系统了");
                    StudentSystem ss = new StudentSystem();
                    ss.startStudentSystem();

                    break;
                }else{
                    if(i==2){
                        System.out.println("当前账号"+username+"已被锁定");
                        return;
                    }else{
                        System.out.println("登录失败，用户名或者密码错误,您还有"+(2-i)+"次机会");
                    }
                }
        }

    }

    //确定用户登陆时账号密码是否正确
    private static boolean checkUserInfo(ArrayList<User> list, User userInfo) {
        for(User user: list){
            if(user.getUsername().equals(userInfo.getUsername()) && user.getPassword().equals(userInfo.getPassword())){
                return true;
            }
        }
        return false;
    }

    //判断用户名是否存在
    private static boolean contain(ArrayList<User> list, String username){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String name = user.getUsername();
            if (name.equals(username)) {
                return true;
            }
        }
        return false;
    }
    //获取验证码
    private static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i <26; i++)
        {
            list.add((char)('a' + i));
            list.add((char)('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }
        int num = r.nextInt(10);
        sb.append(num);
        char[] chars = sb.toString().toCharArray();
        int randomIndex = r.nextInt(chars.length);
        char temp = chars[randomIndex];
        chars[randomIndex] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;
        return new String(chars);
    }

}
